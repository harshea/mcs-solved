/**
 * 
 */
package mycodeschool.ds.sorting;

/**
 * In selection sort, we select lowest element from array and swap it with 0th index of array
 * @author ashuu
 *
 */
public class SelectionSort {

	/**
	 * consider array is unsorted array
	 * Time complexisty is O(n2}
	 * Space complexity is O(1)
	 * @param array
	 * @param arrayLen
	 */
	public static void selectionSort(int[] array,int arrayLen) {
		for(int i=0;i<arrayLen-1;i++) {
			int iMin = i; //consider first element as lowest element in array at the begining
			
			for(int j = i+1;j<arrayLen ; j++) {
				if(array[j] < array[iMin]) { //if next elemt is lowet thn current, update index
					iMin = j;//This variable holds lowest elemnt's index
				}
			//swap iMin with first index of array
			int temp = array[i];
			array[i] = array[iMin];
			array[iMin] = temp;
			}
		}
		
		//display array
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,3,7,5,1};
		selectionSort(array,array.length);
		
	}

}
