package Number_Program;

import java.util.Scanner;

public class find_product_of_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int res = productOfDigit(n);
        System.out.println("The product of digits of the given number is: " + res);
    }

    public static int productOfDigit(int n) {
        int mul = 1;

        while(n != 0){
            int rem = n % 10;
            mul = mul * rem;
            n = n / 10;
        }

        return mul;
    }
}
