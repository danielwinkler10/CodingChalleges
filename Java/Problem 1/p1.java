/*
 * Daniel Winkler
 * 1/22/2020
 * Fibonacci Sequence Using Recursion
*/

import java.util.Scanner; 
import java.util.ArrayList;

class p1{
    public static void main(String args[]) {
        //Get the amount of Fibonacci numbers
        Scanner scn = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers?");
        int number = scn.nextInt();

        //Printing the results
        System.out.println("Fibonacci series of " + number + " numbers -");
        for (int i = 1; i <= number; i++) {
            System.out.println(fibonacci(i));
        }
    }

    //Recursion to find the fibonacci numbers, (fibnum(x) = fibnum(x-1) + fubnum(x-2))
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacci(number-1) + fibonacci(number-2); //tail recursion
    }

}