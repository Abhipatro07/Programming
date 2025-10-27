package Practice;

/*
 *  Have the function MatrixChallenge(strArr) read the array
 *   of strings stored in strArr which will represent a 2D N matrix,
 *    and your program should return the elements after printing them in an anti-clockwise, spiral order.
 *     You should return the newly formed list of elements as a string with the numbers separated by commas.
 *     For example: if strArr is "[1, 2, 3]", "[4, 5, 6]", "[7, 8, 9,]" then this looks like the following 2D matrix:
1 2 3
4 5 6
7 8 9
So your program should return the elements of this matrix in an anti-clockwise, spiral order which is: 3, 2, 1, 4, 7, 8, 9, 6, 5.
 */
/*
 * [1,2,3,4,5] 01 02 03 04 05
 * [6,7,8,9,10] 11 12 13 14 15
 * [11,12,13,14,15] 21 22 23 24 25
 * [16,17,18,19,20] 31 32 33 34 35
 * [21,22,23,24,25] 41 42 43 44 45
 */
public class code2 {
	public static void main(String args[]) {
		String[][] str = {{"1", "2", "3","4","5"},{"6","7", "8", "9", "10"},{"11", "12", "13", "14", "15"},{"16", "17", "18", "19", "20"},{"21", "22", "23", "24", "25"} } ;
		int n=5;
		int i=0, j=n-1, k=0;
		for(k=0; k< n/2 +1; k++) {
			while(j>= k) {
				System.out.print(str[i][j]+" ");
				j=j-1;
			}
			j=j+1;
			i=i+1;
			while(i < n-k) {
				System.out.print(str[i][j]+" ");
				i=i+1;
			}
			i = i-1;
			j=j+1;
			while(j<n-k) {
				System.out.print(str[i][j]+" ");
				j=j+1;
			}
			j=j-1;
			i=i-1;
			while(i > k) {
				System.out.print(str[i][j]+" ");
				i=i-1;
			}
			
			i = i+1;
			j = j-1;
	
			
		}
		
	}
}