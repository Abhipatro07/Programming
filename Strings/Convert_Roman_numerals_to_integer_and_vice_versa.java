/*
Test Cases and Explanations for Convert_Roman_numerals_to_integer_and_vice_versa:

🧩 Problem:
Implement conversion between Roman numerals and integers.
Two functions:
1️⃣ romanToInt(String s) — Convert Roman numeral to integer.
2️⃣ intToRoman(int num) — Convert integer to Roman numeral.

Roman numerals:
I=1, V=5, X=10, L=50, C=100, D=500, M=1000
Subtractive notation: 
IV=4, IX=9, XL=40, XC=90, CD=400, CM=900

------------------------------------------------------------

1️⃣ Input: "III"
Output: 3
Explanation: I + I + I = 3

2️⃣ Input: "IV"
Output: 4
Explanation: 'I' before 'V' means 5 - 1 = 4

3️⃣ Input: "IX"
Output: 9
Explanation: 'I' before 'X' means 10 - 1 = 9

4️⃣ Input: "LVIII"
Output: 58
Explanation: L(50) + V(5) + III(3) = 58

5️⃣ Input: "MCMXCIV"
Output: 1994
Explanation: M(1000) + CM(900) + XC(90) + IV(4) = 1994

6️⃣ Input: 58 → Output: "LVIII"
Explanation: 50 + 5 + 3 = LVIII

7️⃣ Input: 1994 → Output: "MCMXCIV"
Explanation: 1000(M) + 900(CM) + 90(XC) + 4(IV) = MCMXCIV

8️⃣ Input: 4 → Output: "IV"
Explanation: 5 - 1 = 4

9️⃣ Input: 9 → Output: "IX"
Explanation: 10 - 1 = 9

🔟 Input: 3999 → Output: "MMMCMXCIX"
Explanation: Highest Roman numeral combination up to 3999

------------------------------------------------------------
⚠️ Notes:
- Roman numerals are only valid up to 3999.
- No numeral uses more than three same symbols consecutively (e.g., 'IIII' is invalid).
- The algorithm uses a left-to-right scan for Roman to integer conversion.
- For integer to Roman, the algorithm subtracts the largest possible Roman value each step.
*/

package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Convert_Roman_numerals_to_integer_and_vice_versa {

    // Convert Roman numeral to Integer
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value; // Subtractive case
            } else {
                result += value;
            }
        }
        return result;
    }

    // Convert Integer to Roman numeral
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Roman → Integer");
        System.out.println("2. Integer → Roman");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Roman numeral: ");
            String roman = sc.next().toUpperCase();
            System.out.println("Integer value: " + romanToInt(roman));
        } 
        else if (choice == 2) {
            System.out.print("Enter integer (1 - 3999): ");
            int num = sc.nextInt();
            if (num < 1 || num > 3999) {
                System.out.println("Invalid input! Number must be between 1 and 3999.");
            } else {
                System.out.println("Roman numeral: " + intToRoman(num));
            }
        } 
        else {
            System.out.println("Invalid choice!");
        }
    }
}
