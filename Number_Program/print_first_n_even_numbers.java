/*
Test Cases for print_first_n_even_numbers:

1. Input: n = 1  
   Expected Output: 2  
   Explanation: The first even number is 2.

2. Input: n = 3  
   Expected Output: 2 4 6  
   Explanation: The first three even numbers are 2, 4, and 6.

3. Input: n = 5  
   Expected Output: 2 4 6 8 10  
   Explanation: Prints the first five even numbers sequentially.

4. Input: n = 0  
   Expected Output: No output  
   Explanation: 0 even numbers → nothing to print.

5. Input: n = 7  
   Expected Output: 2 4 6 8 10 12 14  
   Explanation: Prints seven even numbers starting from 2.

6. Input: n = 10  
   Expected Output: 2 4 6 8 10 12 14 16 18 20  
   Explanation: First ten even numbers printed in order.

7. Input: n = -4  
   Expected Output: Invalid input  
   Explanation: Negative count is invalid; handle gracefully.

8. Input: n = 2  
   Expected Output: 2 4  
   Explanation: The first two even numbers.

9. Input: n = 4  
   Expected Output: 2 4 6 8  
   Explanation: Four even numbers in ascending order.

10. Input: n = 6  
    Expected Output: 2 4 6 8 10 12  
    Explanation: Prints six even numbers correctly.
*/

package Number_Program;

import java.util.Scanner;

public class print_first_n_even_numbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which even number you want to print: ");
        int n = sc.nextInt();

        System.out.println("The expected output is: ");
        for(int i = 2;i<=2*n;i = i+2){
            System.out.print(i + " ");
        }
    }
}
