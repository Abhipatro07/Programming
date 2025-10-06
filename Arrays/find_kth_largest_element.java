package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class find_kth_largest_element {
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
        
        System.out.println("The " + k + "th largest element of the array is: " + arr[n-k]);

    }
}
