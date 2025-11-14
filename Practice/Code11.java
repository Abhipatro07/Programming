/*
 Given an integer x, return true if x is a 
palindrome , and false otherwise. Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
package Practice;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isPalindorm(n)){
            System.out.println("The given number is palindrom");
        }
        else{
            System.out.println("It is not a palindrom");
        }
    }

    public static boolean isPalindorm(int n) {
        int temp = n;
        int num = 0;

        while(temp != 0){
            int rem = temp % 10;
            num = num * 10 + rem;
            temp /= 10;
        }

        if(num == n){
            return true;
        }
        else{
            return false;
        }
    }
}
