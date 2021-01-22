package Udemy.learProgramming;

public class PrintYearsAndDays {

    public static void main(String[] args) {

        printYearsAndDays(-1051200);

    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{

            long days = (minutes % (60 * 24 * 365)) / (60 * 24);
            long years  = minutes / 60 / 24 / 365;


            System.out.println(minutes + " min = " + years + " y" + " and " + days + " d");
        }
    }
}
