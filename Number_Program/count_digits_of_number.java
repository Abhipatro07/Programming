package Number_Program;

import java.util.Scanner;

public class count_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int x = countDigit(n);
        System.out.println("The number digits present in " + n + " is " + x);
        
    }

    public static int countDigit(int n) {
        int count = 0;
        while(n !=0){
            n = n / 10;
            count++;
        }

        return count;
    }
}
