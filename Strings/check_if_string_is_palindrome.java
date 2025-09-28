/*
Test Case 1
Input: "madam"
Output: Palindrome (reads the same forward and backward)

Test Case 2
Input: "racecar"
Output: Palindrome

Test Case 3
Input: "hello"
Output: Not Palindrome

Test Case 4
Input: "a"
Output: Palindrome (single character is always palindrome)

Test Case 5
Input: ""
Output: Palindrome (empty string is considered palindrome)

Test Case 6
Input: "abba"
Output: Palindrome (even length palindrome)

Test Case 7
Input: "abcba"
Output: Palindrome (odd length palindrome)

Test Case 8
Input: "Palindrome"
Output: Not Palindrome (case-sensitive check)

Test Case 9 (Case Insensitive Check if implemented)
Input: "Madam"
Output: Palindrome (if ignoring case)

Test Case 10 (With spaces)
Input: "nurses run"
Output: Palindrome (if ignoring spaces)
*/

package Strings;

import java.util.Scanner;

public class check_if_string_is_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String n = sc.nextLine();

        if(n.length() == 0){
            System.out.println("Empty String is always palindrom");
        }
        if(n.length() == 1){
            System.out.println("Single charcter strings always palindrom");
        }

        if(isPalindrom(n)){
            System.out.println("The given sentence is palindrom");
        }
        else{
            System.out.println("The given sentence is not palindrom");
        }
    }

    public static boolean isPalindrom(String n) {
        n = n.toLowerCase();
        int i = 0;
        int j = n.length() - 1;

        while(i < j){
            if(n.charAt(i) != n.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
