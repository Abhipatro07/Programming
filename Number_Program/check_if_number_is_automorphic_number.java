package Number_Program;

import java.util.Scanner;

public class check_if_number_is_automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isAutomorphicNumber(n)){
            System.out.println("It is a Automorphic Number");
        }
        else{
            System.out.println("It is not a Automorphic Number");
        }
    }

    public static boolean isAutomorphicNumber(int n) {
        int sq = n * n;
        int temp = n;
        int pow = 1;

        while(temp > 0){
            pow *= 10;
            temp /= 10;
        }

        return (sq % pow) == n;
    }
}
