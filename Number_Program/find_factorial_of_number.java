package Number_Program;

import java.util.Scanner;

public class find_factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int res = factorial(n);
        System.out.println("The factorial of the number is: " + res);
    }

    public static int factorial(int n) {
        int mul = 1;

        if(n == 0 || n == 1){
            return 1;
        }

        while(n != 1){
            mul = mul * n;
            n--;
        }

        return mul;
    }
}
