package Number_Program;

import java.util.Scanner;

public class find_power_of_number_x_power_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the Power: ");
        int pow = sc.nextInt();

        double res = Math.pow(base, pow);

        System.out.println("The answer is: " + res);
    }
}
