/*
Test Case 1
Input:
str = "hello"
Output:
"olleh"

Test Case 2
Input:
str = "A"
Output:
"A"

Test Case 3
Input:
str = "madam"
Output:
"madam"

Test Case 4
Input:
str = "Java Programming"
Output:
"gnimmargorP avaJ"

Test Case 5
Input:
str = "abc123!@#"
Output:
"#@!321cba"

Test Case 6 (Edge Case)
Input:
str = ""
Output:
""
*/

package Strings;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String n = sc.nextLine();

        // //Method 1
        // String sb = new StringBuffer(n).reverse().toString();
        // System.out.println("The reverse of the given sentence is: " + sb);

        //Method 2
        char arr[] = n.toCharArray();

        System.out.println("The reverse of the given sentence is: ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
