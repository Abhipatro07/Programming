package Number_Program;

import java.util.Scanner;

public class Check_if_a_number_is_positive_negative_or_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("It ia Positive number");
        }
        else if(n < 0){
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is a zero");
        }
    }
    
}
