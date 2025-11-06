/*
🔹 Test Cases for Find_k_closest_elements_to_a_given_number

--------------------------------------------------
🧩 Test Case 1 — Standard Case
Input:
arr = [1, 2, 3, 4, 5]
K = 4
X = 3
Expected Output:
[1, 2, 3, 4]
Explanation:
Closest 4 elements to 3 are [1, 2, 3, 4]

--------------------------------------------------
🧩 Test Case 2 — K Smaller than Array Size
Input:
arr = [1, 2, 3, 4, 5]
K = 2
X = 3
Expected Output:
[2, 3]

--------------------------------------------------
🧩 Test Case 3 — X Smaller Than All Elements
Input:
arr = [10, 20, 30, 40, 50]
K = 3
X = 5
Expected Output:
[10, 20, 30]
Explanation:
Since 5 is smaller than all, take the first 3 elements.

--------------------------------------------------
🧩 Test Case 4 — X Greater Than All Elements
Input:
arr = [1, 2, 3, 4, 5]
K = 2
X = 10
Expected Output:
[4, 5]
Explanation:
Since 10 is larger than all, take the last 2 elements.

--------------------------------------------------
🧩 Test Case 5 — X Exactly Matches an Element
Input:
arr = [1, 3, 5, 7, 9]
K = 3
X = 5
Expected Output:
[3, 5, 7]

--------------------------------------------------
🧩 Test Case 6 — Array Contains Negative Numbers
Input:
arr = [-10, -5, -2, 0, 1, 4, 8]
K = 3
X = -3
Expected Output:
[-5, -2, 0]
Explanation:
Closest 3 elements around -3.

--------------------------------------------------
🧩 Test Case 7 — K Equal to Array Size
Input:
arr = [1, 2, 3, 4, 5]
K = 5
X = 10
Expected Output:
[1, 2, 3, 4, 5]

--------------------------------------------------
🧩 Test Case 8 — Array with Duplicates
Input:
arr = [1, 2, 2, 2, 3, 4, 5]
K = 3
X = 2
Expected Output:
[2, 2, 2]
Explanation:
All duplicates of 2 are closest.

--------------------------------------------------
🧩 Test Case 9 — Large Gap Around X
Input:
arr = [1, 2, 10, 15, 20, 25]
K = 3
X = 12
Expected Output:
[10, 15, 20]

--------------------------------------------------
🧩 Test Case 10 — X Lies Between Elements
Input:
arr = [2, 5, 6, 7, 8, 8, 9]
K = 4
X = 6.5
Expected Output:
[5, 6, 7, 8]
Explanation:
6.5 is between 6 and 7, closest 4 elements are [5, 6, 7, 8].

--------------------------------------------------
🧩 Test Case 11 — X is a Negative and Array Mixed
Input:
arr = [-20, -10, -5, 0, 5, 10]
K = 3
X = -7
Expected Output:
[-10, -5, 0]

--------------------------------------------------
🧩 Test Case 12 — Small Array, Large K
Input:
arr = [1, 2]
K = 5
X = 3
Expected Output:
[1, 2]
Explanation:
If K > array size, return all elements.

--------------------------------------------------
🧩 Test Case 13 — All Elements Same
Input:
arr = [5, 5, 5, 5, 5]
K = 3
X = 5
Expected Output:
[5, 5, 5]

--------------------------------------------------
🧩 Test Case 14 — K = 1 (Single Closest Element)
Input:
arr = [1, 3, 8, 10, 15]
K = 1
X = 12
Expected Output:
[10]
--------------------------------------------------
*/

package Arrays;

import java.util.*;

public class Find_k_closest_elements_to_a_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of the k: ");
        int k = sc.nextInt();

        System.out.println("Enter the value of the x: ");
        int x = sc.nextInt();

        List<Integer> res = findKCllsestElement(arr , k , x);

        System.out.println("K closest elements: " + res);

    }

    public static List<Integer> findKCllsestElement(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;

        while(right - left + 1 > k){
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            }
            else{
                right++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = left;i<=right;i++){
            result.add(arr[i]);
        }

        return result;
    }
}
