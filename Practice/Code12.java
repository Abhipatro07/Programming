/*
 An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.
Example 1:

Input: n = 10
Output: 12
Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 */
package Practice;

import java.util.*;
import java.util.Scanner;

public class Code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the uugly number in that position: ");
        int n = sc.nextInt();

        int otput = uglyNumber(n);

        System.out.println("The Expected Output is: " + otput);
    }

    public static int uglyNumber(int n) {
        int count = 0; 
        int num = 1;   

        while (true) {
            if (isUgly(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }

    }

    public static boolean isUgly(int num) {
        if(num <=1){
            return false;
        }

        if(num%2 == 0 || num%3 == 0 || num%5 == 0){
            return true;
        }

        return false;
    }
}
