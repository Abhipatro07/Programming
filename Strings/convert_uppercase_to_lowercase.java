/*
Test Case 1
Input: "HELLO WORLD"
Output: "hello world"

Test Case 2
Input: "Java Programming"
Output: "java programming"

Test Case 3
Input: "123ABC"
Output: "123abc"   // numbers stay same, only letters converted

Test Case 4
Input: "already lowercase"
Output: "already lowercase"   // no change

Test Case 5
Input: "MiXeD CaSe"
Output: "mixed case"   // converts everything to lowercase

Test Case 6
Input: "   SPACES   "
Output: "   spaces   "   // spaces preserved

Test Case 7
Input: ""
Output: ""   // empty string remains empty

Test Case 8
Input: "SPECIAL@#CHARS!"
Output: "special@#chars!"   // special characters unchanged

Test Case 9 (Single character)
Input: "A"
Output: "a"

Test Case 10 (Sentence with punctuation)
Input: "HELLO, WORLD!"
Output: "hello, world!"
*/

package Strings;

import java.util.Scanner;

public class convert_uppercase_to_lowercase {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");        
        String n = sc.nextLine();
        System.out.println("Converting the Upper case to Lower case: ");
        System.out.println(n.toLowerCase());
    }
}
