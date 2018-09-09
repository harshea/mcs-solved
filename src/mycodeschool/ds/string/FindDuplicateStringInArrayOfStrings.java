/**
 * 
 */
package mycodeschool.ds.string;

import java.util.HashSet;
import java.util.Set;

/**
 * We have array of random strings. Some of them are duplicates. Remove duplicates 
 * @author ashuu
 *
 */
public class FindDuplicateStringInArrayOfStrings {

	static public void findDiuplicates(String[] array){
		Set<String> uniqueStringSet = new HashSet<String>(array.length);
		for(String str: array) {
			if(!uniqueStringSet.add(str)) {
				System.out.println("Duplicate :"+str);
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"user1","user2","user3","user4","user1","user2","user5","user6"};
		findDiuplicates(array);
		
	}

}
