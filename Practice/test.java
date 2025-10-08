package Practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values into the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Expected Output: ");
        for (int i = 0; i < n; i++) {
            int prev = previousPrime(arr[i]);
            int next = nextPrime(arr[i]);
            int diff = next - prev;
            System.out.print(diff + " ");
        }
    }

    public static int previousPrime(int num) {
        for (int i = num - 1; i >= 2; i--) {
            if (isPrime(i)){
                return i;
            } 
        }
        return 0; 
    }

    public static int nextPrime(int num) {
        int i = num + 1;
        while (true) {
            if (isPrime(i)){
                return i;
            } 
            i++;
            if (i > num * 2){
                break; 
            } 
        }
        return 0; 
    }

        public static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        } 
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        } 
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0){
                return false;
            } 
        }
        return true;
    }
}
