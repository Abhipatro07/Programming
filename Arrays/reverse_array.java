/*
Test Case 1
Input:
arr = [1, 2, 3, 4, 5]
Output:
Reversed array = [5, 4, 3, 2, 1]

Test Case 2
Input:
arr = [10, 20, 30, 40]
Output:
Reversed array = [40, 30, 20, 10]

Test Case 3
Input:
arr = [-1, -2, -3, -4]
Output:
Reversed array = [-4, -3, -2, -1]

Test Case 4
Input:
arr = [100]
Output:
Reversed array = [100]

Test Case 5
Input:
arr = [7, 7, 7, 7]
Output:
Reversed array = [7, 7, 7, 7]

Test Case 6 (Edge Case)
Input:
arr = []
Output:
Reversed array = []  // empty array remains empty

Test Case 7
Input:
arr = [1, 2, 3, 4, 5, 6]
Output:
Reversed array = [6, 5, 4, 3, 2, 1]
*/

package Arrays;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The reverse of the array is: ");
        for(int i = n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
