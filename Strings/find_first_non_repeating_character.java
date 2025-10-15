/*
Test Cases for find_first_non_repeating_character:

1. Input: "swiss"
   Expected Output: 'w'
   Explanation: 's' repeats multiple times, 'w' is the first non-repeating character.

2. Input: "aabbcde"
   Expected Output: 'c'
   Explanation: 'a' and 'b' repeat, 'c' is the first non-repeating character.

3. Input: "aabbcc"
   Expected Output: -1
   Explanation: All characters repeat, so no non-repeating character.

4. Input: "abacabad"
   Expected Output: 'c'
   Explanation: 'a', 'b', and 'd' repeat, 'c' appears once.

5. Input: "xxyz"
   Expected Output: 'y'
   Explanation: 'x' repeats, 'y' is the first unique one.

6. Input: "aA"
   Expected Output: 'a'
   Explanation: Case-sensitive → 'a' and 'A' are different characters.

7. Input: "abcabcde"
   Expected Output: 'd'
   Explanation: All first letters repeat; 'd' is first non-repeating.

8. Input: "123451234"
   Expected Output: '5'
   Explanation: Works for digits as well — '5' occurs only once.

9. Input: "@@!!$$%"
   Expected Output: '%'
   Explanation: All symbols except '%' are repeated.

10. Input: ""
    Expected Output: -1
    Explanation: Empty string → no characters to check.
*/

package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class find_first_non_repeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        Character res = findFirstNonRepeatingCharacter(str);

        if(res != null){
            System.out.println("The first repecting character is " + res);
        }
        else{
            System.out.println("There is no repecting character");
        }
    }

    public static Character findFirstNonRepeatingCharacter(String str) {
        if (str == null || str.isEmpty()){
            return null;
        }

        Map<Character , Integer> frequenceMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            frequenceMap.put(ch,frequenceMap.getOrDefault(ch,0) + 1);
        }

        for(char ch : str.toCharArray()){
            if(frequenceMap.get(ch) == 1){
                return ch;
            }
        }

        return null;
    }
}
