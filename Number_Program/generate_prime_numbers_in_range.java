package Number_Program;

import java.util.Scanner;

public class generate_prime_numbers_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lowest number: ");
        int low = sc.nextInt();
        System.out.println("Enter the highest number: ");
        int high = sc.nextInt();

        System.out.println("The Prime number of the given range is: ");
        for (int i = low; i < high; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 3; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
