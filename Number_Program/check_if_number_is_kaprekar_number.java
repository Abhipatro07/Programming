package Number_Program;

import java.util.Scanner;

public class check_if_number_is_kaprekar_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isKaprekarNumber(n)) {
            System.out.println("It is a Kaprekar Number");
        }
        else{
            System.out.println("It is not a Kaprekar Number");
        }
    }

    public static boolean isKaprekarNumber(int n) {
        int sq = n * n;
        
        if(n ==1 ){
            return true;
        }

        int digit = String.valueOf(n).length();
        int divisor = (int) Math.pow(10, digit);

        int leftPart = sq % divisor;
        int rightPart = sq / divisor;

        return (leftPart + rightPart) == n;
    }
}
