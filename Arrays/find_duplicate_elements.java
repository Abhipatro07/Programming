/*
Test Cases for find_duplicate_elements:

1. Input: [1, 2, 3, 4, 2, 5]
   Expected Output: [2]
   Explanation: 2 appears twice in the array.

2. Input: [10, 20, 30, 40, 50]
   Expected Output: []
   Explanation: No duplicates, so output is empty.

3. Input: [5, 5, 5, 5]
   Expected Output: [5]
   Explanation: 5 repeats multiple times, but reported once.

4. Input: [1, 2, 3, 4, 3, 2, 1]
   Expected Output: [1, 2, 3]
   Explanation: 1, 2, and 3 all appear more than once.

5. Input: []
   Expected Output: []
   Explanation: Empty array → no duplicates.

6. Input: [-1, -2, -3, -1, -2]
   Expected Output: [-1, -2]
   Explanation: Works for negative numbers too.

7. Input: [0, 0, 1, 2, 3]
   Expected Output: [0]
   Explanation: Zero is repeated.

8. Input: [7]
   Expected Output: []
   Explanation: Single element cannot have duplicates.

9. Input: [1, 2, 2, 2, 3, 3]
   Expected Output: [2, 3]
   Explanation: 2 appears 3 times, 3 appears twice.

10. Input: [100, 200, 300, 100, 100]
    Expected Output: [100]
    Explanation: 100 repeats multiple times, reported once.
*/

package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class find_duplicate_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> rep = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                rep.add(key);
            }
        }

        if(rep.isEmpty()){
            System.out.println("No duplicates are there in the array");
        }
        else{
            System.out.println("The duplicate elements are: ");
            for(int i = 0;i<=rep.size()-1;i++){
            System.out.println(rep.get(i));
        }
        }
        
    }
}
