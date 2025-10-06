/*
Test Cases for segregate_even_and_odd_numbers:

1. Input: [1, 2, 3, 4, 5, 6]
   Expected Output: [2, 4, 6, 1, 3, 5]
   Explanation: Evens {2,4,6} come before odds {1,3,5}.

2. Input: [2, 4, 6, 8]
   Expected Output: [2, 4, 6, 8]
   Explanation: Already all evens, no change.

3. Input: [1, 3, 5, 7]
   Expected Output: [1, 3, 5, 7]
   Explanation: Already all odds, no change.

4. Input: [0, 1, 2, 3, 4]
   Expected Output: [0, 2, 4, 1, 3]
   Explanation: Even numbers including 0 come first.

5. Input: [11, 14, 17, 20, 25]
   Expected Output: [14, 20, 11, 17, 25]
   Explanation: Evens {14,20}, Odds {11,17,25}.

6. Input: [7]
   Expected Output: [7]
   Explanation: Single odd number remains same.

7. Input: [8]
   Expected Output: [8]
   Explanation: Single even number remains same.

8. Input: []
   Expected Output: []
   Explanation: Empty array returns empty array.

9. Input: [2, 1]
   Expected Output: [2, 1]
   Explanation: 2 is even, 1 is odd, already segregated.

10. Input: [1, 2]
    Expected Output: [2, 1]
    Explanation: Needs reordering so evens first, odds after.
*/

package Arrays;

import java.util.Scanner;

public class segregate_even_and_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        segreagteEvenAndOdd(arr);

        System.out.println("Array after segregate the even and odd values from the array: ");
        for(int i = 0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }

    public static void segreagteEvenAndOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            //Move left pointer untill the odd element to be found
            while(left < right && arr[left] % 2 == 0){
                left++;
            }

            //Move right pointer untill the even element to found
            while(left < right && arr[right] % 2 == 1){
                right--;
            }

            // swapping of the arr[left] and arr[right] element
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
