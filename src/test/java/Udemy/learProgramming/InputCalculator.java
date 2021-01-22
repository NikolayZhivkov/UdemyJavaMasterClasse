package Udemy.learProgramming;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avgSum = 0;
        int count = 0;

        while (true){

            System.out.println("Enter number : ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count++;
                sum += number;
                avgSum = sum / count;
            }else
            {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avgSum);
        scanner.close();
    }
}
