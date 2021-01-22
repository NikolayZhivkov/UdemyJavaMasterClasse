package Udemy.learProgramming;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B  = scanner.next();
        String output = "No";


        System.out.println("The sum of the lengths is : " + (A.length() + B.length()));
        if(A.compareTo(B)>0){
            output = "Yes";
        }

        System.out.println(output);

        System.out.println(A.substring(0,1).toUpperCase() + "" + A.substring(1) + " " +B.substring(0,1).toUpperCase() + "" + B.substring(1));



    }
}
