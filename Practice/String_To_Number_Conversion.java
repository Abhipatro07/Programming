/*
 Convert String letter to number

Ex: INPUT = !hello!-a!

OUTPUT = 1851212151-1!
 */
package Practice;

import java.util.Scanner;

public class String_To_Number_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String res = convert(str);

        System.out.println("The expected output is: " + res);
    }

    public static String convert(String str) {
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                int num = Character.toLowerCase(ch) - 'a' + 1;
                sb.append(num);
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
