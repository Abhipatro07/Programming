/*
Test Cases for find_first_repeated_character:

1. Input: "programming"
   Expected Output: 'r'
   Explanation: 'r' is the first character that repeats (appears at index 1 and 4).

2. Input: "hello"
   Expected Output: 'l'
   Explanation: 'l' is the first repeated character.

3. Input: "abcdef"
   Expected Output: 'None'
   Explanation: No character repeats.

4. Input: "aabbcc"
   Expected Output: 'a'
   Explanation: 'a' repeats first.

5. Input: "aA"
   Expected Output: 'None'
   Explanation: Case-sensitive → 'a' and 'A' are different.

6. Input: "mississippi"
   Expected Output: 's'
   Explanation: 's' is the first repeated character.

7. Input: "123451"
   Expected Output: '1'
   Explanation: Digits can repeat too.

8. Input: " "
   Expected Output: 'None'
   Explanation: Only one character, no repetition.

9. Input: ""
   Expected Output: 'None'
   Explanation: Empty string → no characters to check.

10. Input: "abca"
    Expected Output: 'a'
    Explanation: 'a' is the first repeated character.
*/

package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class find_first_repeated_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        HashSet<Character> res = new HashSet<>();
        char result = 0;

        for(int i = 0;i<=ch.length-1;i++){
            if(res.contains(ch[i])){
                result = ch[i];
            }
            res.add(ch[i]);
        }


        System.out.println("The repeted charcter is: " + result);
    }
}
