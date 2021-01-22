package Udemy.Section5.SwitchCase;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class DiagonalStar {

    public static void main(String[] args) {

       printSquareStar(2);

    }

    public static void printSquareStar(int number){

        int i,j,k;

        while (number <= 5){
            System.out.println("Invalid Value");
            break;
        }

        for ( i = number; i >= 1 ; i--) {

            System.out.println("*");
            //System.out.println("*" + "*");
            for ( j = number; j > i ; j--) {
                System.out.print(" ");
            }
            for ( k = number; k <(i*2) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
