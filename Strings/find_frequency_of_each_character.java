/*
Test Case 1
Input: "hello"
Output:
h -> 1
e -> 1
l -> 2
o -> 1

Test Case 2
Input: "programming"
Output:
p -> 1
r -> 2
o -> 1
g -> 2
a -> 1
m -> 2
i -> 1
n -> 1

Test Case 3
Input: "aabbcc"
Output:
a -> 2
b -> 2
c -> 2

Test Case 4 (Case sensitivity)
Input: "AaBb"
Output:
A -> 1
a -> 1
B -> 1
b -> 1
// 'A' and 'a' are different, same for 'B' and 'b'

Test Case 5 (With spaces)
Input: "hello world"
Output:
h -> 1
e -> 1
l -> 3
o -> 2
  -> 1   // space also counted
w -> 1
r -> 1
d -> 1

Test Case 6 (Empty string)
Input: ""
Output:
(no output, or "No characters found")

Test Case 7 (Digits)
Input: "112233"
Output:
1 -> 2
2 -> 2
3 -> 2

Test Case 8 (Special characters)
Input: "@@##!!"
Output:
@ -> 2
# -> 2
! -> 2

Test Case 9 (Single character repeated)
Input: "zzzz"
Output:
z -> 4

Test Case 10 (Mixed string)
Input: "Java 123!!"
Output:
J -> 1
a -> 2
v -> 1
  -> 1
1 -> 1
2 -> 1
3 -> 1
! -> 2
*/

package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class find_frequency_of_each_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String n = sc.nextLine();

        char arr[] = n.toCharArray();

        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : arr){ 
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        System.out.println("The frequency of letters: ");

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
