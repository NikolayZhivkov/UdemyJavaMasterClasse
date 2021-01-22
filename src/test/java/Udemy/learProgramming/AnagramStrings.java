package Udemy.learProgramming;

import java.util.Scanner;

public class AnagramStrings {

    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        int[] aarr = new int[91];
        int[] bbrr = new int[91];

        if (ac.length == bc.length) {
            for (int i = 0; i < ac.length; i++) {
                aarr[ac[i]]++;
            }
            for (int i = 0; i < bc.length; i++) {
                bbrr[bc[i]]++;
            }

            int f = 0;

            for (int i = 0; i < ac.length; i++) {

                if (aarr[ac[i]] != bbrr[ac[i]]) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) return true;
            else return false;

        } else return (false);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}


