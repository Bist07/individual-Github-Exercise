package com.example;

import java.util.Scanner;
//new new comment for recording 11111
public class getnumber {

    public static void main(String[] args) {
        //create a new scanner object
        Scanner reader = new Scanner(System.in);

        //prompt user for a number
        System.out.print("Enter a number: ");
        //store the number in a variable
        int num = reader.nextInt();

        //close scanner
        reader.close();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
      
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
         
             if (num % i == 0) {
                prime = true;
                break;
            }
        }
          
        if (!prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }

}
