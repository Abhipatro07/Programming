/*
Test Cases for print_first_n_odd_numbers:

1. Input: n = 1  
   Expected Output: 1  
   Explanation: The first odd number is 1.

2. Input: n = 3  
   Expected Output: 1 3 5  
   Explanation: The first three odd numbers are 1, 3, and 5.

3. Input: n = 5  
   Expected Output: 1 3 5 7 9  
   Explanation: Prints the first five odd numbers sequentially.

4. Input: n = 0  
   Expected Output: No output  
   Explanation: 0 odd numbers → nothing to print.

5. Input: n = 7  
   Expected Output: 1 3 5 7 9 11 13  
   Explanation: Prints seven odd numbers starting from 1.

6. Input: n = 10  
   Expected Output: 1 3 5 7 9 11 13 15 17 19  
   Explanation: First ten odd numbers printed in sequence.

7. Input: n = -3  
   Expected Output: Invalid input  
   Explanation: Negative count is invalid; handle gracefully.

8. Input: n = 2  
   Expected Output: 1 3  
   Explanation: The first two odd numbers.

9. Input: n = 4  
   Expected Output: 1 3 5 7  
   Explanation: Four odd numbers in ascending order.

10. Input: n = 6  
    Expected Output: 1 3 5 7 9 11  
    Explanation: Prints six odd numbers correctly.
*/

package Number_Program;

import java.util.Scanner;

public class print_first_n_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which odd number you want to print: ");
        int n = sc.nextInt();

        System.out.println("The expected output is: ");
        for(int i = 1;i<=2*n;i = i+2){
            System.out.print(i + " ");
        }
    }
}
