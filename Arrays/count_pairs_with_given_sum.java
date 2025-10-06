/*
Test Cases for count_pairs_with_given_sum:

1. Input: arr = [1, 5, 7, -1], sum = 6
   Expected Output: 2
   Explanation: Pairs are (1,5) and (7,-1)

2. Input: arr = [1, 5, 7, -1, 5], sum = 6
   Expected Output: 3
   Explanation: Pairs are (1,5), (7,-1), (1,5) again

3. Input: arr = [1, 1, 1, 1], sum = 2
   Expected Output: 6
   Explanation: Pairs are all possible (1,1) combinations → 4 choose 2 = 6

4. Input: arr = [2, 4, 3, 5, 7, 8, 9], sum = 7
   Expected Output: 2
   Explanation: Pairs are (2,5), (4,3)

5. Input: arr = [0, -1, 2, -3, 1], sum = -2
   Expected Output: 1
   Explanation: Pair is (-3,1)

6. Input: arr = [1, 2, 3, 4, 5], sum = 10
   Expected Output: 0
   Explanation: No pairs sum up to 10

7. Input: arr = [1, 5, 3, 3, 3], sum = 6
   Expected Output: 4
   Explanation: Pairs are (1,5), (3,3), (3,3), (3,3) → count all valid combinations

8. Input: arr = [], sum = 5
   Expected Output: 0
   Explanation: Empty array → no pairs

9. Input: arr = [5], sum = 5
   Expected Output: 0
   Explanation: Single element → no pair possible

10. Input: arr = [-1, -2, -3, -4, -5], sum = -8
    Expected Output: 1
    Explanation: Pair is (-3,-5)
*/

package Arrays;

import java.util.Scanner;

public class count_pairs_with_given_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the value of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the value to the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum you want to get: ");
        int sum = sc.nextInt();
        int count = 0;

        for(int i = 0;i<=n-1;i++){
            for(int j = i+1;j<=n-1;j++){
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }

        if(count == 0){
            System.out.println("No such combination is present");
        }
        else{
            System.out.println("The number of combination is: " + count);
        }

    }
}
