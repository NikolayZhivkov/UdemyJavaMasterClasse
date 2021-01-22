package Udemy.Section5.SwitchCase;

import java.util.Scanner;

public class EX73 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            int age  = 2021 - yearOfBirth;

            if (age >= 0 && age<=100){
                System.out.println("Your name is " + name + " and your are " + age + " years old");
            }else{
                System.out.println("Invalid year of birth!");
            }
        }else {
            System.out.println("Enable to parse year of birht!");
        }

        scanner.close();
    }


}
