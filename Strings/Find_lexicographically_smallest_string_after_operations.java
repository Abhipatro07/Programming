/*
 ✅ Test Case 1
Input:
s = "cba", k = 1

Output:
"acb"

Explanation:
Since k = 1, you can only rotate the string by moving the first character to the end.
"cba" → move 'c' → "bac"
"bac" → move 'b' → "acb"
"acb" is the smallest lexicographical form achievable.

✅ Test Case 2
Input:
s = "baaca", k = 3

Output:
"aaabc"

Explanation:
When k > 1, you can rearrange freely (like sorting).
Thus, sort all characters → "aaabc".

✅ Test Case 3
Input:
s = "daily", k = 2

Output:
"adily"

Explanation:
k > 1, so the smallest possible order is the sorted string "adily".

✅ Test Case 4
Input:
s = "bca", k = 1

Output:
"abc"

Explanation:
You can only rotate:
"bca" → move 'b' → "cab"
"cab" → move 'c' → "abc"
→ "abc" is the smallest lexicographical string.

✅ Test Case 5
Input:
s = "dcab", k = 4

Output:
"abcd"

Explanation:
Since k ≥ 2, you can rearrange all characters arbitrarily → sort → "abcd".

✅ Test Case 6
Input:
s = "b", k = 1

Output:
"b"

Explanation:
Single character, no operation changes the string.

✅ Test Case 7
Input:
s = "zyx", k = 2

Output:
"xyz"

Explanation:
k = 2 allows rearranging, so sorting yields "xyz".

✅ Test Case 8
Input:
s = "cba", k = 2

Output:
"abc"

Explanation:
Since k > 1, sorting gives "abc".

✅ Test Case 9
Input:
s = "a", k = 1

Output:
"a"

Explanation:
Single letter, remains unchanged.

✅ Test Case 10
Input:
s = "azby", k = 1

Output:
"azby"

Explanation:
Rotating one character at a time never produces a smaller string than the original "azby".

💡 Summary Rule

If k == 1:
➤ Only rotations possible → find the smallest rotation.

If k > 1:
➤ You can rearrange characters freely → sort the string.
 */
package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Find_lexicographically_smallest_string_after_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();

        String res = findLexicographicallySmallestString(str , k);

        System.out.println("The expcted output is: " + res);
    }

    public static String findLexicographicallySmallestString(String str , int n) {
        if(n == 1){
            String smallest = str;

            for(int i = 0;i<=str.length()-1;i++){
                String rotated = str.substring(i) + str.substring(0,i);
                
                if(rotated.compareTo(smallest) < 0){
                    smallest = rotated;
                }
            }

            return smallest;
        }

        else{
            char ch[] = str.toCharArray();
            Arrays.sort(ch);

            return new String(ch);
        }
    }
}
