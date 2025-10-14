/*
Test Cases for count_uppercase_and_lowercase_letters:

1. Input: "HelloWorld"
   Expected Output: Uppercase = 2, Lowercase = 8
   Explanation: 'H' and 'W' are uppercase; remaining 8 are lowercase.

2. Input: "JAVA"
   Expected Output: Uppercase = 4, Lowercase = 0
   Explanation: All letters are uppercase.

3. Input: "python"
   Expected Output: Uppercase = 0, Lowercase = 6
   Explanation: All letters are lowercase.

4. Input: "DataScience"
   Expected Output: Uppercase = 2, Lowercase = 9
   Explanation: 'D' and 'S' are uppercase; rest are lowercase.

5. Input: "AbCdEfG"
   Expected Output: Uppercase = 4, Lowercase = 3
   Explanation: Uppercase letters: A, C, E, G.  
                Lowercase letters: b, d, f.

6. Input: "123ABCxyz!"
   Expected Output: Uppercase = 3, Lowercase = 3
   Explanation: 'A', 'B', 'C' are uppercase; 'x', 'y', 'z' are lowercase.  
                Digits and special characters are ignored.

7. Input: ""
   Expected Output: Uppercase = 0, Lowercase = 0
   Explanation: Empty string → no letters to count.

8. Input: "OpenAI ChatGPT"
   Expected Output: Uppercase = 3, Lowercase = 8
   Explanation: 'O', 'A', 'C' are uppercase; all others are lowercase.

9. Input: "MIXEDcaseLETTERS"
   Expected Output: Uppercase = 11, Lowercase = 5
   Explanation: Mix of both cases — correctly counted.

10. Input: "noCAPS"
    Expected Output: Uppercase = 3, Lowercase = 3
    Explanation: 'C', 'A', 'P' are uppercase; 'n', 'o', 'S' lowercase.
*/

package Strings;

import java.util.Scanner;

public class count_uppercase_and_lowercase_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int uper = 0 , lower = 0;
        
        char[] ch = str.toCharArray();

        for(int i = 0;i<=ch.length-1;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                uper++;
            }
            else if (ch[i] >= 'a' && ch[i] <= 'z') {
                lower++;
            }
        }

        System.out.println("The upper case and lower case letters are present in the given sentence is: " );
        System.out.print("Upper Case: " + uper);
        System.out.print("Lower Cases: " + lower);
    }
}
