package Number_Program;

import java.util.Scanner;

public class find_sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int res = sum_of_the_number(n);
        System.out.println("The sum of the number is: " + res);
    }

    public static int sum_of_the_number(int n) {
        int sum = 0;
         while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
         }

         return sum;
    }
}
