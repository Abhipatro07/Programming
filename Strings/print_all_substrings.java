/*
Test Cases for print_all_substrings:

1. Input: "abc"
   Expected Output:
   a
   ab
   abc
   b
   bc
   c
   Explanation: All possible contiguous substrings are printed.

2. Input: "abcd"
   Expected Output:
   a
   ab
   abc
   abcd
   b
   bc
   bcd
   c
   cd
   d
   Explanation: Substrings starting from each position in sequence.

3. Input: "a"
   Expected Output:
   a
   Explanation: Single character string → only one substring.

4. Input: "aa"
   Expected Output:
   a
   aa
   a
   Explanation: Even if characters repeat, all substring positions are considered.

5. Input: "aba"
   Expected Output:
   a
   ab
   aba
   b
   ba
   a
   Explanation: Handles overlapping and repeating characters correctly.

6. Input: " "
   Expected Output:
   " "
   Explanation: Single space is treated as a valid substring.

7. Input: ""
   Expected Output:
   (no output)
   Explanation: Empty string → no substrings to print.

8. Input: "AB"
   Expected Output:
   A
   AB
   B
   Explanation: Works correctly with uppercase letters too.

9. Input: "xyz123"
   Expected Output:
   x
   xy
   xyz
   xyz1
   xyz12
   xyz123
   y
   yz
   yz1
   yz12
   yz123
   z
   z1
   z12
   z123
   1
   12
   123
   2
   23
   3
   Explanation: Works correctly with alphanumeric input.

10. Input: "aa bb"
    Expected Output:
    a
    aa
    aa 
    aa b
    aa bb
    a
    a 
    a b
    a bb
    (and so on for all positions)
    Explanation: Spaces are treated like normal characters, so substrings can include them.
*/

package Strings;

import java.util.Scanner;

public class print_all_substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        // Outer loop for start index
        for (int i = 0; i < str.length(); i++) {
            // Inner loop for end index
            for (int j = i + 1; j <= str.length(); j++) {
                // substring(i, j) → gives substring from index i to j-1
                System.out.println(str.substring(i, j));
            }
        }
    }
}
