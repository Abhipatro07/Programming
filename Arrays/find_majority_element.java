/*
Test Cases for find_majority_element:

1. Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
   Expected Output: 4
   Explanation: Array size n=9, n/2=4. 4 appears 5 times (>4), so it's the majority.

2. Input: [3, 3, 4, 2, 4, 4, 2, 4]
   Expected Output: "No majority element"
   Explanation: Array size n=8, n/2=4. No element appears more than 4 times.

3. Input: [1, 1, 1, 1, 2, 3, 4]
   Expected Output: 1
   Explanation: 1 appears 4 times, n=7, n/2=3. 1 is majority.

4. Input: [1, 2, 3, 4, 5]
   Expected Output: "No majority element"
   Explanation: Each element appears only once, no majority.

5. Input: [2, 2, 2, 2, 2]
   Expected Output: 2
   Explanation: All elements are 2, which is obviously the majority.

6. Input: [1]
   Expected Output: 1
   Explanation: Single element array, the only element is majority.

7. Input: [1, 2, 3, 1, 2, 1, 1]
   Expected Output: 1
   Explanation: n=7, n/2=3. 1 appears 4 times (>3), so it's majority.

8. Input: [5, 5, 5, 6, 6, 5, 7, 5]
   Expected Output: 5
   Explanation: 5 appears 5 times, n=8, n/2=4, so 5 is majority.

9. Input: []
   Expected Output: "No majority element"
   Explanation: Empty array, no elements exist.

10. Input: [0, 0, 1, 0, 2, 0, 3, 0]
    Expected Output: 0
    Explanation: 0 appears 5 times, n=8, n/2=4, so 0 is majority.
*/

package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class find_majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int maj = n/2;

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        boolean found = false;
        for(int key : map.keySet()){
            if(map.get(key) >= maj){
                System.out.println("The majority element is: " + key);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("There is no majority element in the array");
        }
    }
}
