/*
🔹 Test Cases for Find_common_elements_in_three_sorted_arrays

--------------------------------------------------
🧩 Test Case 1 — Basic Common Elements
Input:
arr1 = [1, 5, 10, 20, 40, 80]
arr2 = [6, 7, 20, 80, 100]
arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
Expected Output:
[20, 80]

--------------------------------------------------
🧩 Test Case 2 — All Arrays Identical
Input:
arr1 = [1, 2, 3, 4, 5]
arr2 = [1, 2, 3, 4, 5]
arr3 = [1, 2, 3, 4, 5]
Expected Output:
[1, 2, 3, 4, 5]

--------------------------------------------------
🧩 Test Case 3 — No Common Elements
Input:
arr1 = [1, 2, 3]
arr2 = [4, 5, 6]
arr3 = [7, 8, 9]
Expected Output:
[]

--------------------------------------------------
🧩 Test Case 4 — Some Common in First Two Only
Input:
arr1 = [1, 5, 10]
arr2 = [5, 10, 15]
arr3 = [20, 25, 30]
Expected Output:
[]

--------------------------------------------------
🧩 Test Case 5 — Common Element Appears Multiple Times
Input:
arr1 = [1, 5, 5]
arr2 = [3, 4, 5, 5, 10]
arr3 = [5, 5, 10, 20]
Expected Output:
[5]

--------------------------------------------------
🧩 Test Case 6 — Common Element at the End
Input:
arr1 = [1, 2, 3, 4, 5, 10]
arr2 = [5, 6, 7, 8, 9, 10]
arr3 = [10, 11, 12, 13, 14]
Expected Output:
[10]

--------------------------------------------------
🧩 Test Case 7 — One Empty Array
Input:
arr1 = [1, 2, 3]
arr2 = []
arr3 = [1, 2, 3]
Expected Output:
[]

--------------------------------------------------
🧩 Test Case 8 — All Arrays Empty
Input:
arr1 = []
arr2 = []
arr3 = []
Expected Output:
[]

--------------------------------------------------
🧩 Test Case 9 — Large Numbers with Common Values
Input:
arr1 = [100, 200, 300, 400, 500]
arr2 = [50, 100, 300, 500, 700]
arr3 = [10, 100, 300, 500, 900]
Expected Output:
[100, 300, 500]

--------------------------------------------------
🧩 Test Case 10 — Common Elements in Middle
Input:
arr1 = [1, 2, 3, 20, 30, 40]
arr2 = [10, 20, 30, 50]
arr3 = [5, 15, 20, 30, 35]
Expected Output:
[20, 30]
--------------------------------------------------
*/

package Arrays;

import java.util.*;

public class Find_common_elements_in_three_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arr1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the values into the arr1: ");
        int arr1[] = new int[n1];
        for(int i = 0;i<=n1-1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the arr2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the values into the arr2: ");
        int arr2[] = new int[n2];
        for(int i = 0;i<=n2-1;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the arr3: ");
        int n3 = sc.nextInt();
        System.out.println("Enter the values into the arr3: ");
        int arr3[] = new int[n3];
        for(int i = 0;i<=n3-1;i++){
            arr3[i] = sc.nextInt();
        }

        List<Integer> res = findCommonElementsInTheThreeSortedArray(arr1 , arr2 , arr3);
        System.out.println("The common Elements of the 3 array is: " + res);
    }


    //! 3 pointer concept
    public static List<Integer> findCommonElementsInTheThreeSortedArray(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0 , j = 0 , k = 0;
        List<Integer> common = new ArrayList<>();
        Integer lastAdded = null;

        while(i < arr1.length && j < arr2.length && k < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                if(lastAdded == null || !lastAdded.equals(arr1[i])){
                    common.add(arr1[i]);
                    lastAdded = arr1[i];
                }

                i++;
                j++;
                k++;
            }

            else if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }

        return common;
    }
}
