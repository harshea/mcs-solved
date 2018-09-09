/**
 * 
 */
package mycodeschool.ds.sorting;

/**
 * In this sort, we divides array into two set, one set if first element and
 * second set is rest of elements in array and now we compare first element from second set with first set and check if its less than shift elements on right by 1
 * 
 * @author ashuu
 *
 */
public class InsertionSort {

	
	public static void insertionSort(int[] array,int length) {
		
		//start loop from second element in array
		
		for(int i=1;i<length;i++) {
			int value = array[i];
			int hole = i;
			
			while(hole > 0 && array[hole-1] > value) {
				array[hole] = array[hole-1];
				hole = hole-1;
				
			}
			array[hole] = value;
		}
		
		//display array
		
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,4,3,2,1};
		insertionSort(array, array.length);
	}

}
