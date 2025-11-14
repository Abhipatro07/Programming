/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string.
Ex: sumDigits(&quot;aa1bc2d3&quot;) → 6 sumDigits(&quot;aa11b33&quot;) → 8 sumDigits(
    */
package Practice;
    
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String which contains both number and characters: ");
        String str = sc.next();

        int res = sumDigits(str);

        System.out.println("The expected output is: " + res);
    }

    public static int sumDigits(String str) {
        int sum = 0;

        for(int i = 0;i<=str.length()-1;i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                sum += ch - '0';
            }
        }

        return sum;
    }
}
