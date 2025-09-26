package Number_Program;

import java.util.Scanner;

public class check_if_number_is_duck_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if(isDuckNumber(n)){
            System.out.println("It is a Duck Number");
        }
        else{
            System.out.println("It is not a Duck Number");
        }

        
    }

    public static boolean isDuckNumber(int n) {
        if(String.valueOf(n).charAt(0) == '0'){
            return false;
        }

        while(n != 0){
            int rem = n % 10;
            if(rem == 0){
                return true;
            }
            n = n / 10;
        }

        return false;
    }
}
