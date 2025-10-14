/*
Test Cases for remove_duplicate_characters:

1. Input: "programming"
   Expected Output: "progamin"
   Explanation: Removes repeated characters → second 'r', second 'g', and second 'm' are removed.

2. Input: "aabbcc"
   Expected Output: "abc"
   Explanation: Keeps only the first occurrence of each character.

3. Input: "abcdef"
   Expected Output: "abcdef"
   Explanation: All characters are unique, so no change.

4. Input: "aaaaaa"
   Expected Output: "a"
   Explanation: All characters are the same, keep only one 'a'.

5. Input: "Hello World"
   Expected Output: "Helo Wrd"
   Explanation: Duplicate 'l' and 'o' are removed, spaces are preserved.

6. Input: "1223334444"
   Expected Output: "1234"
   Explanation: Works for digits as well, keeping only the first occurrence.

7. Input: "AaBbCc"
   Expected Output: "AaBbCc"
   Explanation: Case-sensitive → 'A' and 'a' are treated as different characters.

8. Input: "Banana"
   Expected Output: "Ban"
   Explanation: Removes repeated 'a' and 'n', keeping first occurrences.

9. Input: ""
   Expected Output: ""
   Explanation: Empty string → no characters to process.

10. Input: "  spaced  out  "
    Expected Output: " spacedout"
    Explanation: Keeps first space, removes duplicates and extra ones.
*/

package Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class remove_duplicate_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        LinkedHashSet<Character> st = new LinkedHashSet<>();

        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);

            st.add(ch);
        }

        for(char res : st){
            System.out.print(res);
        }
    }
}
