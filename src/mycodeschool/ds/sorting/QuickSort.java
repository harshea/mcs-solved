/**
 * 
 */
package mycodeschool.ds.sorting;

import java.util.Arrays;

/**
 * @author ashuu
 *
 */
public class QuickSort {

	public static void quickSort(int[] A, int start, int end) {
		if(start >= end) {
			return;
		}
			int partitionIndex = partition(A, start,end);
			System.out.println("partitionIndex="+partitionIndex);
			//call quick sort recursively 
			quickSort(A,start,partitionIndex-1);
			quickSort(A,partitionIndex+1, end);
		
	}
	
	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int pIndex = start; //to start with
		
		for(int i =0;i<end ;i++) {
			if(a[i] <= pivot) {
				int temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
		}
		
		//last swap pIndex element with pivot
		
	//	int temp = a[pivot];
		a[pivot] = a[pIndex];
		a[pIndex] = pivot;
		
		return pIndex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7,2,1,6,8,5,3,4};
		int end = array.length-1;
		System.out.println("end="+end);
		quickSort(array,0,end);
		System.out.println("Result:"+Arrays.toString(array));
	}

}
