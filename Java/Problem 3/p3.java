/*
 * Daniel Winkler
 * ---
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
*/

import java.util.Scanner;

class p3{
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
        solveDivision(arr);
        //Closing the scanner
        scan.close();
    }
    // [1,2,3] -> [6, 3, 2]
    static int[] solveDivision(int[] arr){
        int[] solution = new int[arr.length];
        int total = 1;
        for(int i = 0; i < arr.length; i++){
            total *= arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            solution[i] = (total / arr[i]);
            System.out.print(solution[i] + " ");
        }
        return solution;
    }

}