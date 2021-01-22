package Udemy.Section5.SwitchCase;

public class SharedDigits {

    public static void main(String[] args) {

        System.out.println(hasSharedDigits(10, 99));
    }

    public static boolean hasSharedDigits(int num1, int num2) {

        if ((num1<10)||(num1>99)||(num2<10)||(num2>99)){
            return false;
        }


            boolean answer = false;

            int leftNum1 = num1 / 10;
            int rightNum1 = num1 % 10;
            int leftNum2 = num2 / 10;
            int rightNum2 = num2 % 10;


            if (leftNum1 == leftNum2 || leftNum1 == rightNum2 || rightNum1 == leftNum1 || rightNum1 == leftNum2) {
                answer = true;
            }

            return answer;
        }

    }

