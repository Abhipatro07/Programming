/*
Test Cases for find_last_repeated_character:

1. Input: "programming"
   Expected Output: 'g'
   Explanation: Repeated characters are 'r', 'g', and 'm'; the last one that repeats is 'g'.

2. Input: "hello"
   Expected Output: 'l'
   Explanation: 'l' is the only repeated character.

3. Input: "abcdef"
   Expected Output: 'None'
   Explanation: No character repeats.

4. Input: "aabbcc"
   Expected Output: 'c'
   Explanation: 'a', 'b', and 'c' all repeat; last one is 'c'.

5. Input: "aA"
   Expected Output: 'None'
   Explanation: Case-sensitive comparison → 'a' and 'A' are different.

6. Input: "mississippi"
   Expected Output: 'i'
   Explanation: Repeated characters: 's', 'i', 'p'; the last one that repeats is 'i'.

7. Input: "abcabc"
   Expected Output: 'c'
   Explanation: Each character repeats, last one is 'c'.

8. Input: "12345123"
   Expected Output: '3'
   Explanation: Digits repeat; last one is '3'.

9. Input: " "
   Expected Output: 'None'
   Explanation: Single space → no repetition.

10. Input: ""
    Expected Output: 'None'
    Explanation: Empty string → no repeated characters.

11. Input: "xyzz"
    Expected Output: 'z'
    Explanation: 'z' is the last repeated character.

12. Input: "abca"
    Expected Output: 'a'
    Explanation: 'a' repeats at the start and end.
*/

package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class find_last_repeated_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
       char result = 0;
        boolean found = false;

        // Traverse from right to left to find the last repeated character
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                result = c;
                found = true;
                break; // Stop at the first repeated from right side
            }
            set.add(c);
        }

        if (found)
            System.out.println("The last repeated character of the string: " + result);
        else
            System.out.println("No repeated characters found.");
    }
}
