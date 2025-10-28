/*
Test Cases for Find_duplicate_numbers_in_an_array:

1. Input: [1, 2, 3, 4, 5]
   Expected Output: []
   Explanation: No element repeats, so no duplicates found.

2. Input: [1, 2, 3, 2, 4, 5]
   Expected Output: [2]
   Explanation: Only number 2 appears more than once.

3. Input: [4, 3, 6, 3, 4, 5, 6]
   Expected Output: [3, 4, 6]
   Explanation: Numbers 3, 4, and 6 occur multiple times.

4. Input: [1, 1, 1, 1]
   Expected Output: [1]
   Explanation: Number 1 repeats multiple times but listed once as duplicate.

5. Input: [10, 20, 30, 40, 10, 20]
   Expected Output: [10, 20]
   Explanation: Both 10 and 20 appear twice.

6. Input: [0, 0, 1, 2, 3, 4]
   Expected Output: [0]
   Explanation: Zero appears more than once.

7. Input: [5, 4, 3, 2, 1]
   Expected Output: []
   Explanation: All numbers are unique, no duplicates.

8. Input: [9, 9, 9, 8, 8, 7]
   Expected Output: [8, 9]
   Explanation: Numbers 8 and 9 repeat.

9. Input: [1]
   Expected Output: []
   Explanation: Single element cannot have duplicates.

10. Input: []
    Expected Output: []
    Explanation: Empty array has no elements, so no duplicates.

11. Input: [2, 3, 4, 2, 3, 4, 5]
    Expected Output: [2, 3, 4]
    Explanation: Numbers 2, 3, and 4 appear more than once.

12. Input: [10, 11, 12, 13, 14, 15]
    Expected Output: []
    Explanation: No repeated numbers in the array.

13. Input: [7, 7, 7, 7, 7, 7, 7]
    Expected Output: [7]
    Explanation: Only number 7 repeats multiple times.

14. Input: [0, 1, 0, 1, 0, 1]
    Expected Output: [0, 1]
    Explanation: Both 0 and 1 appear more than once.

15. Input: [100, 200, 300, 100, 400, 500, 200]
    Expected Output: [100, 200]
    Explanation: 100 and 200 are repeated values.
*/

package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Find_duplicate_numbers_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the value into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println("Duplicate elements are: ");
        boolean falg = false;

        for(int key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key + " ");
                falg = true;
            }
        }

        if(!falg){
            System.out.println("No duplicate elements are there");
        }
    }
}
