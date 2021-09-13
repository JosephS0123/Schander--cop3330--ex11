/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;


public class App
{

    public static void main( String[] args )
    {
        DecimalFormat DF = new DecimalFormat("##.##");
        Scanner uInput = new Scanner(System.in);
        System.out.println( "How many euros are you exchanging?");
        int euros = uInput.nextInt();
        System.out.println(" What is the exchange rate?");
        double rate = uInput.nextDouble();
        double total = (euros * rate);


        System.out.println(euros +" euros at an exchange rate of " + rate + " is " + DF.format(total) + " USD");
    }
}
