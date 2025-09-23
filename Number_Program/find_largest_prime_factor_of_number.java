package Number_Program;

import java.util.Scanner;

public class find_largest_prime_factor_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n = sc.nextInt();

        long largest_Prime = largest_Prime_factor(n);

        System.out.println("The largest prime factor of the " + n + " is " + largest_Prime);
    }

    public static long largest_Prime_factor(long n) {
      long maxPrime = -1;

      // Divide n by 2 until it is odd
      while(n % 2 == 0){
        maxPrime = 2;
        n = n / 2;
      }

      // Now n is odd. Start checking from 3
      for(long i = 3;i<=Math.sqrt(n);i = i+2){
        while (n % i == 0) {
            maxPrime = i;
            n = n / i;
        }
      }

      // If n is still greater than 2, then it is prime
      if(n > 2){
        maxPrime = n;
      }

      return maxPrime;
      
    }
}
