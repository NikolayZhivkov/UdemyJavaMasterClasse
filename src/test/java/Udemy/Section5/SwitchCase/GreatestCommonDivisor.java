package Udemy.Section5.SwitchCase;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12,30));

    }

    public static int getGreatestCommonDivisor(int a, int b){



        if (a<10 || b<10){
            return -1;
        }
        int greatCommonDivisor = 1;
        for (int i = 1; i <=a && i<=b ; i++) {

            if (a%i==0 && b%i==0)
                greatCommonDivisor=i;
            
        }
        return greatCommonDivisor;
    }

}
