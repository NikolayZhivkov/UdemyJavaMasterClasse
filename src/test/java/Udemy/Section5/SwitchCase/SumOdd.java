package Udemy.Section5.SwitchCase;

public class SumOdd {

public static void main(String[] args) {
    System.out.println(sumOdd(1,11));
    System.out.println(sumOdd(1, 100));
    System.out.println(sumOdd(-1, 100));
    System.out.println(sumOdd(100, 100));
    System.out.println(sumOdd(100, -100));
    System.out.println(sumOdd(100, 1000));
}
    public static boolean isOdd(int number) {
        if(number < 0){
            return false;
        }
        else if (number % 2 == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    public static int sumOdd(int start, int end){
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        else{
            boolean numTest = false;
            int oddSum = 0;
            for (int n = start; n < end; n++) {
                numTest = isOdd(n);
                if (numTest) {
                    oddSum += n;
                }
            }
            return oddSum;
        }
    }
}
