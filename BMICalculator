package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        float heightGaldarov, weightGaldarov, bmiGaldarov;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate Peoples BMI value");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightGaldarov = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight (and press Enter): ");
        weightGaldarov = Float.parseFloat(br.readLine());

        bmiGaldarov = (float) (weightGaldarov / (Math.pow(heightGaldarov,2)));
        System.out.printf("Your BMI is:" + "$2.2f, \n", bmiGaldarov);

        if (bmiGaldarov < 16 ){
            System.out.println("You are starving");
        }else if ((bmiGaldarov >= 16)&&(bmiGaldarov < 16.99))
        {
            System.out.println("emaciated");
        }else if ((bmiGaldarov >= 17)&&(bmiGaldarov < 18.49)){
            System.out.println(" you are underweight");
        }else if ((bmiGaldarov >= 18.50)&&(bmiGaldarov < 22.99)){
            System.out.println(" You are on the lower range of the norm");
        }else if ((bmiGaldarov >= 23)&&(bmiGaldarov < 24.99)){
            System.out.println(" You are in the high range of the norm ");
        }else if ((bmiGaldarov >= 25)&&(bmiGaldarov < 27.49)){
            System.out.println("You overweight (pre-obese)");
        } else if ((bmiGaldarov >= 27.50)&&(bmiGaldarov < 29.99)){
            System.out.println("You are overweight");
        } else if ((bmiGaldarov >= 30)&&(bmiGaldarov < 34.99)){
            System.out.println("Your have 1st degree obesity");
        } else if ((bmiGaldarov >= 34.50)&&(bmiGaldarov < 39.99)){
            System.out.println("You have second degree obesity");
        } else if ((bmiGaldarov > 40)){
            System.out.println("You have 3rd degree obesity");
        }
    }
}
