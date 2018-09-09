package mycodeschool.ds.array.sortedarray;

public class TestOther {
		
	public static boolean global_variable = false;;
	
	public static void main(String[] args) {
		int i = 0;
		boolean flag = true;
		while(i <= 10) {
			global_variable = !global_variable;
			System.out.println(global_variable);
			i++;
		}
	}

}
