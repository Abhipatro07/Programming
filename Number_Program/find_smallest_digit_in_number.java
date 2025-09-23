package Number_Program;

import java.util.Scanner;

public class find_smallest_digit_in_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int min = 9;
        while(n != 0){
            int temp = n % 10;
            if(temp < min){
                min = temp;
            }
            n = n / 10;
        }


        System.out.println("The smallest digit of the number is: " + min);
    }
}
