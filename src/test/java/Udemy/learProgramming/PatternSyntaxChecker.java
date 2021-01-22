package Udemy.learProgramming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while (testCases > 0) {
//            String pattern = in.nextLine();
//            String text = in.nextLine();
//
//
//            Pattern pattern1 = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
//            Matcher matcher = pattern1.matcher(pattern);
//            boolean matches = matcher.matches();
//            if(matches==true){
//                System.out.println("Valid");
//            }
//            System.out.println("Invalid");
//
//            //Write your code
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
        }
    }

