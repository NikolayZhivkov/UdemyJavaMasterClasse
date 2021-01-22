package Udemy.Section5.SwitchCase;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number){

        if(number < 0){

            return -1;
        }
        int finalNumber = 0;

        while (number > 0){
            if (((number%10)%2)==0){
                finalNumber+=number%10;
            }
            number/=10;
        }
        return finalNumber;

    }
}
