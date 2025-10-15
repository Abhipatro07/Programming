/*
Test Cases for reverse_words_in_string:

1. Input: "Hello World"
   Expected Output: "World Hello"
   Explanation: The words are reversed, but letters in each word remain the same.

2. Input: "Java is fun"
   Expected Output: "fun is Java"
   Explanation: The order of words is reversed.

3. Input: "  OpenAI  ChatGPT  "
   Expected Output: "ChatGPT OpenAI"
   Explanation: Extra spaces at the beginning or end are removed; words are reversed cleanly.

4. Input: "one two three four"
   Expected Output: "four three two one"
   Explanation: Words are reversed in order.

5. Input: "I love programming"
   Expected Output: "programming love I"
   Explanation: Reverse the sequence of words.

6. Input: "a b c d e"
   Expected Output: "e d c b a"
   Explanation: Works with single-letter words as well.

7. Input: "hello"
   Expected Output: "hello"
   Explanation: Only one word → remains the same.

8. Input: ""
   Expected Output: ""
   Explanation: Empty string → returns empty string.

9. Input: "This   is   spaced"
   Expected Output: "spaced is This"
   Explanation: Multiple spaces between words are handled properly.

10. Input: "123 456 789"
    Expected Output: "789 456 123"
    Explanation: Works with numbers or alphanumeric strings as well.
*/

package Strings;

import java.util.Scanner;

public class reverse_words_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        String res = "";

        for(int i = words.length-1;i>=0;i--){
            res = res + words[i];
            if (i != 0) {
                res += " "; // add space between words
            }
        }
        System.out.println("The expected output is: " + res);
    }
}
