package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class copy_elements_from_one_array_to_another {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of the array: ");
        int arr1[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr1[i] = sc.nextInt();
        }


        int arr2[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array (using loop): " + Arrays.toString(arr2));
    }
}
