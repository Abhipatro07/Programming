package Number_Program;

import java.util.Scanner;

public class check_if_number_is_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(palindrom(n)){
            System.out.println("It is a palindrom number");
        }
        else{
            System.out.println("It is not a palindrom number");
        }
    }

    public static boolean palindrom(int n) {
        int temp = n;
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }

        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }
}
