package Number_Program;

import java.util.Scanner;

public class Check_if_a_number_is_even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n  = sc.nextInt();

        // if(n % 2 == 0){
        //     System.out.println("It is a even number");
        // }
        // else{
        //     System.out.println("It is a odd number");
        // }

        System.out.println(n % 2 == 0 ? "It is a Even number" : "It is a Odd number");
    }
}
