
/*
Test Cases for find_last_non_repeating_character:

1. Input: "swiss"
   Expected Output: w
   Explanation: Non-repeating characters → [w, i]; last one is 'w'.

2. Input: "aabbcde"
   Expected Output: e
   Explanation: Non-repeating characters → [c, d, e]; last is 'e'.

3. Input: "aabbcc"
   Expected Output: -1
   Explanation: All characters repeat → no non-repeating character.

4. Input: "abacabad"
   Expected Output: d
   Explanation: Non-repeating → [c, d]; last one is 'd'.

5. Input: "xxyz"
   Expected Output: z
   Explanation: Non-repeating → [z]; last is 'z'.

6. Input: "aA"
   Expected Output: A
   Explanation: Case-sensitive → 'a' and 'A' are different, last unique is 'A'.

7. Input: "abcabcde"
   Expected Output: e
   Explanation: Non-repeating → [d, e]; last is 'e'.

8. Input: "123451234"
   Expected Output: 5
   Explanation: Non-repeating → [5]; last one is '5'.

9. Input: "@@!!$$%"
   Expected Output: %
   Explanation: '%' appears once at the end.

10. Input: ""
    Expected Output: -1
    Explanation: Empty string → no characters to process.
*/

package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class find_last_non_repeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // Use LinkedHashMap to preserve insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Traverse from end to find the last non-repeating character
        char result = '\0';
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                result = ch;
                break;
            }
        }

        // Display result
        if (result != '\0') {
            System.out.println("The last non-repeating character is: " + result);
        } else {
            System.out.println("-1 (No non-repeating character found)");
        }
    }
}
