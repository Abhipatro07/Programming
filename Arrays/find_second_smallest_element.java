/*
Test Case 1
Input:
arr = [5, 2, 9, 1, 7]
Output:
Second Smallest element = 2

Test Case 2
Input:
arr = [10, 20, 30, 40, 50]
Output:
Second Smallest element = 20

Test Case 3
Input:
arr = [-3, -7, -1, -12, -5]
Output:
Second Smallest element = -7

Test Case 4
Input:
arr = [100, 50]
Output:
Second Smallest element = 100

Test Case 5
Input:
arr = [8, 8, 8, 8]
Output:
No second smallest element (all elements are equal)

Test Case 6 (Edge Case)
Input:
arr = [0, -1, -2, -3, 10]
Output:
Second Smallest element = -2

Test Case 7
Input:
arr = [1]
Output:
No second smallest element (array has only one element)
*/


package Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class find_second_smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Array must have at least two elements to find the second smallest.");
        }

        System.out.println("Enter the value to the array: ");

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<=n-1;i++){
            set.add(sc.nextInt());
        }

        if(set.size()<2){
            System.out.println("No second smallest element (all elements may be equal).");
        }
        else{
            set.remove(set.first());
            System.out.println("The second smallest elemenet is: " + set.first());
        }

    }
}
