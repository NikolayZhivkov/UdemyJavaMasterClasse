package Udemy.learProgramming;


import javax.crypto.spec.PSource;
import java.awt.dnd.DragSource;

public class LeapYearCalculator {
    public static void main(String[] args) {

        getDaysInMonth(-1, 2020);

    }


    public static boolean isLeapYear(int year) {

        if (year <= 0 || year > 9999) {
            System.out.println("Invalide Value");

        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;

    }

    public static int getDaysInMonth(int month, int year) {

        String MonthOfName = "";
        int daysOfMonth = 0;
        if ((month < 1) && (month > 12) || (year < 1) || (year > 9999)) {
            System.out.println(-1);
            return -1;

        }
        switch (month) {
            case 1:
                MonthOfName = "January";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;
            case 2:
                MonthOfName = "February";
                if (isLeapYear(year)) {
                    daysOfMonth = 29;
                    System.out.println(daysOfMonth);
                } else {
                    daysOfMonth = 28;
                    System.out.println(daysOfMonth);
                }
                break;
            case 3:
                MonthOfName = "March";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;
            case 4:
                MonthOfName = "April";
                daysOfMonth = 30;
                System.out.println(daysOfMonth);
                break;
            case 5:
                MonthOfName = "May";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;
            case 6:
                MonthOfName = "June";
                daysOfMonth = 30;
                System.out.println(daysOfMonth);
                break;
            case 7:
                MonthOfName = "July";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;
            case 8:
                MonthOfName = "August";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;
            case 9:
                MonthOfName = "September";
                daysOfMonth = 30;
                System.out.println(daysOfMonth);
                break;
            case 10:
                MonthOfName = "October";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;
            case 11:
                MonthOfName = "November";
                daysOfMonth = 30;
                System.out.println(daysOfMonth);
                break;
            case 12:
                MonthOfName = "December";
                daysOfMonth = 31;
                System.out.println(daysOfMonth);
                break;

            default:
                System.out.println(-1);
                return -1;

        }


        return daysOfMonth;

    }
}




