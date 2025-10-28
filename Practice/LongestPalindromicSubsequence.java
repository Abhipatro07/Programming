/*
 Given a string s, find the length of the longest palindromic subsequence that is not the entire string itself 
 (exclude the full string palindrome)
Input: s = "bbbab"
Output: 3
Explanation:
The longest palindromic subsequence is "bbbb" (length 4),
but we exclude the full string palindrome.
The next longest palindromic subsequence is "bbb" (length 3).
 */

import java.util.Scanner;

public class LongestPalindromicSubsequence {
    static int[][] memo;  // to store already calculated results

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();

        int n = s.length();
        memo = new int[n][n];  // initialize memo table with zeros

        // Step 1: If the string is a palindrome, exclude full string
        if (isPalindrome(s)) {
            System.out.println("Length of longest palindromic subsequence (excluding full palindrome): " + (n - 1));
            return;
        }

        // Step 2: Otherwise, find LPS normally
        int result = longestPalSubseq(s, 0, n - 1);
        System.out.println("Length of longest palindromic subsequence (excluding full palindrome): " + result);
    }

    // Recursive + memoized LPS
    static int longestPalSubseq(String s, int i, int j) {
        if (i > j) return 0;
        if (i == j) return 1;
        if (memo[i][j] != 0) return memo[i][j]; // already computed

        if (s.charAt(i) == s.charAt(j)) {
            memo[i][j] = 2 + longestPalSubseq(s, i + 1, j - 1);
        } else {
            memo[i][j] = Math.max(longestPalSubseq(s, i + 1, j), longestPalSubseq(s, i, j - 1));
        }

        return memo[i][j];
    }

    // Helper to check if full string is palindrome
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}