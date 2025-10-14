/*
Test Cases for check_if_two_strings_are_anagrams:

1. Input: str1 = "listen", str2 = "silent"
   Expected Output: true
   Explanation: Both strings have the same letters with same frequency.

2. Input: str1 = "triangle", str2 = "integral"
   Expected Output: true
   Explanation: All letters match in frequency, so they are anagrams.

3. Input: str1 = "apple", str2 = "papel"
   Expected Output: true
   Explanation: Letters rearranged, frequencies match.

4. Input: str1 = "rat", str2 = "car"
   Expected Output: false
   Explanation: Letters do not match (missing 't' in second string).

5. Input: str1 = "night", str2 = "thing"
   Expected Output: true
   Explanation: Same letters, just rearranged.

6. Input: str1 = "hello", str2 = "bello"
   Expected Output: false
   Explanation: 'h' and 'b' mismatch, so not anagrams.

7. Input: str1 = "aabbcc", str2 = "abcabc"
   Expected Output: true
   Explanation: Frequency of each letter is identical in both strings.

8. Input: str1 = "Dormitory", str2 = "Dirtyroom"
   Expected Output: true (if case ignored)
   Explanation: Ignoring case and spaces, both strings have same letters.

9. Input: str1 = "", str2 = ""
   Expected Output: true
   Explanation: Empty strings are trivially anagrams of each other.

10. Input: str1 = "123", str2 = "321"
    Expected Output: true
    Explanation: Numbers treated as characters; all match in frequency.
*/

package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class check_if_two_strings_are_anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second String: ");
        String str2 = sc.nextLine().toLowerCase();

        if(isAnagram(str1, str2)){
            System.out.println("The given string anagram");
        }
        else{
            System.out.println("The given string is not anagram");
        }

    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chstr1 = str1.toCharArray();
        char[] chstr2 = str2.toCharArray();

        Arrays.sort(chstr1);
        Arrays.sort(chstr2);

        return Arrays.equals(chstr1, chstr2);
    }
}
