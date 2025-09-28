/*
Test Case 1
Input: "Hello World"
Output:
Vowels = 3 
Consonants = 7 

Test Case 2
Input: "Programming"
Output:
Vowels = 3 
Consonants = 8 

Test Case 3
Input: "AEIOU"
Output:
Vowels = 5 
Consonants = 0

Test Case 4
Input: "bcdfghjklmnpqrstvwxyz"
Output:
Vowels = 0
Consonants = 21

Test Case 5
Input: "Java 123"
Output:
Vowels = 2 
Consonants = 2 

Test Case 6
Input: ""
Output:
Vowels = 0
Consonants = 0

Test Case 7
Input: "Python Programming!"
Output:
Vowels = 4 
Consonants = 13 

Test Case 8
Input: "a e i o u"
Output:
Vowels = 5
Consonants = 0

Test Case 9 (Case sensitivity)
Input: "AeIoUxyz"
Output:
Vowels = 5 
Consonants = 3 

Test Case 10 (Special characters)
Input: "@#Hello123!"
Output:
Vowels = 2 
Consonants = 3 
*/

package Strings;

import java.util.Scanner;

public class count_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Only consider alphabetic characters
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // Convert to lowercase for easy comparison
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("The number of vowels used in the sentence is: " + vowels);
        System.out.println("The number of consonants used in the sentence is: " + consonants);
    }
}
