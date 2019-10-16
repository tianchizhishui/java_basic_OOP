package com.company;

public class Main {

    public static void main(String[] args) {
    double newcentimers = calcFeetAndInchesToCentimeters(0,6);
        System.out.println(newcentimers);

        calcFeetAndInchesToCentimeters(-10 );




    }





    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches >12)) {
            System.out.println("invalid feet and inches input");
            return -1;
        }
        double centimers = (feet * 12) * 2.54;
        centimers += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimers + " cm");
        return centimers;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
