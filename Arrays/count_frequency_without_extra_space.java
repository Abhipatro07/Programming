/*
Test Cases for count_frequency_without_extra_space:

1. Input: arr = [2, 3, 3, 2, 5]
   Expected Output: 2 occurs 2 times, 3 occurs 2 times, 5 occurs 1 time
   Explanation: Counts frequency of each element without using extra space.

2. Input: arr = [1, 1, 1, 1]
   Expected Output: 1 occurs 4 times
   Explanation: Single unique element repeated.

3. Input: arr = [1, 2, 3, 4, 5]
   Expected Output: 1 occurs 1 time, 2 occurs 1 time, 3 occurs 1 time, 4 occurs 1 time, 5 occurs 1 time
   Explanation: All elements unique.

4. Input: arr = [4, 4, 4, 4, 4]
   Expected Output: 4 occurs 5 times
   Explanation: All elements same.

5. Input: arr = [1, 2, 2, 1, 1, 3]
   Expected Output: 1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time
   Explanation: Mix of repeated and unique elements.

6. Input: arr = [0, 0, 0]
   Expected Output: 0 occurs 3 times
   Explanation: All zeros.

7. Input: arr = [5]
   Expected Output: 5 occurs 1 time
   Explanation: Single element array.

8. Input: arr = []
   Expected Output: No elements
   Explanation: Empty array → no frequency to count.

9. Input: arr = [2, 3, 2, 3, 2, 3]
   Expected Output: 2 occurs 3 times, 3 occurs 3 times
   Explanation: Two elements alternating.

10. Input: arr = [7, 8, 7, 9, 7, 8]
    Expected Output: 7 occurs 3 times, 8 occurs 2 times, 9 occurs 1 time
    Explanation: Counts all element frequencies.
*/

package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class count_frequency_without_extra_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int res : map.keySet()){
            System.out.println(res + " occurs " + map.get(res) + " times");
        }
    }
}
