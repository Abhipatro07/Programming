/*
🔹 Test Cases for Find_triplet_that_sums_to_zero

--------------------------------------------------
🧩 Test Case 1 — Basic Case (Has one valid triplet)
Input:
arr = [-1, 0, 1, 2, -1, -4]
Expected Output:
[[-1, -1, 2], [-1, 0, 1]]
Explanation:
Both triplets sum to zero.

--------------------------------------------------
🧩 Test Case 2 — No Triplet Sums to Zero
Input:
arr = [1, 2, 3, 4, 5]
Expected Output:
[]
Explanation:
No combination of three numbers sums to 0.

--------------------------------------------------
🧩 Test Case 3 — Multiple Triplets (With Duplicates)
Input:
arr = [0, -1, 2, -3, 1]
Expected Output:
[[-3, 1, 2], [-1, 0, 1]]
Explanation:
Two distinct triplets sum to zero.

--------------------------------------------------
🧩 Test Case 4 — All Zeros
Input:
arr = [0, 0, 0, 0]
Expected Output:
[[0, 0, 0]]
Explanation:
Even though there are four zeros, only one unique triplet.

--------------------------------------------------
🧩 Test Case 5 — Negative and Positive Mix
Input:
arr = [-2, -3, 4, -1, 2, 1, 5]
Expected Output:
[[-3, -1, 4], [-3, 1, 2], [-2, -1, 3], [-2, 1, 1]]
Explanation:
Multiple combinations can give sum = 0 (depending on duplicates).

--------------------------------------------------
🧩 Test Case 6 — Only Negative Numbers
Input:
arr = [-5, -2, -3, -1, -4]
Expected Output:
[]
Explanation:
All numbers are negative; sum can’t be zero.

--------------------------------------------------
🧩 Test Case 7 — Only Positive Numbers
Input:
arr = [1, 2, 3, 4, 5]
Expected Output:
[]
Explanation:
All numbers positive; sum can’t be zero.

--------------------------------------------------
🧩 Test Case 8 — Mix with Large Values
Input:
arr = [-1000, 1500, 400, 600, -500]
Expected Output:
[[-1000, 400, 600], [-500, -1000, 1500]] (depends on array content)
Explanation:
The algorithm should handle large magnitude numbers.

--------------------------------------------------
🧩 Test Case 9 — Minimum Size Array
Input:
arr = [1, -1]
Expected Output:
[]
Explanation:
Array size < 3 → no possible triplet.

--------------------------------------------------
🧩 Test Case 10 — Triplet Appears Multiple Times (Check for Uniqueness)
Input:
arr = [-1, 0, 1, 0, 1, -1]
Expected Output:
[[-1, 0, 1]]
Explanation:
Even though same values appear multiple times, only one unique triplet.

--------------------------------------------------
🧩 Test Case 11 — Unsorted Array
Input:
arr = [3, -2, 1, 0, -1, 2, -3]
Expected Output:
[[-3, 1, 2], [-2, -1, 3], [-3, 0, 3], [-2, 0, 2], [-1, 0, 1]]
Explanation:
Order should not matter; result triplets must be unique.

--------------------------------------------------
🧩 Test Case 12 — Array with Duplicates and Multiple Zeros
Input:
arr = [-1, 0, 1, 2, -1, -4, 0, 0]
Expected Output:
[[-1, -1, 2], [-1, 0, 1], [0, 0, 0]]
Explanation:
Should handle zeros and duplicates properly.

--------------------------------------------------
🧩 Test Case 13 — Large Input (Performance Check)
Input:
arr = [Random 1000 integers between -500 and 500]
Expected Output:
All unique triplets that sum to 0 (algorithm efficiency test)
Explanation:
Used to test time complexity O(n²).
--------------------------------------------------
*/

package Arrays;

import java.util.*;

public class Find_triplet_that_sums_to_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> tripelet = findTriplets(arr);

        System.out.println("The expected output: " + tripelet);
    }

    public static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        Set<List<Integer>> uniqueTriplet = new HashSet<>();

        for(int i = 0;i<=arr.length-2;i++){
            for(int j = i+1;j<arr.length-1;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> triplet = Arrays.asList(arr[i] , arr[j] , arr[k]);
                        Collections.sort(triplet);
                        uniqueTriplet.add(triplet);
                    }
                }
            }
        }


        res.addAll(uniqueTriplet);

        return res;
    }
}
