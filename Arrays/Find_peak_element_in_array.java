/*
Test Cases for Find_peak_element_in_array:

1️⃣ Input: [1, 2, 3, 1]
    Expected Output: 3
    Explanation: 3 is greater than both 2 (left) and 1 (right).

2️⃣ Input: [1, 2, 1, 3, 5, 6, 4]
    Expected Output: 6
    Explanation: 6 > 5 and 4 (a valid peak), 2 and 5 are also possible peaks but 6 is one of them.

3️⃣ Input: [10, 20, 15, 2, 23, 90, 67]
    Expected Output: 20 or 90
    Explanation: Both 20 > 10 & 15, and 90 > 23 & 67 are peaks.

4️⃣ Input: [5, 10, 20, 15]
    Expected Output: 20
    Explanation: 20 > 10 and 15.

5️⃣ Input: [10, 20, 15, 2, 23, 90, 67, 100]
    Expected Output: 100
    Explanation: The last element 100 is greater than 67 (only one neighbor).

6️⃣ Input: [1, 2, 3, 4, 5]
    Expected Output: 5
    Explanation: Strictly increasing — last element is peak.

7️⃣ Input: [5, 4, 3, 2, 1]
    Expected Output: 5
    Explanation: Strictly decreasing — first element is peak.

8️⃣ Input: [2, 2, 2, 2]
    Expected Output: 2
    Explanation: All elements are equal, any can be considered a peak.

9️⃣ Input: [1]
    Expected Output: 1
    Explanation: Single element array — only one peak.

🔟 Input: [3, 5, 3, 5, 3]
    Expected Output: 5 (either of them)
    Explanation: Both 5s are valid peaks.

11️⃣ Input: [0, 10, 5, 8, 7]
    Expected Output: 10 or 8
    Explanation: 10 > 0,5 and 8 > 5,7 both are valid peaks.

12️⃣ Input: [4, 3, 4, 3, 4, 3, 4]
    Expected Output: 4
    Explanation: Multiple peaks (4s at even indices).

13️⃣ Input: [1, 3, 2, 1, 4, 5, 4]
    Expected Output: 3 or 5
    Explanation: Both 3 and 5 satisfy the peak condition.

14️⃣ Input: [6, 5, 4, 3, 2, 3, 2]
    Expected Output: 6 or 3
    Explanation: 6 (first element) and 3 (local maximum) are peaks.

15️⃣ Input: [2, 7, 7, 7, 5]
    Expected Output: 7
    Explanation: Flat plateau of 7s — any of them can be a peak.
*/

package Arrays;

import java.util.Scanner;

public class Find_peak_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int peak = findPeakElement(arr);
        System.out.println("The peak element of the array is: " + peak);
    }

    public static int findPeakElement(int[] arr) {
        if(arr.length == 0){
            System.out.println("No elements present in the array");
            return -1;
        }

        if(arr.length == 1){
            return arr[0];
        }

        for(int i = 0;i<=arr.length-1;i++){
            boolean leftOk = (i == 0) || arr[i] >= arr[i-1];   //! First element has no left neighbor
            boolean rightOk = (i == arr.length-1) || arr[i] >= arr[i+1];  //! Last element has no right neighbor

            if(leftOk && rightOk){
                return arr[i];
            }
        }

        return -1;
    }
}
