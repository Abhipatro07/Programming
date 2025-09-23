package Number_Program;

import java.util.Scanner;

public class print_factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The factors of the numbers are: ");
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
