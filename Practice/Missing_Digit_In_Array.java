/*
 the function Missingbigieil str

take the str parameter, which will be a simple mathematical formula with three numbers, a single operator (+, -, *, or /) 
and an equal sign (=) and return the two digits that complete the equation. 
In two of the numbers in the equation, there will be a single? character, and your program should determine 
what digits are missing and return them separated by a space. For example, if str is "3875*3 = 17595" then your 
program should output 6 1.

The? character will always appear in both the first number and the last number in the mathematical expression. 
There will always be a unique solution.

Examples

Input: "56? * 106 = 5?678"

Output: 3 9

Input: "18?1 + 9-189?"

Output: 8 0
 */
package Practice;

import java.util.Scanner;

public class Missing_Digit_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number String you want to execute: ");
        String str = sc.nextLine();

        String res = missingDigit(str);
        System.out.println("The expected output is: " + res);
    }

    public static String missingDigit(String str) {
        str = str.replace(" ","");

        String[] parts = str.split("=");
        String left = parts[0];
        String right = parts[1];

        char operator = 0;
        if(left.contains("+")){
            operator = '+';
        }
        else if(left.contains("-")){
            operator = '-';
        }
        else if(left.contains("*")){
            operator = '*';
        }
        else if(left.contains("/")){
            operator = '/';
        }

        // Split left side into two operands
        String[] operands = left.split("[" + "\\" + operator + "]");
        String num1 = operands[0];
        String num2 = operands[1];
        String num3 = right;

        // Try all digit pairs (0–9 for both missing digits)
        for (int d1 = 0; d1 <= 9; d1++) {
            for (int d2 = 0; d2 <= 9; d2++) {
                // Replace '?' in first and last numbers
                long n1 = Long.parseLong(num1.replace("?", String.valueOf(d1)));
                long n2 = Long.parseLong(num2);
                long n3 = Long.parseLong(num3.replace("?", String.valueOf(d2)));

                boolean valid = false;

                // Check which operation applies
                switch (operator) {
                    case '+': valid = (n1 + n2 == n3); break;
                    case '-': valid = (n1 - n2 == n3); break;
                    case '*': valid = (n1 * n2 == n3); break;
                    case '/': valid = (n2 != 0 && n1 / n2 == n3 && n1 % n2 == 0); break;
                }

                if (valid) {
                    return d1 + " " + d2;
                }
            }
        }

        return "No solution";
    }
}
