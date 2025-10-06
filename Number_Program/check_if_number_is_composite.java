package Number_Program;

import java.util.Scanner;

public class check_if_number_is_composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("0 is a Special number");
        }

        if(n < 0){
            System.out.println("negative numbers are not considered composite");
        }

        if(isCoposite(n)){
            System.out.println("It is a Composite number");
        }
        else{
            System.out.println("It is not a Composite Number");
        }
    }

    public static boolean isCoposite(int n) {
        int count = 0;

        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }

        if(count > 2){
            return true;
        }
        else{
            return false;
        }
    }
}
