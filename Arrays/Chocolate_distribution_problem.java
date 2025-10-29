/*
 You are given an array where each element represents the number of chocolates in a packet, and m students.
The goal is to distribute exactly one packet to each student such that the difference between the maximum and minimum 
chocolates among selected packets is minimum.


Test Cases for Chocolate_distribution_problem:

1️⃣ Input:
   packets = [7, 3, 2, 4, 9, 12, 56]
   m = 3
   Expected Output: 2
   Explanation: Choose packets [2, 3, 4]; max - min = 4 - 2 = 2.

2️⃣ Input:
   packets = [3, 4, 1, 9, 56, 7, 9, 12]
   m = 5
   Expected Output: 6
   Explanation: Choose packets [3, 4, 7, 9, 9]; max - min = 9 - 3 = 6.

3️⃣ Input:
   packets = [12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50]
   m = 7
   Expected Output: 10
   Explanation: Choose packets [40, 41, 42, 43, 44, 48, 50]; difference = 50 - 40 = 10.

4️⃣ Input:
   packets = [1, 3, 4, 7, 9, 9, 12, 56]
   m = 5
   Expected Output: 8
   Explanation: Choose packets [3, 4, 7, 9, 9]; difference = 9 - 3 = 6 (best possible).

5️⃣ Input:
   packets = [5, 8, 12, 18, 22, 30]
   m = 3
   Expected Output: 10
   Explanation: Choose packets [12, 18, 22]; difference = 22 - 12 = 10.

6️⃣ Input:
   packets = [1, 2, 3, 4, 5, 6]
   m = 2
   Expected Output: 1
   Explanation: Choose [1, 2] or [2, 3] etc. Minimum difference = 1.

7️⃣ Input:
   packets = [10, 20, 30, 40, 50]
   m = 4
   Expected Output: 30
   Explanation: Choose [10, 20, 30, 40]; difference = 30.

8️⃣ Input:
   packets = [10, 10, 10, 10]
   m = 2
   Expected Output: 0
   Explanation: All packets have equal chocolates, difference = 0.

9️⃣ Input:
   packets = [4, 8, 10, 12, 15, 20, 22, 25]
   m = 3
   Expected Output: 4
   Explanation: Choose [8, 10, 12]; difference = 12 - 8 = 4.

🔟 Input:
   packets = [5, 1, 9, 3, 7, 11, 13]
   m = 4
   Expected Output: 6
   Explanation: Choose [5, 7, 9, 11]; difference = 11 - 5 = 6.

11️⃣ Input:
   packets = [1]
   m = 1
   Expected Output: 0
   Explanation: Only one student, so difference = 0.

12️⃣ Input:
   packets = [1, 2, 3]
   m = 5
   Expected Output: -1
   Explanation: Not enough packets to distribute.

13️⃣ Input:
   packets = [3, 3, 3, 3, 3]
   m = 3
   Expected Output: 0
   Explanation: All packets have same chocolates, difference = 0.

14️⃣ Input:
   packets = [20, 15, 10, 5]
   m = 2
   Expected Output: 5
   Explanation: Choose [10, 15]; difference = 5.

15️⃣ Input:
   packets = [8, 6, 4, 3, 1]
   m = 3
   Expected Output: 3
   Explanation: Choose [3, 4, 6]; difference = 6 - 3 = 3.
*/
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_distribution_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int  i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of the students: ");
        int m = sc.nextInt();

        System.out.println(findMinDiff(arr,n,m));
    }

    public static int findMinDiff(int[] arr, int n, int m) {
        if(n == 0 || m == 0){
            return 0;
        }

        Arrays.sort(arr);

        if(m > n){
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;

        //! Sliding Window approach
        for(int i = 0;i+m-1<n;i++){
            int diff = arr[i+m-1] - arr[i];

            if(diff < minDiff){
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
