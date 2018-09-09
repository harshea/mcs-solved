/**
 * 
 */
package mycodeschool.ds.array.sortedarray;

/**
 * @author ashuu
 * Logic here to be using is again Binary Search
 * But to find total occurrence of given element first you need to find 
 * 1. first occurrence of a element
 * 2. Last occurrence of an element
 *  Then used these two counts to find total occurrence of given element
 */
public class FindKeyInSortedArrayContainsDuplcateElements {
	
	
	public  int BinartSearch(int[] arrays, int lengthOfArray, int key, boolean searchFirst) {
		int result = -1;
		int high = lengthOfArray -1;
		int low = 0;
		
		while(low <= high) {
			//calculate mid
			int mid = (low + high )/2;
			if(arrays[mid] == key) {
				result = mid;
				if(searchFirst) {
					//to find first occurrence, traverse on left side of array
					high = mid -1;
					
				}else {
					//to find last occurrence, traverse on right side of array 
					low = mid +1;
				}
				
						
			}else if (key < arrays[mid] ) {
				high = mid - 1;
			}else if(key > arrays[mid]) {
				low  = mid + 1;
			}
		}
		
		
		
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKeyInSortedArrayContainsDuplcateElements obj = new FindKeyInSortedArrayContainsDuplcateElements();
		int A[] = {1,1,3,3,5,5,5,5,5,9,9,11,11};
		int key = 5;
		int lengthOfArray = A.length;
		int firstOccurance = obj.BinartSearch(A, lengthOfArray, key, true);
		int lastOccurance = obj.BinartSearch(A, lengthOfArray, key, false);
		int totalOccurance = (lastOccurance - firstOccurance) +1;
		
		System.out.println("firstOccurance of key "+key+" is "+firstOccurance);
		System.out.println("lastOccurance of key "+key+" is "+lastOccurance);
		System.out.println("totalOccurance of key "+key+" is "+totalOccurance);
	}

}
