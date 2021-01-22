package Udemy.Section5.SwitchCase;

public class NumberPalindrome {

    public static void main(String[] args) {

        isPalindrome(121);
    }

    public static boolean isPalindrome(int number){

        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;

  }
}
