/*
Test Cases for Sliding_window_maximum:

1️⃣ Input: nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3  
    Expected Output: [3, 3, 5, 5, 6, 7]  
    Explanation:  
    Windows →  
    [1,3,-1] → max=3  
    [3,-1,-3] → max=3  
    [-1,-3,5] → max=5  
    [-3,5,3] → max=5  
    [5,3,6] → max=6  
    [3,6,7] → max=7  

2️⃣ Input: nums = [1, -1], k = 1  
    Expected Output: [1, -1]  
    Explanation: Window size 1, so each element is its own maximum.

3️⃣ Input: nums = [9, 11], k = 2  
    Expected Output: [11]  
    Explanation: Only one window [9,11], max=11.

4️⃣ Input: nums = [4, 2, 12, 3, 8], k = 2  
    Expected Output: [4, 12, 12, 8]  
    Explanation:  
    [4,2]→4, [2,12]→12, [12,3]→12, [3,8]→8.

5️⃣ Input: nums = [1, 3, 1, 2, 0, 5], k = 3  
    Expected Output: [3, 3, 2, 5]  
    Explanation:  
    [1,3,1]→3, [3,1,2]→3, [1,2,0]→2, [2,0,5]→5.

6️⃣ Input: nums = [10, 9, 8, 7, 6, 5], k = 3  
    Expected Output: [10, 9, 8, 7]  
    Explanation: Decreasing order — first element always max.

7️⃣ Input: nums = [1, 2, 3, 4, 5], k = 2  
    Expected Output: [2, 3, 4, 5]  
    Explanation: Increasing order — last element always max.

8️⃣ Input: nums = [7, 7, 7, 7, 7], k = 3  
    Expected Output: [7, 7, 7]  
    Explanation: All elements are equal, every window max=7.

9️⃣ Input: nums = [1], k = 1  
    Expected Output: [1]  
    Explanation: Single element array.

🔟 Input: nums = [5, 2, -1, 0, 3], k = 4  
    Expected Output: [5, 3]  
    Explanation:  
    [5,2,-1,0]→5, [2,-1,0,3]→3.

11️⃣ Input: nums = [100, 200, 300, 400, 500], k = 3  
    Expected Output: [300, 400, 500]  
    Explanation: Increasing sequence, last of each window is max.

12️⃣ Input: nums = [9, 8, 7, 6, 5], k = 1  
    Expected Output: [9, 8, 7, 6, 5]  
    Explanation: Each element forms its own window.
*/

package Arrays;

import java.util.*;

public class Sliding_window_maximum_easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter window size (k):");
        int k = sc.nextInt();

        int[] result = maxSlidingWindow(arr, k);
        System.out.println("Sliding window maximums: " + Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int maxVal = nums[i];
            // Check every element in the current window
            for (int j = i; j < i + k; j++) {
                if (nums[j] > maxVal) {
                    maxVal = nums[j];
                }
            }
            result[i] = maxVal;
        }

        return result;
    }
}