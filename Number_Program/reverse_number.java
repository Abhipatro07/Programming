package Number_Program;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int res = reverse_number(n);
        System.out.println("The reversed number is: " + res);
    }

    public static int reverse_number(int n) {
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }

        return sum;
    }
}
