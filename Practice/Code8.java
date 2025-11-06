/*
 Given the head of a sorted linked list, delete all nodes that have duplicate numbers, 
 leaving only distinct numbers from the original list. Return the linked list sorted as well.  
 Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
 */
package Practice;

import java.util.*;

public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linkedList: ");
        int n = sc.nextInt();
        System.out.println("Enter the value into the linkedList: ");
        LinkedList<Integer> in = new LinkedList<>();

        for(int i = 0;i<=n-1;i++){
            in.add(sc.nextInt());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : in){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println("The expected output is: ");
        for(int res : map.keySet()){
            if(map.get(res) == 1){
                System.out.println(res);
            }
        }

        
    }
}
