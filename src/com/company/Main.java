package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double iVelocity = 0.0;
        double acc = -9.81;
        double Time = 10.0;
        double iPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = 0.5 * acc * Time * Time + iVelocity * Time + iPosition;
        System.out.println("The object's position after " + Time +
                " seconds is " + finalPosition + " m.");
    }
}
