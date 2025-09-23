package Number_Program;

import java.util.Scanner;

public class check_if_number_is_perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(isPerfectNumber(n)){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }

    public static boolean isPerfectNumber(int n) {
        int temp = n;
        int sum = 0;

        for(int i = 1;i<=n;i++){
            if(temp % i == 0){
                sum = sum + i;
            }
        }

        if(sum == 2*temp){
            return true;
        }
        else{
            return false;
        }
    }
}
