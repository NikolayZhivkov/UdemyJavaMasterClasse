package Udemy.learProgramming;

import java.util.Scanner;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter a number : ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number  = scanner.nextInt();
                if(number>max){
                    max = number;
                }if (number<min){
                    min=number;
                }
            }else {
                break;
            }
        }
        System.out.println("min = " + min + " max = " + max);
        scanner.close();
    }
}
