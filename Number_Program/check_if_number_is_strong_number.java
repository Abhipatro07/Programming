package Number_Program;

import java.util.Scanner;

public class check_if_number_is_strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(isStrongNumber(n)){
            System.out.println("It is a strong number");
        }
        else{
            System.out.println("It is not a Strong number");
        }
    }

    public static boolean isStrongNumber(int n) {
        int temp = n;
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            int fact = Factorial(rem);
            sum = sum + fact;
            n = n / 10;
        }

       return sum == temp;
    }

    public static int Factorial(int rem) {
        int mul = 1;

        if(rem == 0 || rem == 1){
            return 1;
        }

        while(rem != 1){
            mul = mul * rem;
            rem--;
        }

        return mul;
    }
}
