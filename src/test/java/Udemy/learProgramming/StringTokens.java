package Udemy.learProgramming;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer st = new StringTokenizer(s , ", ! ? \n \r ' | @ # % ^ & * . _  ");


        int count = st.countTokens();


        for (int i = 0; i <st.countTokens() ; i++) {
            System.out.println(count ++);
            break;
        }

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
