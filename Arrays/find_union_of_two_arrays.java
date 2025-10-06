package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class find_union_of_two_arrays {
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

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<=n-1;i++){
            set.add(arr1[i]);
        }

        for(int i = 0;i<=m-1;i++){
            set.add(arr2[i]);
        }

        System.out.println("The union of the two arrays is: ");
        for(int num : set){
            System.out.println(num);
        }

    }
}
