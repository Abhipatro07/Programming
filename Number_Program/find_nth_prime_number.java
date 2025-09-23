package Number_Program;

import java.util.Scanner;

public class find_nth_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (to find the nth prime): ");
        int n = sc.nextInt();

        int count = 0;   // how many primes found so far
        int num = 1;     // current number to check

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("The " + n + "th prime number is: " + num);
    }

    // function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
