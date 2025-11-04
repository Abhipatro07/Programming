/*
Test Cases for Count_and_remove_vowels:

1️⃣ Input: "hello world"
    Expected Output: Vowel Count = 3, String = "hll wrld"

2️⃣ Input: "AEIOU"
    Expected Output: Vowel Count = 5, String = ""

3️⃣ Input: "ChatGPT"
    Expected Output: Vowel Count = 1, String = "ChtGPT"

4️⃣ Input: "beautiful day"
    Expected Output: Vowel Count = 6, String = "btfl dy"

5️⃣ Input: "rhythm"
    Expected Output: Vowel Count = 0, String = "rhythm"

6️⃣ Input: "India"
    Expected Output: Vowel Count = 3, String = "nd"

7️⃣ Input: "Java Programming"
    Expected Output: Vowel Count = 5, String = "Jv Prgrmmng"

8️⃣ Input: "HELLO"
    Expected Output: Vowel Count = 2, String = "HLL"

9️⃣ Input: " "
    Expected Output: Vowel Count = 0, String = " "

🔟 Input: ""
    Expected Output: Vowel Count = 0, String = ""
*/

package Strings;

import java.util.Scanner;

public class Count_and_remove_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder res = new StringBuilder();
        int vowel = 0;

        char ch[] = str.toCharArray();

        for(int i = 0;i<=ch.length-1;i++){
            if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ||
                ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                    vowel++;
            }
            else{
                res.append(ch[i]);
            }
        }

        System.out.println("The number vowels are: " + vowel);
        System.out.println("Expected output is: " + res.toString());
    }
}
