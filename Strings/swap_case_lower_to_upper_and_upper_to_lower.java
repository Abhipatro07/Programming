/*
Test Cases for swap_case_lower_to_upper_and_upper_to_lower:

1. Input: "HelloWorld"
   Expected Output: "hELLOwORLD"
   Explanation: Each lowercase letter becomes uppercase and vice versa.

2. Input: "JAVA"
   Expected Output: "java"
   Explanation: All uppercase letters are converted to lowercase.

3. Input: "python"
   Expected Output: "PYTHON"
   Explanation: All lowercase letters are converted to uppercase.

4. Input: "DaTaScIeNcE"
   Expected Output: "dAtAsCiEnCe"
   Explanation: Each character’s case is swapped individually.

5. Input: "123ABCxyz!"
   Expected Output: "123abcXYZ!"
   Explanation: Non-alphabetic characters remain unchanged.

6. Input: " "
   Expected Output: " "
   Explanation: Space character remains unchanged.

7. Input: ""
   Expected Output: ""
   Explanation: Empty string → nothing to swap.

8. Input: "SwapCASE"
   Expected Output: "sWAPcase"
   Explanation: Each uppercase becomes lowercase and vice versa.

9. Input: "MiXeD CaSe StRiNg"
   Expected Output: "mIxEd cAsE sTrInG"
   Explanation: Works for mixed cases with spaces preserved.

10. Input: "OpenAI ChatGPT 2025!"
    Expected Output: "oPENai cHATgpt 2025!"
    Explanation: Properly swaps case and keeps numbers/symbols intact.
*/

package Strings;

import java.util.Scanner;

public class swap_case_lower_to_upper_and_upper_to_lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String res = "";

        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                res = res + Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                res = res + Character.toUpperCase(ch);
            }
            else{
                res = res + ch;
            }
        }

        System.out.println("The Expected output is: " + res);
    }
}
