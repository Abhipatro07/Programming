package Number_Program;

import java.util.Scanner;

public class check_if_number_is_buzz_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isBuzzNumber(n)){
            System.out.println("It is a Buzz Number");
        }
        else{
            System.out.println("It is not a Buzz Number");
        }
    }

    public static boolean isBuzzNumber(int n) {
        int lastDigit = n % 10;
        return lastDigit == 7 || n % 7 == 0;
    }
}
