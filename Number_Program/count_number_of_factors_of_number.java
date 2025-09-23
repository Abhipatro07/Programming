package Number_Program;

import java.util.Scanner;

public class count_number_of_factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }

        System.out.println("The number of factor of " + n + " is " + count);
    }
}
