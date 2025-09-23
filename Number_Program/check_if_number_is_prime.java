package Number_Program;

import java.util.Scanner;

public class check_if_number_is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("The number is Prime Number");
        }
        else{
            System.out.println("The number is not Prime Number");
        }
    }

    public static boolean isPrime(int n) {
       int count = 1;

       for(int i = 1;i<n;i++){
        if(n % i == 0){
            count++;
        }
       }

       if(count == 2){
        return true;
       }
       else{
        return false;
       }
    }
}
