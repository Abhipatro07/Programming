/*
Create a function that takes an array of increasing letters and returns the missing letter.
ex: missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"
 */
package Practice;

public class Code6 {

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'e', 'f', 'g'};

        missingarr(arr);

    }

    public static void missingarr(char[] arr) {
        char ch = 'a';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {

                ch++;
            } 
            else {
                System.out.println(ch);
                break;
            }
        }
    }
}
