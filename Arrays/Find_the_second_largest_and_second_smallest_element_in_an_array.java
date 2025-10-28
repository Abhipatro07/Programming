/*
 1️⃣ Input: [1, 2, 3, 4, 5]
    → Second Smallest = 2
    → Second Largest = 4

2️⃣ Input: [5, 4, 3, 2, 1]
    → Second Smallest = 2
    → Second Largest = 4

3️⃣ Input: [8, 8, 8, 8]
    → Second Smallest = None
    → Second Largest = None

4️⃣ Input: [10]
    → Second Smallest = None
    → Second Largest = None

5️⃣ Input: [4, 2, 7, 1, 9, 3]
    → Second Smallest = 2
    → Second Largest = 7

6️⃣ Input: [3, 1, 3, 5, 5, 9, 7]
    → Second Smallest = 3
    → Second Largest = 7

7️⃣ Input: [12, 35, 1, 10, 34, 1]
    → Second Smallest = 10
    → Second Largest = 34

8️⃣ Input: [100, 50, 50, 25, 75]
    → Second Smallest = 50
    → Second Largest = 75

9️⃣ Input: [-1, -5, -3, -4, -2]
    → Second Smallest = -4
    → Second Largest = -2

🔟 Input: [2, 2, 3, 1, 4, 4]
    → Second Smallest = 2
    → Second Largest = 3

11️⃣ Input: [0, 9, 9, 0, 5, 5, 8]
    → Second Smallest = 5
    → Second Largest = 8

12️⃣ Input: [1, 2]
    → Second Smallest = 2
    → Second Largest = 1

 */
package Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class Find_the_second_largest_and_second_smallest_element_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the value to the array: ");
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        secondLargestAndSecondSmallestElement(arr);
    }

    public static void secondLargestAndSecondSmallestElement(int[] arr) {
        TreeSet<Integer> sortedSet = new TreeSet<>();

        for(int num : arr){
            sortedSet.add(num);
        }

        if(sortedSet.size() < 2){
            System.out.println("Second Smallest: None, Second Largest: None");
            return;
        }

        int secondSmallest = sortedSet.higher(sortedSet.first()); // 2nd Smallest
        int secondLargest = sortedSet.lower(sortedSet.last());  //2nd Largest


        System.out.println("The second smallest is " + secondSmallest + " and the second largest " + secondLargest);
    }
}
