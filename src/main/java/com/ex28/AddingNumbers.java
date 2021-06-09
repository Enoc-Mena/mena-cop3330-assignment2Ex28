/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex28;
import java.util.Scanner;

public class AddingNumbers {

    static void addingNumbers() {

        int userIn;
        int sum = 0;
        int i = 0;

        while(i < 5) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            userIn = input.nextInt();

            sum += userIn;
            i++;

        }
        
        System.out.println("");
        System.out.print("The total is: " + sum);
        System.out.println("");

    }

    public static void main(String[] args) {

        //Call method
        addingNumbers();

    }

}
