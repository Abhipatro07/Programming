package Number_Program;

import java.util.Scanner;

public class print_fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find upto which Fibonacci Number you want: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;
        int sum = 0;


        System.out.println("Fibonacci Series is: ");
        while(count != n){
            System.out.println(a);
            sum = a+b;
            a=b;
            b=sum;
            count++;
        }
    }
}
