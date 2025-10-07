/*
 Matching Characters

Have the function MatchingCharacters (str) take the str parameter being passed and determine the largest number 
of unique characters that exists between a pair of matching letters anywhere in the string. 
For example: if str is "ahyjakh" then there are only two pairs of matching letters, the two a's and the two h's. 
Between the pair of a's there are 3 unique characters: h, y, and j. 
Between the h's there are 4 unique characters: y, j, a, and k. So for this example your program should return 4.

Another example: if str is "ghececgkaem" then your program should return 5 
because the most unique characters exists within the farthest pair of e characters. 
The input string may not contain any character pairs, and in that case your program should just return 0. 
The input will only consist of lowercase alphabetic characters.

Examples (Input: "mmmerme", Output: 3) (Input: "abccdefghi", Output: 0)
 */
package Practice;

import java.util.HashSet;
import java.util.Scanner;

public class Matching_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        int res = matchingCharacter(str);

        System.out.println("The expected Output is: " + res);
    }

    public static int matchingCharacter(String str) {
        int maxUnique = 0;
        int n = str.length();

        for(int i = 0;i<=n-1;i++){
            char startChar = str.charAt(i);

            for(int j = i + 1;j<n;j++){
                if(str.charAt(j) == startChar){
                    HashSet<Character> uniqueChar = new HashSet<>();
                    
                    for(int k = i + 1;k<j;k++){
                        uniqueChar.add(str.charAt(k));
                    }

                    maxUnique = Math.max(startChar, uniqueChar.size());
                }
            }
        }

        return maxUnique;
    }
}
