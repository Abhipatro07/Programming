/*
Test Cases for rearrange_array_alternating_positive_negative_numbers:

1. Input: [1, -2, 3, -4, 5, -6]
   Expected Output: [1, -2, 3, -4, 5, -6]
   Explanation:
     Already in alternating order starting with a positive number.

2. Input: [1, 2, 3, -4, -1]
   Expected Output: [1, -4, 2, -1, 3]
   Explanation:
     Rearranged so that positive and negative numbers alternate. 
     Remaining positive number (3) is placed at the end.

3. Input: [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
   Expected Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
   Explanation:
     Alternating starts with a positive number.
     When one type runs out, remaining numbers are appended at the end.

4. Input: [2, 4, 6, 8]
   Expected Output: [2, 4, 6, 8]
   Explanation:
     No negative numbers, so array remains unchanged.

5. Input: [-1, -3, -5, -7]
   Expected Output: [-1, -3, -5, -7]
   Explanation:
     No positive numbers, so array remains unchanged.

6. Input: [-1, 2, -3, 4, 5, -6]
   Expected Output: [2, -1, 4, -3, 5, -6]
   Explanation:
     Rearranged to start with a positive number and alternate with negatives.

7. Input: [0, -1, 2, -3, 4, 0, -5]
   Expected Output: [2, -1, 4, -3, 0, -5, 0]
   Explanation:
     Zeros treated as positives; they appear in positive positions when alternating.

8. Input: [5, -2, -3, 4, -1, 6, -7, 8, -9]
   Expected Output: [5, -2, 4, -3, 6, -1, 8, -7, -9]
   Explanation:
     Starts with a positive, alternates between positive and negative.
     Extra negative (-9) is appended at the end.

9. Input: [-4, 1, -2, 3, -6, 5]
   Expected Output: [1, -4, 3, -2, 5, -6]
   Explanation:
     Rearranged to alternate with positives first.

10. Input: [1]
    Expected Output: [1]
    Explanation:
     Only one element, no alternation needed.
*/

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class rearrange_array_alternating_positive_negative_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the value of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the value to the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        reArrangeArray(arr);

        System.out.println("The resultant array is: ");
        for(int i = 0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }

    public static void reArrangeArray(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i] >= 0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }

        int i = 0 , p = 0 , n = 0;   // i is for array index p is for positive n is for negative

        while(p < pos.size() && n < neg.size()){
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }

        while(p < pos.size()){
            arr[i++] = pos.get(p++);
        }
        while(n < neg.size()){
            arr[i++] = pos.get(n++);
        }
    }
}
