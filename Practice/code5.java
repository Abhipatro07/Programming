import java.util.HashSet;
import java.util.Scanner;

/*
Create a function that will remove any repeated character(s) in a word passed to the function. 
Not just consecutive characters, but characters repeating anywhere in the string.
		ex: unrepeated("teshahset") ➞ "tesha"
 */
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("enter a string: "));
        String str = sc.next();

        char[] ch = str.toCharArray();

        HashSet<Character> hs = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        
        for( char c : ch){
            if(!hs.contains(c)){
                sb.append(c);
                hs.add(c);
            }
        }
        System.out.println("Expected Output is: " + sb.toString());
    }
}
