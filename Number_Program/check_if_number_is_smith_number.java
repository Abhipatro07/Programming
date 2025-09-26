package Number_Program;

import java.util.Scanner;

public class check_if_number_is_smith_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(isSmithNumber(n)){
            System.out.println("It is a Smith Number");
        }
        else{
            System.out.println("It is not a Smith Number");
        }
    }

    public static boolean isSmithNumber(int n) {
        int temp = n;
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        int primeSum = 0;

        if(temp % 2 == 0){
            primeSum = primeSum + 2;
            temp = temp / 2;
        }

        for(int i = 3;i<=Math.sqrt(temp);i = i+2){
            while(temp % i == 0){
                primeSum = primeSum + i;
                temp = temp / i;
            }
        }

        if(temp>2){
            primeSum = primeSum + temp;
        }

        return sum == primeSum;
    }
}
