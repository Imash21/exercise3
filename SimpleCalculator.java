package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        float firstNumberGaldarov, secondNumberGaldarov, sum, substraction, product, quotient;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("The program calculate the sum, Difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (and press enter): ");
        firstNumberGaldarov = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press enter): ");
        secondNumberGaldarov = Float.parseFloat(br.readLine());

        sum = firstNumberGaldarov + secondNumberGaldarov;
        substraction = firstNumberGaldarov - secondNumberGaldarov;
        product = firstNumberGaldarov * secondNumberGaldarov;
        quotient = firstNumberGaldarov / secondNumberGaldarov;

        System.out.printf("You entered two numbers the first is:" + "52.2f", firstNumberGaldarov );
        System.out.printf(" and the second is:" + "%2.2f" , secondNumberGaldarov);

        System.out.println();
        System.out.printf("Sum = "+ "%2.2f, \n", sum );
        System.out.printf("Difference = "+ "%2.2f, \n", substraction );
        System.out.printf("product = "+ "%2.2f, \n", product );
        System.out.printf("Quotient = "+ "%2.2f, \n", quotient );
    }
}
