/*
Test Cases for find_difference_between_sum_of_even_and_odd_digits:

1. Input: num = 1234  
   Expected Output: 2  
   Explanation: Even digits → (2 + 4 = 6), Odd digits → (1 + 3 = 4), Difference = 6 - 4 = 2.

2. Input: num = 4321  
   Expected Output: 2  
   Explanation: Even sum = (4 + 2 = 6), Odd sum = (3 + 1 = 4), Difference = 2.

3. Input: num = 1111  
   Expected Output: -4  
   Explanation: Even sum = 0, Odd sum = (1 + 1 + 1 + 1 = 4), Difference = 0 - 4 = -4.

4. Input: num = 2468  
   Expected Output: 20  
   Explanation: All digits even → (2 + 4 + 6 + 8 = 20), Odd sum = 0, Difference = 20 - 0 = 20.

5. Input: num = 13579  
   Expected Output: -25  
   Explanation: Even sum = 0, Odd sum = (1 + 3 + 5 + 7 + 9 = 25), Difference = 0 - 25 = -25.

6. Input: num = 0  
   Expected Output: 0  
   Explanation: Single even digit (0), Difference = 0 - 0 = 0.

7. Input: num = 987654321  
   Expected Output: 5  
   Explanation: Even sum = (8 + 6 + 4 + 2 = 20), Odd sum = (9 + 7 + 5 + 3 + 1 = 25), Difference = 20 - 25 = -5.

8. Input: num = 1010  
   Expected Output: -2  
   Explanation: Even sum = (0 + 0 = 0), Odd sum = (1 + 1 = 2), Difference = 0 - 2 = -2.

9. Input: num = 222333  
   Expected Output: -3  
   Explanation: Even sum = (2 + 2 + 2 = 6), Odd sum = (3 + 3 + 3 = 9), Difference = 6 - 9 = -3.

10. Input: num = 8080  
    Expected Output: 16  
    Explanation: Even sum = (8 + 0 + 8 + 0 = 16), Odd sum = 0, Difference = 16 - 0 = 16.
*/

package Number_Program;

import java.util.Scanner;

public class find_difference_between_sum_of_even_and_odd_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int evenSum = 0 , oddSum = 0;

        while(n!=0){
            int rem = n % 10;
            if(rem % 2 == 0){
                evenSum = evenSum + rem;
            }
            else{
                oddSum = oddSum + rem;
            }
            n = n / 10;
        }

        int diff = evenSum - oddSum;

        System.out.println("The difference between the even sum and the odd sum of the digit of the given number is: " + diff);
    }
}
