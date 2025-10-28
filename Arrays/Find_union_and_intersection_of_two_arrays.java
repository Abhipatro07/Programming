/*
Test Cases for Find_union_and_intersection_of_two_arrays:

1️⃣ Input:
   arr1 = [1, 2, 3, 4, 5]
   arr2 = [3, 4, 5, 6, 7]
   Expected Union: [1, 2, 3, 4, 5, 6, 7]
   Expected Intersection: [3, 4, 5]
   Explanation: Common elements are 3, 4, 5; all unique elements combined for union.

2️⃣ Input:
   arr1 = [10, 20, 30]
   arr2 = [40, 50, 60]
   Expected Union: [10, 20, 30, 40, 50, 60]
   Expected Intersection: []
   Explanation: No common elements between arrays.

3️⃣ Input:
   arr1 = [1, 1, 1, 1]
   arr2 = [1, 1, 1, 1]
   Expected Union: [1]
   Expected Intersection: [1]
   Explanation: Both arrays have only one unique value — 1.

4️⃣ Input:
   arr1 = [5, 10, 15, 20, 25]
   arr2 = [15, 20, 25, 30, 35]
   Expected Union: [5, 10, 15, 20, 25, 30, 35]
   Expected Intersection: [15, 20, 25]
   Explanation: Common values are 15, 20, 25.

5️⃣ Input:
   arr1 = [0, 0, 1, 2]
   arr2 = [2, 2, 3, 4]
   Expected Union: [0, 1, 2, 3, 4]
   Expected Intersection: [2]
   Explanation: Only 2 is common, rest are unique.

6️⃣ Input:
   arr1 = [7, 8, 9]
   arr2 = []
   Expected Union: [7, 8, 9]
   Expected Intersection: []
   Explanation: Second array empty, union = first array, intersection = empty.

7️⃣ Input:
   arr1 = []
   arr2 = [1, 2, 3]
   Expected Union: [1, 2, 3]
   Expected Intersection: []
   Explanation: First array empty, union = second array.

8️⃣ Input:
   arr1 = [1, 3, 5, 7, 9]
   arr2 = [2, 4, 6, 8, 10]
   Expected Union: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
   Expected Intersection: []
   Explanation: No overlapping numbers.

9️⃣ Input:
   arr1 = [4, 5, 6, 7]
   arr2 = [5, 6, 7, 8, 9, 10]
   Expected Union: [4, 5, 6, 7, 8, 9, 10]
   Expected Intersection: [5, 6, 7]
   Explanation: Common numbers are 5, 6, 7.

🔟 Input:
   arr1 = [2, 2, 3, 3, 4, 4]
   arr2 = [3, 4, 4, 5, 5, 6]
   Expected Union: [2, 3, 4, 5, 6]
   Expected Intersection: [3, 4]
   Explanation: Duplicates ignored, common are 3 and 4.

11️⃣ Input:
   arr1 = [-3, -2, -1, 0]
   arr2 = [-1, 0, 1, 2, 3]
   Expected Union: [-3, -2, -1, 0, 1, 2, 3]
   Expected Intersection: [-1, 0]
   Explanation: Common negative and zero values included.

12️⃣ Input:
   arr1 = [100, 200, 300]
   arr2 = [100, 100, 200, 400]
   Expected Union: [100, 200, 300, 400]
   Expected Intersection: [100, 200]
   Explanation: Both arrays share 100 and 200.
*/

package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Find_union_and_intersection_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array 1: ");
        int n = sc.nextInt();

        System.out.println("Enter the values into the array 1: ");
        int arr1[] = new int[n];

        for(int i = 0;i<=n-1;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the Array 2: ");
        int m = sc.nextInt();

        System.out.println("Enter the values into the array 2: ");
        int arr2[] = new int[m];

        for(int i = 0;i<=m-1;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("The expected union of 2 arrays are: ");
        unionArray(arr1,arr2);

        System.out.println("The expected intersection of 2 arrays are: ");
        intersectionArray(arr1,arr2);

    }

    public static void intersectionArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }

        for(int num : intersection){
            System.out.print(num);
        }
    }

    public static void unionArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }

        for(int num : set){
            System.out.print(num);
        }
    }
}
