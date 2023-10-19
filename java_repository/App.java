package com.qa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

//FIRST TASK
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        String firstName="Inda", lastName=" Fernandez";
//        String name = firstName + lastName;
//        System.out.println(name);
//        float num1=1, num2=2;
//        float result = num1/num2;
//        System.out.println(result);
//        int num3 = 8;
//        num3++;
//        ++num3;
//        System.out.println(num3);
//YOU CREATE AN INSTANCE OF CLASS SCANNER AND IS TAKING INPUT FROM THE SYSTEM
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
//        YOU ARE ASSIGNING THE INPUT TO A STRING VARIABLE AND YOU ARE SAYING THAT THE COMPUTER WILL WAIT UNTIL THE INPUT IS GIVEN
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("Hello "+ firstName + " "+ lastName);
        System.out.println("And what is your age?");
//        THIS IS THE SAME BUT WITH INT
        int age = input.nextInt();
        System.out.println(age + "???!!! Whattt, you old bruv");
    }
}

//SECOND TASK

