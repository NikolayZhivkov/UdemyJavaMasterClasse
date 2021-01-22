package Udemy.Section5.SwitchCase;

public class LargestPrime {

    public static void main(String[] args) {

        getTheLargestPrime(16);
    }

    public static int getTheLargestPrime(int number){

        if (number <= 0 || number <= 1 ){
            System.out.println(-1);
            return -1;
        }

        int largestPrime = -1;

        while (number % 2 == 0){
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= number; i ++) {

            while (number % i == 0){
                largestPrime=i;
                number = number / i;

            }
        }
        if (number > 2)
            largestPrime = number;
        System.out.println(largestPrime);
        return largestPrime;
    }
}
