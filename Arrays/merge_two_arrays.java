/*
Test Case 1
Input:
arr1 = [1, 3, 5]
arr2 = [2, 4, 6]
Output:
Merged array = [1, 3, 5, 2, 4, 6]

Test Case 2
Input:
arr1 = [10, 20]
arr2 = [30, 40, 50]
Output:
Merged array = [10, 20, 30, 40, 50]

Test Case 3
Input:
arr1 = []
arr2 = [1, 2, 3]
Output:
Merged array = [1, 2, 3]

Test Case 4
Input:
arr1 = [1, 2, 3]
arr2 = []
Output:
Merged array = [1, 2, 3]

Test Case 5
Input:
arr1 = []
arr2 = []
Output:
Merged array = []  // empty arrays merge to empty

Test Case 6
Input:
arr1 = [-1, -2, -3]
arr2 = [0, 1, 2]
Output:
Merged array = [-1, -2, -3, 0, 1, 2]

Test Case 7
Input:
arr1 = [5, 5, 5]
arr2 = [5, 5]
Output:
Merged array = [5, 5, 5, 5, 5]
*/

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class merge_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int n = sc.nextInt();

        System.out.println("Enter the values to the array1: ");
        int arr1[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the array2: ");
        int m = sc.nextInt();

        System.out.println("Enter the values to the array2: ");
        int arr2[] = new int[m];
        for(int i = 0;i<=m-1;i++){
            arr2[i] = sc.nextInt();
        }

        int res[] = new int[n+m];
        for(int i = 0;i<=n-1;i++){
            res[i] = arr1[i];
        }
        for(int i = 0;i<=m-1;i++){
            res[n+i] = arr2[i];
        }

        System.out.println("Merged Array is: " + Arrays.toString(res) );

    }
}
