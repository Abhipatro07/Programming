/*
Test Case 1
Input:
arr = [1, 2, 2, 3, 4, 4, 5]
Output:
Array without duplicates = [1, 2, 3, 4, 5]

Test Case 2
Input:
arr = [10, 10, 10, 10]
Output:
Array without duplicates = [10]

Test Case 3
Input:
arr = [5, 4, 3, 2, 1]
Output:
Array without duplicates = [5, 4, 3, 2, 1]  // no duplicates

Test Case 4
Input:
arr = [1, 1, 2, 3, 3, 4, 5, 5]
Output:
Array without duplicates = [1, 2, 3, 4, 5]

Test Case 5
Input:
arr = []
Output:
Array without duplicates = []  // empty array remains empty

Test Case 6
Input:
arr = [7]
Output:
Array without duplicates = [7]  // single element stays same

Test Case 7
Input:
arr = [-1, -1, -2, -3, -2, 0]
Output:
Array without duplicates = [-1, -2, -3, 0]  // works with negatives

Test Case 8
Input:
arr = [100, 200, 300, 200, 100, 400]
Output:
Array without duplicates = [100, 200, 300, 400]

Test Case 9
Input:
arr = [1, 2, 3, 4, 5, 1, 2, 3]
Output:
Array without duplicates = [1, 2, 3, 4, 5]

Test Case 10 (Edge Case - Already unique sorted array)
Input:
arr = [1, 2, 3, 4, 5]
Output:
Array without duplicates = [1, 2, 3, 4, 5]
*/

package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class remove_duplicates_from_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value to the Array: ");
        for(int i = 0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<=n-1;i++){
            set.add(arr[i]);
        }

        System.out.println("The elements of array without the dulipcates is: ");
        for(int num : set){
            System.out.print(num + " ");
        }
    }
}
