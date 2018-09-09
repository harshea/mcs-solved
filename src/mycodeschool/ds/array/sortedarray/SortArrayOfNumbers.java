/**
 * 
 */
package mycodeschool.ds.array.sortedarray;

/**
 * @author ashuu
 *
 */
public class SortArrayOfNumbers {

	public static int[] SortInAsscending(int[] a){
		int length = a.length;
		int swap;
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-1-i;j++) {
				if(a[j] > a[j+1] ) {
					swap = a[j];
					a[j] = a[j+1];
					a[j+1] = swap;
				}
			}
		}
		return a;
	}
	
	public static int[] SortInDescending(int[] a){
		int[] ascArray = SortInAsscending(a);
		int length = ascArray.length;
		int[] descArray = new int[length];
		int cnt = 0;
		for(int i = length-1;i>=0;i--) {
			descArray[cnt] = ascArray[i];
			cnt++;
		}
		
		
		return descArray;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={12,4,1,7,10,21,21,18,17,15,5,34,30};
		int result[] = SortInAsscending(array);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+",");
		}
		System.out.println();
		result = SortInDescending(array);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+",");
		}
	}

}
