/*
Test Case 1
Input:
arr1 = [1, 2, 3]
arr2 = [1, 2, 3]
Output:
Arrays are equal

Test Case 2
Input:
arr1 = [10, 20, 30]
arr2 = [30, 20, 10]
Output:
Arrays are equal  

Test Case 3
Input:
arr1 = [5, 5, 5]
arr2 = [5, 5, 5]
Output:
Arrays are equal

Test Case 4
Input:
arr1 = [1, 2, 3]
arr2 = [1, 2, 3, 4]
Output:
Arrays are not equal  // different sizes

Test Case 5
Input:
arr1 = []
arr2 = []
Output:
Arrays are equal  // both empty

Test Case 6
Input:
arr1 = [-1, -2, -3]
arr2 = [-1, -2, -3]
Output:
Arrays are equal

Test Case 7
Input:
arr1 = [0, 1, 2]
arr2 = [0, 1, 3]
Output:
Arrays are not equal
*/


package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class check_if_two_arrays_are_equal {
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
