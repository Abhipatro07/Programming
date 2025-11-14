/*
 Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. 
 Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
 */
package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the value into the array: ");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        System.out.println("Expected Output is: ");
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
