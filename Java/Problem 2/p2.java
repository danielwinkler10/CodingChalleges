/*
 * Daniel Winkler
 * ---
 * Given a list of numbers and a number k, return whether any two numbers from the list can add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
*/

import java.util.Scanner;
import java.util.HashSet;

class p2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program takes in x integers, and a key value. Then it checks whether any combination of 2 numbers from the given integers can add up to the key value.");
        System.out.println("How many integers are there in the array?");

        //Getting the integers
        int arrSize = scan.nextInt();
        System.out.println("Enter the values");

        //Initializing the array
        int[] arr = new int[arrSize];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        // Getting the key value
        System.out.println("Enter the K value");
        int keyValue = scan.nextInt();
        
        //Calling the solve method
        //System.out.println(solveTwoLoop(arr, keyValue));
        System.out.println(solveOneLoop(arr, keyValue));

        //Closing the scanner
        scan.close();
    }

    // Simple way to solve this problem, nested for loop.
    static boolean solveTwoLoops(int[] arr, int value){
        for(int i=0;i<arr.length; i++){
            int temp = value - arr[i];
            for(int k=0; k<arr.length; k++){
                if(k != i && temp == arr[k]){
                    return true;
                }
            }
        }
        return false;
    }

    // Better way to solve this problem, only one iteration.
    static boolean solveOneLoop(int[] arr, int value){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int temp = value - arr[i];
            if(set.contains(arr[i])){
                return true;
            } else if(i == arr.length-1){
                return false;
            } else{
                set.add(value - arr[i]);
            }
        }
        return false;
    }
}