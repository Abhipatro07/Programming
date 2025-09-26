package Number_Program;

import java.util.Scanner;

public class check_if_number_is_spy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isSpyNumber(n)){
            System.out.println("It is a Spy Number");
        }
        else{
            System.out.println("It is not a Spy Number");
        }
    }

    public static boolean isSpyNumber(int n) {
        int sum = 0;
        int mul = 1;

        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            mul = mul * rem;
            n = n / 10;
        }

        return sum == mul;
    }
}
