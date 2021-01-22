package Udemy.Section5.SwitchCase;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        sumFirstAndLastDigitSum(5);
    }

    public static int sumFirstAndLastDigitSum(int number){

        if(number<0){
            System.out.println(-1);
            return -1;
        }

        int firstDigit, lastDigit, sum;
        firstDigit = number;

        for (int i = 0; i < number ; i++) {



            while (firstDigit >= 10){
                firstDigit = firstDigit / 10;
            }

        }
        lastDigit = number % 10;
        sum = firstDigit + lastDigit;

        System.out.println(sum);
        return sum;
    }

}
