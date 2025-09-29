/*
Test Case 1 (Simple sentence)
Input: "I love programming"
Output: "programming"

Test Case 2 (Multiple words of same max length)
Input: "Java code easy"
Output: "Java"   // First word with max length is returned

Test Case 3 (Single word)
Input: "Hello"
Output: "Hello"

Test Case 4 (Empty string)
Input: ""
Output: "" or "No words found"

Test Case 5 (String with spaces only)
Input: "     "
Output: "" or "No words found"

Test Case 6 (Special characters included as words)
Input: "Hi @world!!!"
Output: "@world!!!"   // Treated as the longest word

Test Case 7 (Numbers as words)
Input: "12345 678 90"
Output: "12345"

Test Case 8 (Case sensitivity doesn’t matter)
Input: "Apple banana ORANGE"
Output: "banana"

Test Case 9 (Multiple long words, tie case)
Input: "dog cat fish"
Output: "fish"   // fish (4 letters) is longest

Test Case 10 (Sentence with punctuation)
Input: "Coding, debugging, testing."
Output: "debugging,"   // punctuation sticks unless removed explicitly
*/

package Strings;

import java.util.Scanner;

public class find_longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String n = sc.nextLine().trim();

        if(n.isEmpty()){
            System.out.println("No words are there");
        }
        String[] words = n.split("\\s+"); // handles multiple spaces
        if(words.length == 1){
            System.out.println("The longest word is: " + words[0]);
        }

        String logestWord = words[0];

        for(int i = 0;i<=words.length-1;i++){
            if(logestWord.length() < words[i].length()){
                logestWord = words[i];
            }
        }

        System.out.println("The longest Word is: " + logestWord);
    }
}
