package Practice;

// Given an array of positive integers, replace every element with the least greater prime number element to its right.
// If there is no prime number element to its right, replace it with -1. For instance, given the array
// input : 
// [8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28],
// Output:
//  [31,71,-1,31,43,43,71,-1,-1,-1,-1,-1,-1,-1]

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        int[] arr = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        int n = arr.length;
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            int nextPrime = -1; // default value if no prime is found
            for (int j = i + 1; j < n; j++) {
                if (isPrime(arr[j]) && arr[j] > arr[i]) {
                    // if it's the first valid prime or smaller than the previous found one
                    if (nextPrime == -1 || arr[j] < nextPrime) {
                        nextPrime = arr[j];
                    }
                }
            }
            output[i] = nextPrime;
        }

        System.out.println("Output: " + Arrays.toString(output));
    }

    // Simple prime checking function
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
