package Number_Program;

import java.util.Scanner;

public class check_if_number_is_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(armstrong(n)){
            System.out.println("This is an Armstrong Number");
        }
        else{
            System.out.println("This number is not an Armstrong Number");
        }
    }

    public static boolean armstrong(int n) {
        int temp = n;
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }

        if(sum == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
