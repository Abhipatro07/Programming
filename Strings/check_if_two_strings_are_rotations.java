/*
Test Cases for check_if_two_strings_are_rotations:

1. Input: str1 = "ABCD", str2 = "BCDA"
   Expected Output: true
   Explanation: str2 is a rotation of str1 by 1 position to the left.

2. Input: str1 = "ABCD", str2 = "DABC"
   Expected Output: true
   Explanation: str2 is a rotation of str1 by 1 position to the right.

3. Input: str1 = "ABCD", str2 = "ACBD"
   Expected Output: false
   Explanation: str2 has same characters but in a different order; not a rotation.

4. Input: str1 = "hello", str2 = "llohe"
   Expected Output: true
   Explanation: str2 can be obtained by rotating str1 left by 2 positions.

5. Input: str1 = "rotation", str2 = "tationro"
   Expected Output: true
   Explanation: str2 is obtained by moving first 2 characters of str1 to the end.

6. Input: str1 = "abc", str2 = "cab"
   Expected Output: true
   Explanation: str2 is a rotation of str1 by 2 positions.

7. Input: str1 = "abc", str2 = "bca"
   Expected Output: true
   Explanation: str2 is a rotation of str1 by 1 position.

8. Input: str1 = "abc", str2 = "abc"
   Expected Output: true
   Explanation: str2 is a rotation of str1 by 0 positions (identical).

9. Input: str1 = "abc", str2 = "abcd"
   Expected Output: false
   Explanation: Different lengths → cannot be rotations.

10. Input: str1 = "", str2 = ""
    Expected Output: true
    Explanation: Both are empty strings → trivially rotations.
*/

package Strings;

import java.util.Scanner;

public class check_if_two_strings_are_rotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second String: ");
        String str2 = sc.nextLine().toLowerCase();

        if (areRotations(str1, str2)) {
            System.out.println("The given strings are rotations of each other.");
        } else {
            System.out.println("The given strings are NOT rotations of each other.");
        }
    }

    public static boolean areRotations(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }
}
