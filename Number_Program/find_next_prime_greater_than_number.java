package Number_Program;

import java.util.Scanner;

public class find_next_prime_greater_than_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int res = n + 1;

        while(!isPrime(res)){
            res++;
        }
        System.out.println("The next greater prime number is: " + res);
    }

    public static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }
        if(n ==2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3;i<=Math.sqrt(n);i=i+2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    
}
