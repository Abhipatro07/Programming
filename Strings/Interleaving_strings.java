/*
Test Cases for Interleaving_strings:

🧩 Problem:
Given three strings `s1`, `s2`, and `s3`, determine if `s3` is formed by interleaving
the characters of `s1` and `s2` while maintaining their relative order.

That means:  
All characters of s1 and s2 must appear in s3 in the same order as in s1 and s2, 
but can be mixed.

---------------------------------------------------------------------------------------------------------------

1️⃣ Input:
s1 = "abc"
s2 = "def"
s3 = "adbcef"
Expected Output: true  
Explanation:
Possible interleaving → a (from s1), d (from s2), b (from s1), c (from s1), e (from s2), f (from s2)

---------------------------------------------------------------------------------------------------------------

2️⃣ Input:
s1 = "aabcc"
s2 = "dbbca"
s3 = "aadbbcbcac"
Expected Output: true  
Explanation:
One possible interleaving:
a(a)b(b)c(b)c(a)
Each letter of s1 and s2 used in order → forms s3.

---------------------------------------------------------------------------------------------------------------

3️⃣ Input:
s1 = "aabcc"
s2 = "dbbca"
s3 = "aadbbbaccc"
Expected Output: false  
Explanation:
The order breaks; characters from s1 and s2 don’t appear in order in s3.

---------------------------------------------------------------------------------------------------------------

4️⃣ Input:
s1 = ""
s2 = ""
s3 = ""
Expected Output: true  
Explanation:
All are empty → trivially interleaved.

---------------------------------------------------------------------------------------------------------------

5️⃣ Input:
s1 = ""
s2 = "abc"
s3 = "abc"
Expected Output: true  
Explanation:
Since s1 is empty, s3 = s2.

---------------------------------------------------------------------------------------------------------------

6️⃣ Input:
s1 = "abc"
s2 = ""
s3 = "abc"
Expected Output: true  
Explanation:
Since s2 is empty, s3 = s1.

---------------------------------------------------------------------------------------------------------------

7️⃣ Input:
s1 = "abc"
s2 = "123"
s3 = "a1b2c3"
Expected Output: true  
Explanation:
Perfect alternating pattern of both strings.

---------------------------------------------------------------------------------------------------------------

8️⃣ Input:
s1 = "abc"
s2 = "123"
s3 = "ab12c3"
Expected Output: true  
Explanation:
Still valid interleaving as relative order of both strings is maintained.

---------------------------------------------------------------------------------------------------------------

9️⃣ Input:
s1 = "abc"
s2 = "123"
s3 = "acb123"
Expected Output: false  
Explanation:
Order of characters in s1 is violated (a → c → b, not in order).

---------------------------------------------------------------------------------------------------------------

🔟 Input:
s1 = "xx"
s2 = "yy"
s3 = "xxyy"
Expected Output: true  
Explanation:
All characters maintain order.
*/

package Strings;

import java.util.Scanner;

public class Interleaving_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string (s2): ");
        String s2 = sc.nextLine();
        System.out.print("Enter third string (s3): ");
        String s3 = sc.nextLine();

        boolean result = isInterleave(s1, s2, s3);
        System.out.println("Is Interleaving: " + result);
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        if(m + n != s3.length()){
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;  //! → empty s1 and empty s2 make empty s3.

        for(int i = 1;i<=m;i++){
            dp[i][0] = dp[i-1][0] && s1.charAt(i - 1) == s3.charAt(i-1);   //! First column (using only s1):
        }

        for(int j = 1;j<=n;j++){
            dp[0][j] = dp[0][j-1] && s2.charAt(j - 1) == s3.charAt(j-1);   //! First row (using only s2):
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char c3 = s3.charAt(i + j - 1);
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == c3)
                        || (dp[i][j - 1] && s2.charAt(j - 1) == c3);
            }
        }

        return dp[m][n];
    }
}
