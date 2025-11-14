/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
 */
package Practice;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int x = findUnitDigiti(n);
        System.out.println("The unit digit of the number is: " + x);
    }

    public static int findUnitDigiti(int n) {
        int temp = n;
        int sum = 0;

        while(temp != 0){
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        if(sum > 9){
            int res = findUnitDigiti(sum);
            return res;
        }
        else{
            return sum;
        }
    }
}
