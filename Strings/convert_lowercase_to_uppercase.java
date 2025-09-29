/*
Test Case 1
Input: "hello world"
Output: "HELLO WORLD"

Test Case 2
Input: "Java Programming"
Output: "JAVA PROGRAMMING"

Test Case 3
Input: "123abc"
Output: "123ABC"   // numbers stay same, only letters converted

Test Case 4
Input: "ALLCAPS"
Output: "ALLCAPS"   // already uppercase, no change

Test Case 5
Input: "mixED CaSe"
Output: "MIXED CASE"   // converts all to uppercase

Test Case 6
Input: "   spaces   "
Output: "   SPACES   "   // spaces preserved

Test Case 7
Input: ""
Output: ""   // empty string remains empty

Test Case 8
Input: "special@#chars!"
Output: "SPECIAL@#CHARS!"   // special chars unchanged

Test Case 9 (Single character)
Input: "a"
Output: "A"

Test Case 10 (Sentence with punctuation)
Input: "hello, world!"
Output: "HELLO, WORLD!"
*/

package Strings;

import java.util.Scanner;

public class convert_lowercase_to_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");        
        String n = sc.nextLine();
        System.out.println("Converting the Lower case to Upper case: ");
        System.out.println(n.toUpperCase());
    }
}
