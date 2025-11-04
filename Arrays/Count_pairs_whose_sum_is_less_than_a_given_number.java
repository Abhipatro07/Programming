/*
Test Cases for Count_pairs_whose_sum_is_less_than_a_given_number:

1️⃣ Input: arr = [1, 3, 4, 5, 7], sum = 8  
    Expected Output: 6  
    Explanation: Valid pairs are (1,3), (1,4), (1,5), (1,7), (3,4), (3,5)

2️⃣ Input: arr = [2, 4, 6, 8, 10], sum = 12  
    Expected Output: 6  
    Explanation: Valid pairs → (2,4), (2,6), (2,8), (4,6), (4,8), (6,8)

3️⃣ Input: arr = [5, 1, 3, 4, 7], sum = 12  
    Expected Output: 8  
    Explanation: After sorting [1,3,4,5,7], valid pairs:  
    (1,3), (1,4), (1,5), (1,7), (3,4), (3,5), (3,7), (4,5)

4️⃣ Input: arr = [1, 2, 3, 4, 5], sum = 10  
    Expected Output: 10  
    Explanation: All pairs have sum < 10.

5️⃣ Input: arr = [10, 12, 15], sum = 5  
    Expected Output: 0  
    Explanation: No pairs have sum < 5.

6️⃣ Input: arr = [1, 1, 1, 1], sum = 3  
    Expected Output: 6  
    Explanation: All (1,1) pairs = 2 < 3 → total 4C2 = 6.

7️⃣ Input: arr = [3, 5, 9, 2], sum = 8  
    Expected Output: 3  
    Explanation: Pairs → (3,2), (5,2), (3,5)

8️⃣ Input: arr = [1], sum = 5  
    Expected Output: 0  
    Explanation: Single element — no pairs possible.

9️⃣ Input: arr = [], sum = 10  
    Expected Output: 0  
    Explanation: Empty array — no pairs.

🔟 Input: arr = [4, 6, 2, 7, 8, 1], sum = 9  
    Expected Output: 8  
    Explanation: Valid pairs (after sorting [1,2,4,6,7,8]):  
    (1,2), (1,4), (1,6), (1,7), (1,8), (2,4), (2,6), (2,7)
*/

package Arrays;

import java.util.Scanner;

public class Count_pairs_whose_sum_is_less_than_a_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int count = 0;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] + arr[j] <= target){
                    count++;
                }
            }
        }

        System.out.println("The expected count is: " + count);
    }
}
