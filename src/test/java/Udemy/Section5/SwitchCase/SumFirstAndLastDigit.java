package Udemy.Section5.SwitchCase;

public class SumFirstAndLastDigit {

    public static void main(String[] args) {

        sumFirstAndLastDigit(-5);
    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0){
            System.out.println(-1);
            return -1;
        }

        int firstDigit, lastDigit , sum;

        firstDigit = number;

        while (firstDigit >=10){
            firstDigit = firstDigit / 10;
        }

        lastDigit = number % 10;

        sum = firstDigit + lastDigit;

        System.out.println(sum);
        return sum;




    }
}
