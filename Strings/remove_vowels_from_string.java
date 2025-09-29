/*
Test Case 1 (Normal word)
Input: "hello"
Output: "hll"

Test Case 2 (Sentence with spaces)
Input: "I love Java"
Output: " lv Jv"

Test Case 3 (All vowels only)
Input: "aeiouAEIOU"
Output: ""

Test Case 4 (No vowels)
Input: "rhythm"
Output: "rhythm"

Test Case 5 (Case sensitivity check)
Input: "ApPlE"
Output: "pPl"

Test Case 6 (With digits and special characters)
Input: "Java123!@#"
Output: "Jv123!@#"

Test Case 7 (Empty string)
Input: ""
Output: ""

Test Case 8 (Single vowel)
Input: "a"
Output: ""

Test Case 9 (Single consonant)
Input: "b"
Output: "b"

Test Case 10 (Long sentence)
Input: "Programming is fun!"
Output: "Prgrmmng s fn!"
*/

package Strings;

import java.util.Scanner;

public class remove_vowels_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String result = input.replaceAll("[AEIOUaeiou]", "");

        System.out.println("String after removing vowels: " + result);
    }
}
