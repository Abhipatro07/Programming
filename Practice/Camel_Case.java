/*
Camel Case

Have the function CamelCase (str) take the str parameter being passed and return it in proper camel case format 
where the first letter of each word is capitalized (excluding the first letter). 
The string will only contain letters and some combination of delimiter punctuation characters separating each word. 
For example: if str is " BOB loves-coding "

then your program should return the string bobLovesCoding.

Examples

Input:" cats AND * Dogs - are Awesome "

Output: catsAndDogs Are Awesome

Input: a b c d-e-f%g"

Output: ABCDEFG
*/
package Practice;

import java.util.Scanner;

public class Camel_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("The Exapected Output is: " + camelCase(str));
    }

    public static String camelCase(String str) {
        str = str.trim();

        // Split the String by any non-alphabetic character
        String[] words = str.split("[^a-zA-Z]+");

        if(words.length == 0){
            return "";
        }

        StringBuilder res = new StringBuilder(words[0].toLowerCase());

        for(int i = 1;i<words.length;i++){
            if(words[i].length() > 0){
                res.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1).toLowerCase());
            }
        }

        return res.toString();
    }
}
