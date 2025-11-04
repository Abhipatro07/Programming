/*
Test Cases and Explanations for Minimum_swaps_to_make_strings_equal:

🧩 Problem:
Given two strings `s1` and `s2` consisting only of 'x' and 'y', find the minimum number of swaps 
to make the strings equal. You can only swap characters between `s1` and `s2` (not within the same string).

Each swap exchanges one character from `s1` with one character from `s2`.

If it's impossible to make the strings equal, return -1.

------------------------------------------------------------

1️⃣ Input:
s1 = "xx", s2 = "yy"
Output: 1
Explanation:
Swap s1[1] = 'x' with s2[1] = 'y' → s1 = "xy", s2 = "yx" → both equal after 1 swap.

------------------------------------------------------------
2️⃣ Input:
s1 = "xy", s2 = "yx"
Output: 2
Explanation:
Swap s1[0]='x' with s2[1]='x' → s1="yy", s2="xx" → not yet equal.
Swap s1[1]='y' with s2[0]='y' → s1="xy", s2="xy" → equal after 2 swaps.

------------------------------------------------------------
3️⃣ Input:
s1 = "xxyyxyxyxx", s2 = "xyyxyxxxyx"
Output: 4
Explanation:
Count mismatched pairs → 4 swaps needed to make both equal.

------------------------------------------------------------
4️⃣ Input:
s1 = "xx", s2 = "xy"
Output: -1
Explanation:
Impossible to make equal since total number of 'x' and 'y' across both strings is odd.

------------------------------------------------------------
5️⃣ Input:
s1 = "xy", s2 = "xy"
Output: 0
Explanation:
Already equal — no swaps needed.

------------------------------------------------------------
6️⃣ Input:
s1 = "xxyy", s2 = "yyxx"
Output: 2
Explanation:
Swap one 'x' from s1 with one 'y' from s2 twice → both strings become "xyxy".

------------------------------------------------------------
7️⃣ Input:
s1 = "xyxy", s2 = "yxyx"
Output: 4
Explanation:
Each 'x' and 'y' mismatch needs to be corrected — total 4 swaps.

------------------------------------------------------------
8️⃣ Input:
s1 = "xxxyyy", s2 = "yyxyxx"
Output: 3
Explanation:
There are 3 (x,y) mismatches and 3 (y,x) mismatches → 3 swaps needed.

------------------------------------------------------------
9️⃣ Input:
s1 = "x", s2 = "y"
Output: -1
Explanation:
Odd number of total mismatches → impossible.

------------------------------------------------------------
🔟 Input:
s1 = "xxyyxy", s2 = "yyxxyx"
Output: 2
Explanation:
2 mismatched pairs → 2 swaps needed to make both equal.
*/

package Strings;

import java.util.Scanner;

public class Minimum_swaps_to_make_strings_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();

        System.out.println("Minimum swaps required: " + minimumSwap(str1, str2));
    }

    public static int minimumSwap(String s1, String s2) {
        if (s1.length() != s2.length()) return -1;

        int xy = 0; // Count of mismatched pairs (x,y)
        int yx = 0; // Count of mismatched pairs (y,x)

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') xy++;
            else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') yx++;
        }

        // If total mismatches are odd, impossible
        if ((xy + yx) % 2 != 0) return -1;

        // Each (xy, yx) pair needs one swap, remaining two same-type mismatches need two swaps
        return (xy / 2) + (yx / 2) + 2 * (xy % 2);
    }
}
