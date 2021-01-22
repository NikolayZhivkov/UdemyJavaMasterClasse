package Udemy.Section5.SwitchCase;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(10,99,999));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){

        if((a>=10 && a<=1000) && (b>=10 && b<=1000) && (c>=10 && c<=1000)){

           int lastA = a % 10;
           int lastB = b %10;
           int lastC = c % 10;

           if (lastA==lastB || lastA==lastC || lastB == lastC ){
               return true;
           }else{
               return false;
           }
        }
        return false;
    }

    public static boolean isValid(int num){
        if(num>=10 && num <=1000){
            return true;
        }else{
            return false;
        }
    }
}
