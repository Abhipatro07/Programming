/*
Test Case 1
Input:
arr = [5, 2, 9, 1, 7]
Output:
Smallest element = 1

Test Case 2
Input:
arr = [10, 20, 30, 40, 50]
Output:
Smallest element = 10

Test Case 3
Input:
arr = [-3, -7, -1, -12, -5]
Output:
Smallest element = -12

Test Case 4
Input:
arr = [100]
Output:
Smallest element = 100

Test Case 5
Input:
arr = [8, 8, 8, 8]
Output:
Smallest element = 8

Test Case 6 (Edge Case)
Input:
arr = [0, -1, -2, -3]
Output:
Smallest element = -3
*/

package Arrays;

import java.util.Scanner;

public class find_smallest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i = 0;i<=n-1;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The smallest elemnet if the array: " + min);
    }
}
