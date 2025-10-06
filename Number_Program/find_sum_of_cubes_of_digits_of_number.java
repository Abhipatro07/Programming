package Number_Program;

import java.util.Scanner;

public class find_sum_of_cubes_of_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The sum of the cube of the number is: " + sumOfCubeOfDigit(n));
    }

    public static int sumOfCubeOfDigit(int n) {
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            int sq = rem * rem * rem;
            sum = sum + sq;
            n = n / 10;
        }

        return sum;
    }
}
