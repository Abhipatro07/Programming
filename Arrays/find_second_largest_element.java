/*
Test Case 1
Input:
arr = [5, 2, 9, 1, 7]
Output:
Second Largest element = 7

Test Case 2
Input:
arr = [10, 20, 30, 40, 50]
Output:
Second Largest element = 40

Test Case 3
Input:
arr = [-3, -7, -1, -12, -5]
Output:
Second Largest element = -3

Test Case 4
Input:
arr = [100, 50]
Output:
Second Largest element = 50

Test Case 5
Input:
arr = [8, 8, 8, 8]
Output:
No second largest element (all elements are equal)

Test Case 6 (Edge Case)
Input:
arr = [7]
Output:
No second largest element (array has only one element)

Test Case 7
Input:
arr = [0, -1, -2, -3, 10]
Output:
Second Largest element = 0
*/


package Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class find_second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Array must have at least two elements to find the second largest.");
        }

        System.out.println("Enter the value to the array: ");

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<=n-1;i++){
            set.add(sc.nextInt());
        }

        if(set.size()<2){
            System.out.println("No second largest element (all elements may be equal).");
        }
        else{
            set.remove(set.last());
            System.out.println("The second largest elemenet is: " + set.last());
        }

    }
}
