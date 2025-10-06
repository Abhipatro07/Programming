/*
Test Cases for find_kth_smallest_element:

1. Input: [7, 10, 4, 3, 20, 15], k = 3
   Expected Output: 7
   Explanation: Sorted array = [3, 4, 7, 10, 15, 20]
                3rd smallest element = 7.

2. Input: [7, 10, 4, 20, 15], k = 4
   Expected Output: 15
   Explanation: Sorted array = [4, 7, 10, 15, 20]
                4th smallest element = 15.

3. Input: [1, 2, 3, 4, 5], k = 1
   Expected Output: 1
   Explanation: The smallest element is 1 (k = 1).

4. Input: [5, 4, 3, 2, 1], k = 5
   Expected Output: 5
   Explanation: Sorted array = [1, 2, 3, 4, 5]
                5th smallest element = 5.

5. Input: [12, 3, 5, 7, 19], k = 2
   Expected Output: 5
   Explanation: Sorted array = [3, 5, 7, 12, 19]
                2nd smallest element = 5.

6. Input: [2, 2, 2, 2, 2], k = 3
   Expected Output: 2
   Explanation: All elements are same, every kth element is 2.

7. Input: [8, 16, 80, 55, 32, 8, 38, 40, 65], k = 4
   Expected Output: 32
   Explanation: Sorted array = [8, 8, 16, 32, 38, 40, 55, 65, 80]
                4th smallest element = 32.

8. Input: [1], k = 1
   Expected Output: 1
   Explanation: Only one element, so 1st smallest = 1.

9. Input: [5, -1, 10, -3, 2], k = 2
   Expected Output: -1
   Explanation: Sorted array = [-3, -1, 2, 5, 10]
                2nd smallest element = -1.

10. Input: [10, 20, 30, 40, 50], k = 6
    Expected Output: "Invalid input"
    Explanation: k = 6 > array size (5), cannot find kth smallest element.
*/

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class find_kth_smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the value to the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number in which you want to find the smallest: ");
        int k = sc.nextInt();

        if(k > n){
            System.out.println("Invlid number you want to find");
        }

        Arrays.sort(arr);

        System.out.println("The " + k + "th smallest element of the array is: " + arr[k-1]);
    }
}
