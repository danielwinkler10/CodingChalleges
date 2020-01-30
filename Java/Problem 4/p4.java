/*
 * Daniel Winkler
 * ---
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
*/

import java.util.Scanner;
import java.util.Arrays;

class p4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers are there in the array?");

        //Getting the integers
        int arrSize = scan.nextInt();
        System.out.println("Enter the values");

        //Initializing the array
        int[] arr = new int[arrSize];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        //Sorting the array
        Arrays.sort(arr);

        //Calling the solve method
        System.out.println(solve(arr));

    }

    static int solve(int[] arr){   

        //If the array is empty return 0;
        if(arr.length == 0){
            return 0;
        } else {
            //Loop through the array and check if the difference between the integers is bigger than 1.
            //If the difference is bigger than one, and the integer is bigger than 0 (we are looking for a positive integer).
            //Then we found the missing integer.
            for(int i=0; i<arr.length - 1 ;i++){
                if (arr[i+1] - arr[i] > 1 && arr[i] >= 0){
                    return arr[i] + 1;
                } 
            }
        } 
        //If there are no missing numbers in the series, print the next number in the series.
        return arr[arr.length - 1] + 1;
    }
}