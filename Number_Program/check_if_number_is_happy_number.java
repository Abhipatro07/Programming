package Number_Program;

import java.util.HashSet;
import java.util.Scanner;

public class check_if_number_is_happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isHappyNumber(n)) {
            System.out.println("It is a Happy Number");
        } else {
            System.out.println("It is Not a Happy Number");
        }
    }

    public static boolean isHappyNumber(int n) {
        HashSet<Integer> seen = new HashSet<>(); // to detect cycles

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }

        return n == 1; // if it reaches 1 → Happy, else → Not Happy
    }

    // Helper function: calculate sum of squares of digits
    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
