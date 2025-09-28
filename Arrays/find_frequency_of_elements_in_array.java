/*
Test Case 1
Input:
arr = [1, 2, 2, 3, 3, 3]
Output:
1 → 1 time
2 → 2 times
3 → 3 times

Test Case 2
Input:
arr = [5, 5, 5, 5, 5]
Output:
5 → 5 times (all elements same)

Test Case 3
Input:
arr = [10, 20, 30, 40]
Output:
10 → 1 time
20 → 1 time
30 → 1 time
40 → 1 time (all elements unique)

Test Case 4
Input:
arr = []
Output:
(No elements, empty array → No frequency to display)

Test Case 5
Input:
arr = [0, -1, -1, 2, 0, 2, 2]
Output:
0 → 2 times
-1 → 2 times
2 → 3 times

Test Case 6
Input:
arr = [7]
Output:
7 → 1 time (single element array)

Test Case 7
Input:
arr = [4, 4, 6, 6, 6, 4, 8, 8, 8, 8]
Output:
4 → 3 times
6 → 3 times
8 → 4 times

Test Case 8
Input:
arr = [100, 200, 100, 300, 200, 100]
Output:
100 → 3 times
200 → 2 times
300 → 1 time
*/

package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class find_frequency_of_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value to the Array: ");
        for(int i = 0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        if(arr.length == 0){
            System.out.println("No elements, empty array → No frequency to display");
        }

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println("The frequence of the numbers in the array: ");

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}
