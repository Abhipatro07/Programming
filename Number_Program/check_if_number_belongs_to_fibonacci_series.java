package Number_Program;

import java.util.Scanner;

public class check_if_number_belongs_to_fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(isFibonacci(n)){
            System.out.println(n + " Is a fibonacci number");
        }
        else{
            System.out.println(n + " is not a fibonacci number");
        }
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n -4);
    }

    public static boolean isPerfectSquare(int i) {
        int s = (int) Math.sqrt(i);
        return (s * s == i);
    }
}
