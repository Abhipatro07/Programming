/*
Given an array and multiple queries (L, R), for each query, 
find the smallest prime within the subarray arr[L:R].
arr = [8, 58, 25, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28]
queries = [(0, 5), (2, 9), (5, 14)]
Output: [31, 43, 43]
 */

import java.util.ArrayList;

public class code4 {

    public static void main(String[] args) {
        int arr[] = {8, 58, 25, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        int queries[] = {0, 5, 2, 9, 5, 14};
        ArrayList<Integer> res = new ArrayList<>();

        //! for quesries
        for (int j = 0; j <= queries.length - 1; j = j + 2) {
            for (int k = j + 1; k <= queries.length - 2; k = k + 2) {
                int start = queries[j];
                int end = queries[k];
                int output = findSmallestPrime(arr, start, end);
                if (output != -1) {
                    res.add(output);
                }
            }
        }

        for (int i = 0; i <= res.size() - 1; i++) {
            System.out.println(res.get(i));
        }

    }

    public static int findSmallestPrime(int[] arr, int j, int k) {
        int output = -1;
        while (j < k) {
            if (j == k) {
                break;
            }

            if (isPrime(arr[j])) {
                output = arr[j];
            }
            j++;
        }

        return output;
    }

    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i % 2 == 0) {
            return false;
        }
        for (int j = 3; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;

    }
}
