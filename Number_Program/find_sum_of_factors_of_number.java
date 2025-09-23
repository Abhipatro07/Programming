package Number_Program;

import java.util.Scanner;

public class find_sum_of_factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }

        System.out.println("The sum of the factors of " + n + " is " + sum);
    }
}
