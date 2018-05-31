package com.company;

import java.util.Scanner;

public class Question {

    public static void main( String[]args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print( "First temperature? " );
        num1 = input.nextInt();

        System.out.print( "Second temperature? " );
        num2 = input.nextInt();

        System.out.println("The max value is : " + Math.max(num1, num2));
    }
}