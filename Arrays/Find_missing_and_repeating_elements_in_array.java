/*
Test Cases for Find_missing_and_repeating_elements_in_array

1️⃣ Input: [1, 3, 3]
    Expected Output: Missing = 2, Repeating = 3
    Explanation: 3 is repeated, and 2 is missing.

2️⃣ Input: [4, 3, 6, 2, 1, 1]
    Expected Output: Missing = 5, Repeating = 1
    Explanation: 1 occurs twice, 5 is not present.

3️⃣ Input: [7, 3, 4, 5, 5, 6, 2]
    Expected Output: Missing = 1, Repeating = 5
    Explanation: 5 is repeated, 1 is missing.

4️⃣ Input: [1, 2, 2, 4]
    Expected Output: Missing = 3, Repeating = 2
    Explanation: 2 repeats, 3 is missing.

5️⃣ Input: [1, 1]
    Expected Output: Missing = 2, Repeating = 1
    Explanation: 1 repeats, 2 is missing.

6️⃣ Input: [2, 2]
    Expected Output: Missing = 1, Repeating = 2
    Explanation: 2 repeats, 1 is missing.

7️⃣ Input: [3, 1, 3, 4, 5]
    Expected Output: Missing = 2, Repeating = 3
    Explanation: 3 repeats, 2 is missing.

8️⃣ Input: [6, 4, 3, 5, 5, 2, 1]
    Expected Output: Missing = 7, Repeating = 5
    Explanation: 5 repeats, 7 is missing.

9️⃣ Input: [2, 3, 4, 5, 6, 7, 7]
    Expected Output: Missing = 1, Repeating = 7
    Explanation: 7 repeats, 1 is missing.

🔟 Input: [1, 5, 3, 2, 2, 6, 7, 8, 9]
    Expected Output: Missing = 4, Repeating = 2
    Explanation: 2 repeats, 4 is missing.

11️⃣ Input: [1, 2, 3, 4, 5, 6, 7, 8, 8]
    Expected Output: Missing = 9, Repeating = 8
    Explanation: 8 repeats, 9 is missing.

12️⃣ Input: [10, 9, 8, 6, 7, 5, 4, 3, 2, 2]
    Expected Output: Missing = 1, Repeating = 2
    Explanation: 2 repeats, 1 is missing.

13️⃣ Input: [1, 2, 3, 5, 6, 6]
    Expected Output: Missing = 4, Repeating = 6
    Explanation: 6 repeats, 4 missing.

14️⃣ Input: [1, 2, 4, 4, 5]
    Expected Output: Missing = 3, Repeating = 4
    Explanation: 4 repeats, 3 missing.

15️⃣ Input: [5, 3, 2, 1, 1, 6, 7]
    Expected Output: Missing = 4, Repeating = 1
    Explanation: 1 repeats, 4 missing.
*/

package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Find_missing_and_repeating_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values intot the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        findMissingAndRepeatingNumber(arr , n);
    }

    public static void findMissingAndRepeatingNumber(int[] arr, int n) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int repeatingNumber = -1;
        int missingNumber = -1;

        for(int i = 1;i<=n;i++){
            if(!map.containsKey(i)){
                missingNumber = i;
            }
            else if(map.get(i) > 1){
                repeatingNumber = i;
            }
        }

        System.out.println("The Repeating Number from the array is: " + repeatingNumber);
        System.out.println("The missing number from the array is: " + missingNumber);
    }
}
