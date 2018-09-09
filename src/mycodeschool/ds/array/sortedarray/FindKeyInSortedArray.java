/**
 * 
 */
package mycodeschool.ds.array.sortedarray;

/**
 * @author ashuu
 *Find key in sorted array auusmption no duplicates in sorted array
 * Efficient way to implement is using binary search
 */
public class FindKeyInSortedArray {
	
	//here we would be  using binary search to find key in array
	//space complexity is o (log n)
	/**
	 * @param args
	 */
	
		
	public static int binarySearch(int[] arrays, int lengthOfArray, int key) {
		//define two element low = 0 and high = length of array
		int low = 0;
		int high = lengthOfArray-1;
		
		//exist condition loop element tills low is less or equal to high
		
		while(low <= high) {
			//find mid of array
			int mid = ( high + low )/2;
			
			if(arrays[mid] == key) {
				return mid;
			}else if (key < arrays[mid] ) {
				high = mid - 1;
			}else if(key > arrays[mid]) {
				low  = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int array[] = {1,2,3,4,5};
		int key = 5;
		int index = FindKeyInSortedArray.binarySearch(array, array.length, key);
		System.out.println("Key "+key+" found at index "+index);
	}

}
