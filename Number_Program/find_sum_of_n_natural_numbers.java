package Number_Program;

import java.util.Scanner;

public class find_sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the sum: ");
        int n = sc.nextInt();
        int res = n * (n + 1) / 2;

        System.out.println("The sum is: " + res);
    }
}
