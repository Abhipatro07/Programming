/*
Test Case 1
Input:
arr = [5, 2, 9, 1, 7]
Output:
Ascending: [1, 2, 5, 7, 9]
Descending: [9, 7, 5, 2, 1]

Test Case 2
Input:
arr = [10, 20, 30, 40, 50]
Output:
Ascending: [10, 20, 30, 40, 50]
Descending: [50, 40, 30, 20, 10]

Test Case 3
Input:
arr = [-3, -7, -1, -12, -5]
Output:
Ascending: [-12, -7, -5, -3, -1]
Descending: [-1, -3, -5, -7, -12]

Test Case 4
Input:
arr = [100]
Output:
Ascending: [100]
Descending: [100]

Test Case 5
Input:
arr = [8, 8, 8, 8]
Output:
Ascending: [8, 8, 8, 8]
Descending: [8, 8, 8, 8]

Test Case 6 (Edge Case)
Input:
arr = [0, -1, -2, -3]
Output:
Ascending: [-3, -2, -1, 0]
Descending: [0, -1, -2, -3]

Test Case 7
Input:
arr = [3, 1, 4, 1, 5, 9]
Output:
Ascending: [1, 1, 3, 4, 5, 9]
Descending: [9, 5, 4, 3, 1, 1]
*/

package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sort_array_ascending_descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];  // Use Integer for descending sorting with Collections
        System.out.println("Enter the elements: ");
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }

        // Ascending order
        Arrays.sort(arr);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        // Descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending order: " + Arrays.toString(arr));
    }
}
