package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class find_intersection_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the values to the array1: ");
        for(int i = 0;i<=n-1;i++){
            arr1[i]= sc.nextInt();
        }

        System.out.println("Enter the size of the Second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the values to the array1: ");
        for(int i = 0;i<=m-1;i++){
            arr2[i]= sc.nextInt();
        }

        ArrayList<Integer> intersection = new ArrayList<>();

        // Find intersection
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection.add(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE; // Avoid counting duplicates
                    break;
                }
            }
        }

        // Print result
        if (intersection.isEmpty()) {
            System.out.println("No common elements.");
        } else {
            System.out.println("Intersection of two arrays: " + intersection);
        }


    }
}
