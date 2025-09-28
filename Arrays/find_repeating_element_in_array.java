/*
Test Case 1
Input:
arr = [1, 2, 3, 4, 2, 5]
Output:
Repeating element(s) = 2

Test Case 2
Input:
arr = [10, 20, 30, 40, 50]
Output:
No repeating elements

Test Case 3
Input:
arr = [5, 5, 5, 5]
Output:
Repeating element(s) = 5

Test Case 4
Input:
arr = [1, 2, 3, 4, 3, 2, 1]
Output:
Repeating element(s) = 1 2 3

Test Case 5
Input:
arr = []
Output:
No repeating elements

Test Case 6
Input:
arr = [-1, -2, -3, -1, -2]
Output:
Repeating element(s) = -1 -2

Test Case 7
Input:
arr = [0, 0, 1, 2, 3]
Output:
Repeating element(s) = 0

Test Case 8
Input:
arr = [7]
Output:
No repeating elements

Test Case 9 (Edge Case)
Input:
arr = [1, 2, 2, 2, 3, 3]
Output:
Repeating element(s) = 2 3

Test Case 10
Input:
arr = [100, 200, 300, 100, 100]
Output:
Repeating element(s) = 100
*/

package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class find_repeating_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value to the Array: ");
        for(int i = 0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+ 1);
        }

        System.out.println("The repeating elemnets of the arrays: ");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
