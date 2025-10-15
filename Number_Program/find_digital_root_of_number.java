//Digital root - You keep adding the digits of a number until you get a single digit.
package Number_Program;

import java.util.Scanner;

public class find_digital_root_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int Digital_Root = 1 + (n - 1) % 9;

        System.out.println("The Expected output: " + Digital_Root);
    }
}