/*
Test Cases for remove_spaces_from_string:

1. Input: "Hello World"
   Expected Output: "HelloWorld"
   Explanation: Removes the single space between “Hello” and “World”.

2. Input: "  Leading spaces"
   Expected Output: "Leadingspaces"
   Explanation: Removes spaces before the first word.

3. Input: "Trailing spaces  "
   Expected Output: "Trailingspaces"
   Explanation: Removes spaces after the last word.

4. Input: "  Both  sides  "
   Expected Output: "Bothsides"
   Explanation: Removes spaces from the start, end, and between words.

5. Input: "Multiple   spaces   between   words"
   Expected Output: "Multiplespacesbetweenwords"
   Explanation: Multiple consecutive spaces between words are all removed.

6. Input: "NoSpacesHere"
   Expected Output: "NoSpacesHere"
   Explanation: No spaces present, so the string remains unchanged.

7. Input: "    "
   Expected Output: ""
   Explanation: The string only contains spaces, so the result is an empty string.

8. Input: " A  B C   D  "
   Expected Output: "ABCD"
   Explanation: Removes all spaces, leaving only letters.

9. Input: "Hello   World   123"
   Expected Output: "HelloWorld123"
   Explanation: Removes all spaces, keeping letters and digits.

10. Input: ""
    Expected Output: ""
    Explanation: Empty string → no spaces to remove.
*/

package Strings;

import java.util.Scanner;

public class remove_spaces_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("The given string after removing of the spaces from that: " + str.replaceAll(" ", ""));
    }
}
