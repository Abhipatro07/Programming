/*
Test Cases for Count_smaller_elements_on_the_right_side:

1️⃣ Input: [12, 1, 2, 3, 0, 11, 4]
    Expected Output: [6, 1, 1, 1, 0, 1, 0]
    Explanation:
        - 12 has 6 smaller elements after it → [1,2,3,0,11,4]
        - 1 has 1 smaller → [0]
        - 2 has 1 smaller → [0]
        - 3 has 1 smaller → [0]
        - 0 has 0 smaller → []
        - 11 has 1 smaller → [4]
        - 4 has 0 smaller → []
        
2️⃣ Input: [5, 2, 6, 1]
    Expected Output: [2, 1, 1, 0]
    Explanation:
        - 5 → [2,1] → 2 smaller
        - 2 → [1] → 1 smaller
        - 6 → [1] → 1 smaller
        - 1 → [] → 0 smaller

3️⃣ Input: [3, 4, 9, 6, 1]
    Expected Output: [1, 1, 2, 1, 0]
    Explanation:
        - 3 → [1] smaller
        - 4 → [1] smaller
        - 9 → [6,1] → 2 smaller
        - 6 → [1] → 1 smaller
        - 1 → [] → 0 smaller

4️⃣ Input: [1, 2, 3, 4]
    Expected Output: [0, 0, 0, 0]
    Explanation: Array is already sorted ascendingly → no smaller elements to the right.

5️⃣ Input: [4, 3, 2, 1]
    Expected Output: [3, 2, 1, 0]
    Explanation: Each element is greater than all elements to its right.

6️⃣ Input: [7, 5, 8, 4, 6, 9, 2]
    Expected Output: [5, 2, 4, 1, 1, 1, 0]
    Explanation:
        - 7 → [5,8,4,6,9,2] → 5 smaller (5,4,6,2)
        - 5 → [8,4,6,9,2] → 2 smaller (4,2)
        - 8 → [4,6,9,2] → 4 smaller (4,6,2)
        - 4 → [6,9,2] → 1 smaller (2)
        - 6 → [9,2] → 1 smaller (2)
        - 9 → [2] → 1 smaller (2)
        - 2 → [] → 0 smaller

7️⃣ Input: [10, 10, 10]
    Expected Output: [0, 0, 0]
    Explanation: All elements are equal, so no smaller elements exist to the right.

8️⃣ Input: [1]
    Expected Output: [0]
    Explanation: Only one element, so no smaller elements.

9️⃣ Input: []
    Expected Output: []
    Explanation: Empty array.

🔟 Input: [2, 9, 7, 8, 3, 4]
    Expected Output: [1, 3, 2, 2, 0, 0]
    Explanation:
        - 2 → [9,7,8,3,4] → only 1 smaller (none)
        - 9 → [7,8,3,4] → 3 smaller (7,3,4)
        - 7 → [8,3,4] → 2 smaller (3,4)
        - 8 → [3,4] → 2 smaller (3,4)
        - 3 → [4] → 0 smaller
        - 4 → [] → 0 smaller
*/

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Count_smaller_elements_on_the_right_side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements into the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            int count = 0;

            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }

            res.add(count);
        }

        System.out.println("Expected Output is: ");
        for(int num : res){
            System.out.println(num);
        }
    }
}
