/**
 * 
 */
package mycodeschool.ds.sorting;

import java.util.Arrays;

/**
 * This sort divides array into  left array and right array recursively
 * Then it has logic of merging elements based on comparision
 * @author ashuu
 *
 */
public class MergeSort {

	
	
	 public static void mergeSort(int[] A) {
		
		 int aLen = A.length;
		 if(aLen < 2) {
			 return;
		 }
		 
		 int mid = aLen/2;
		 
		 int[] leftArray = new int[mid];
		 int[] rightArray = new int[aLen-mid];
		 
		 //fill left and right array
		 
		 for(int i=0;i<= mid-1;i++) {
			 leftArray[i] = A[i];
		 }
		 
		 for(int i=mid;i<aLen;i++) {
			 rightArray[i-mid] = A[i];
		 }
		 
		 //make recursive call
		 System.out.println("leftArray =>"+Arrays.toString(leftArray));
		 mergeSort(leftArray);
		 System.out.println("-------Left call finished-------");
		 
		 System.out.println("rightArray =>"+Arrays.toString(rightArray));
		 mergeSort(rightArray);
		 
		 System.out.println("--------Right call finished-----------------");
		 
		 
		 //merge elements
		 
		int[] result =  merge(leftArray,rightArray,A);
		
		//display
		System.out.print("Result=");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] +" ");
		}
	 }
	
	private static int[] merge(int[] leftArray, int[] rightArray, int[] a) {
		int lenLA = leftArray.length;
		int lenRA = rightArray.length;
		
		int i = 0 , j =0 , k=0;
		
		while(i < lenLA && j < lenRA) {
			if(leftArray[i] <= rightArray[j]) {
				a[k] = leftArray[i];
				k++;
				i++;
			}else {
				a[k] = rightArray[j];
				k++;
				j++;
			}
		}
		
		//if any of the array left some elements
		
		while(i < lenLA) {
			a[k] = leftArray[i];
			k++;
			i++;
			
		}
		
		while(j < lenRA) {
			a[k] = rightArray[j];
			j++;
			k++;
		}
		
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,1,6,8,5,3,7,9};
		
		mergeSort(a);
	}

}
