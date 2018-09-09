/**
 * 
 */
package mycodeschool.ds.sorting;

/**
 * @author ashuu
 * Time complexity best case O(n), average/worst case O(n2)
 *
 */
public class BubbleSort {

	public static void bubbleSort(int[] A, int length) {
		
		//this loop iterates based on length of array
		for (int i = 1; i < length - 1; i++) {
			int flag = 0;
			for (int k = 0; k <= length - i-1; k++) {
				if (A[k] > A[k + 1]) {
					int temp = A[k + 1];
					A[k + 1] = A[k];
					A[k] = temp;
					flag = 1;
				}
			}
			
			//to avoid redudent passes, if swap didnt happened that means array is already sorted
			//so we can break loop
			
			if(flag == 0) {
				break;
			}
		}

		// display array

		for (int i = 0; i < length; i++) {
			System.out.print(A[i] + " ");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 2, 7, 4, 1, 5, 3 };
		
		bubbleSort(array,array.length);
	}

}
