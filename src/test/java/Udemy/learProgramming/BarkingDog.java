package Udemy.learProgramming;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if(barking == false && hourOfTheDay < 8 || hourOfTheDay > 23){
            return false;
        }else if(barking==true && hourOfTheDay > 22 && hourOfTheDay <= 23){
            return true;
        }else if(barking == true && hourOfTheDay >= 0 && hourOfTheDay <8){
            return true;
        }else return false;
    }
}
