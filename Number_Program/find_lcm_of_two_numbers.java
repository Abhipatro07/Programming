package Number_Program;

import java.util.Scanner;

public class find_lcm_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int res = (a * b) / GCD(a , b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + res);
    }

    public static int GCD(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
