package Number_Program;

import java.util.Scanner;

public class check_if_number_is_harshad_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(harshadNumber(n)){
            System.out.println("It is a Harsad Number");
        }
        else{
            System.out.println("It is not a Harsad Number");
        }
    }

    public static boolean harshadNumber(int n) {
        int temp = n;
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        if(temp % sum == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
