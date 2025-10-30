/*
Test Cases for Find_missing_ranges_in_array:

1️⃣ Input: nums = [0, 1, 3, 50, 75], lower = 0, upper = 99
    Expected Output: ["2", "4->49", "51->74", "76->99"]
    Explanation: Missing ranges are:
      - 2
      - 4 to 49
      - 51 to 74
      - 76 to 99

2️⃣ Input: nums = [], lower = 1, upper = 1
    Expected Output: ["1"]
    Explanation: No numbers present; whole range [1,1] is missing.

3️⃣ Input: nums = [], lower = 1, upper = 5
    Expected Output: ["1->5"]
    Explanation: Entire range missing.

4️⃣ Input: nums = [1, 3, 5, 7], lower = 1, upper = 7
    Expected Output: ["2", "4", "6"]
    Explanation: Missing numbers between each consecutive element.

5️⃣ Input: nums = [2, 3, 5, 50, 75], lower = 1, upper = 99
    Expected Output: ["1", "4", "6->49", "51->74", "76->99"]
    Explanation: Multiple single and range gaps.

6️⃣ Input: nums = [0, 1, 2, 3, 4, 5], lower = 0, upper = 5
    Expected Output: []
    Explanation: No missing numbers.

7️⃣ Input: nums = [5, 10, 15], lower = 0, upper = 20
    Expected Output: ["0->4", "6->9", "11->14", "16->20"]
    Explanation: Several ranges missing between elements.

8️⃣ Input: nums = [10], lower = 0, upper = 10
    Expected Output: ["0->9"]
    Explanation: Everything before 10 missing.

9️⃣ Input: nums = [0], lower = 0, upper = 0
    Expected Output: []
    Explanation: Lower and upper both equal to array element.

🔟 Input: nums = [1, 2, 3, 4, 5, 6, 7, 8, 9], lower = 1, upper = 10
    Expected Output: ["10"]
    Explanation: Only upper boundary number is missing.

11️⃣ Input: nums = [3, 5, 8, 9], lower = 1, upper = 10
    Expected Output: ["1->2", "4", "6->7", "10"]
    Explanation: Mixed single and range gaps.

12️⃣ Input: nums = [1, 100], lower = 1, upper = 100
    Expected Output: ["2->99"]
    Explanation: Everything between 2 and 99 is missing.

13️⃣ Input: nums = [5], lower = 5, upper = 10
    Expected Output: ["6->10"]
    Explanation: Range after the single number missing.

14️⃣ Input: nums = [6], lower = 0, upper = 6
    Expected Output: ["0->5"]
    Explanation: Range before the number missing.

15️⃣ Input: nums = [0, 2, 5, 7, 9, 10], lower = 0, upper = 10
    Expected Output: ["1", "3->4", "6", "8"]
    Explanation: Combination of single and multiple ranges.
*/

package Arrays;

import java.util.*;

public class Find_missing_ranges_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the lower value: ");
        int lower = sc.nextInt();
        System.out.println("Enter the higher value: ");
        int higher = sc.nextInt();

        List<String> res = finMissingNumber(arr , lower , higher);
        
        System.out.println("The missing numbers are: " + res);
    }

    public static List<String> finMissingNumber(int[] arr, int lower, int higher) {
        List<String> res = new ArrayList<>();

        //! When array is empty
        if(arr.length == 0){
            System.out.println(formatRange(lower , higher));
            return res;
        }

        //! check the before the first element
        if(arr[0] > lower){
            res.add(formatRange(lower,arr[0] - 1));
        }

        //! Checks the rane between the elements
        for(int i = 1;i<arr.length;i++){
            //! If there is a gap between nums[i-1] and nums[i]
            if(arr[i] - arr[i-1] > 1){
                res.add(formatRange(arr[i-1] + 1, arr[i] - 1));
            }
        }

        //! CHeck the condition after the last element
        if(arr[arr.length-1] < higher){
            res.add(formatRange(arr[arr.length-1] + 1, higher));
        }

        return res;
    }

    public static String formatRange(int lower, int higher) {
        if(lower == higher){
            return String.valueOf(lower);
        }
        else{
            return lower + " -> " + higher;    
        }
    }
}
