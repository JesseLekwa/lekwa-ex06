/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 jesse lekwa
 */


package exercise19;

import java.util.Scanner;

public class solution19 {
    public static void main (String[] args)
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Height in Inches- ");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in pounds- ");
        double weight = sc.nextDouble();




        double BMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f",BMI));


        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range");
        }
        else if(BMI >25){
            System.out.println("You are Overweight, You should see your doctor");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight, You should consult with your doctor");
        }
    }

}