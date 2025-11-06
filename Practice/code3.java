
/*
 The function MathChallenge(num) takes a number as input. 
 The function should return the permutation of the digits of num if any arrangement results in a prime number. 
 If no arrangement of the digits forms a prime number the function should return 0.
Ex: if num is 910, the output should be a prime number because 910 can be rearranged into 109 and 019, 
both of which are primes
 */

 import java.util.*;

public class Code3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int result = MathChallenge(n);
        if(result != 0){
            System.out.println("Prime permutation found: " + result);
        } else {
            System.out.println("No prime permutation found");
        }
    }

    public static int MathChallenge(int n) {
        String numStr = String.valueOf(n);
        List<String> permutations = new ArrayList<>();
        permute(numStr, "", new boolean[numStr.length()], permutations);

        for(String s : permutations){
            int val = Integer.parseInt(s);
            if(isPrime(val)){
                return val; // return first prime found
            }
        }
        return 0; // none found
    }

    // Generate all permutations of the number string
    public static void permute(String str, String curr, boolean[] used, List<String> res){
        if(curr.length() == str.length()){
            res.add(curr);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(!used[i]){
                used[i] = true;
                permute(str, curr + str.charAt(i), used, res);
                used[i] = false;
            }
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0) return false;
        }
        return true;
    }
}
