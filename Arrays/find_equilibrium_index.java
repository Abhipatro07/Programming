/*
Test Cases for find_equilibrium_index:

1. Input: [1, 3, 5, 2, 2]
   Expected Output: 2
   Explanation: Sum of elements on the left of index 2 → (1 + 3) = 4
                Sum of elements on the right of index 2 → (2 + 2) = 4
                Both sides are equal, so index 2 is the equilibrium index.

2. Input: [2, 3, -1, 8, 4]
   Expected Output: 3
   Explanation: Left sum before index 3 → (2 + 3 + -1) = 4
                Right sum after index 3 → (4) = 4
                Equal sums → equilibrium index = 3.

3. Input: [1, 2, 3]
   Expected Output: -1
   Explanation: No index found where left sum equals right sum.

4. Input: [1, -1, 4]
   Expected Output: 2
   Explanation: Left sum before index 2 → (1 + -1) = 0
                Right sum after index 2 → none (0)
                Both are equal → equilibrium index = 2.

5. Input: [0, 0, 0, 0]
   Expected Output: 0
   Explanation: Every index can be an equilibrium index since all sums = 0.
                Returning the first index (0) by convention.

6. Input: [10, -10, 10, -10, 10, -10, 10]
   Expected Output: 6
   Explanation: Left sum before last index (6) → 0
                Right sum after last index → 0
                So index 6 is equilibrium.

7. Input: [20]
   Expected Output: 0
   Explanation: Single element has no left or right side,
                so both sums = 0, making it equilibrium index 0.

8. Input: [3, 4, 8, -9, 20, 6]
   Expected Output: 4
   Explanation: Left sum before index 4 → (3 + 4 + 8 + -9) = 6
                Right sum after index 4 → (6) = 6
                Both sides equal → index 4 is equilibrium.

9. Input: [1, 2, 3, 4, 6]
   Expected Output: 3
   Explanation: Left sum before index 3 → (1 + 2 + 3) = 6
                Right sum after index 3 → (6) = 6
                Index 3 is equilibrium.

10. Input: []
    Expected Output: -1
    Explanation: Empty array → no equilibrium index possible.

11. Input: [-7, 1, 5, 2, -4, 3, 0]
    Expected Output: 3
    Explanation: Left sum before index 3 → (-7 + 1 + 5) = -1
                 Right sum after index 3 → (-4 + 3 + 0) = -1
                 Both sums equal → index 3 is equilibrium.

12. Input: [2, 4, 6]
    Expected Output: -1
    Explanation: No index satisfies left sum == right sum.

13. Input: [1, 1, 1, 1, 1, 5]
    Expected Output: 5
    Explanation: Left sum before index 5 → (1+1+1+1+1) = 5
                 Right sum after index 5 → 0
                 Both sides equal → index 5 is equilibrium.

14. Input: [5, -2, 2, -5]
    Expected Output: -1
    Explanation: For no index, left sum equals right sum.

15. Input: [0, 1, -1, 0]
    Expected Output: 0
    Explanation: Left sum before index 0 → 0
                 Right sum after index 0 → (1 + -1 + 0) = 0
                 Equal sums → index 0 is equilibrium.
*/

package Arrays;

import java.util.Scanner;

public class find_equilibrium_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values to the array: ");
        for(int i = 0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int eqIndex = findEquilibriumIndex(arr);

        if(eqIndex != -1){
            System.out.println("The Equilibrium Index is: " + eqIndex);
        }
        else{
            System.out.println("No Equilibrium Index Found");
        }
    }

    public 
}
