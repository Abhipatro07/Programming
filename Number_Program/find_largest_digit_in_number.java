package Number_Program;

import java.util.Scanner;

public class find_largest_digit_in_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int max = 0;
        while(n != 0){
            int temp = n % 10;
            if(temp > max){
                max = temp;
            }
            n = n / 10;
        }


        System.out.println("The largest digit of the number is: " + max);
    }
}
