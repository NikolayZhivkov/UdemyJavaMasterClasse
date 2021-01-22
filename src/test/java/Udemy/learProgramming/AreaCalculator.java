package Udemy.learProgramming;

public class AreaCalculator {

    public static void main(String[] args) {

        area(-1);
        area(5.0,4.0);
        area(-1.0,4.0);

    }

        public static double area(double radius){
        if(radius<0){
            System.out.println("Invalid value");
            return -1;
        }

        double areaCircle = radius * radius * Math.PI;
            System.out.println(areaCircle);
            return areaCircle;
        }

    public static double area(double x, double y){
        if((x<0) || (y<0)){
            System.out.println("Invalid value");
            return -1;
        }
        System.out.println(x*y);
        return x * y;
    }
}
