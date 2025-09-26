package Number_Program;

import java.util.Scanner;

public class check_if_number_is_neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isNeonNumber(n)){
            System.out.println("It is a Neon Number");
        }
        else{
            System.out.println("It is not a Neon Number");
        }
    }

    public static boolean isNeonNumber(int n) {
        int sq = n * n;
        int sum = 0;

        while(sq != 0){
            int rem = sq % 10;
            sum = sum + rem;
            sq = sq / 10;
        }
        return sum == n;
    }
}
