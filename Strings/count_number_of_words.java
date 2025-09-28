/*
Test Case 1
Input: "Hello World"
Output: Number of words = 2

Test Case 2
Input: "Java programming is fun"
Output: Number of words = 4

Test Case 3
Input: "   Leading and trailing spaces   "
Output: Number of words = 4

Test Case 4
Input: "Multiple     spaces between words"
Output: Number of words = 4

Test Case 5
Input: ""
Output: Number of words = 0

Test Case 6
Input: "SingleWord"
Output: Number of words = 1

Test Case 7
Input: " Line\nBreaks\tand tabs"
Output: Number of words = 4

Test Case 8 (Special characters)
Input: "Hello, world! How are you?"
Output: Number of words = 5

Test Case 9 (Only spaces)
Input: "     "
Output: Number of words = 0

Test Case 10 (Mix of letters and numbers)
Input: "Java 101 is easy"
Output: Number of words = 4
*/

package Strings;

import java.util.Scanner;

public class count_number_of_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        // Trim leading/trailing spaces and split by one or more whitespace characters
        String[] words = input.trim().split("\\s+");

        int wordCount = 0;

        // Handle the empty string case
        if (input.trim().isEmpty()) {
            wordCount = 0;
        } else {
            wordCount = words.length;
        }

        System.out.println("Number of words = " + wordCount);
    }
}
