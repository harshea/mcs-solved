/**
 * 
 */
package mycodeschool.ds.bt;

/**
 * @author ashuu
 *
 */
public class ConstructBT {
	Node root;
	public static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	
	//construct BT recursively
	
	public static Node recursive(Node current, int data) {
		if(current == null) {
			return new Node(data);
		}
		
		if(data < current.data ) {
			current.left = recursive(current.left,data);
		} else if(data > current.data) {
			current.right = recursive(current.right,data);
		} else {
			return current;
		}
		
		return current;
		
	}
	
	public void add(int n){
		root = recursive(root,n);
	}
	
	private ConstructBT createBinaryTree() {
		ConstructBT bt = new ConstructBT();
	 
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	 
	    return bt;
	}
	public static void main(String args[]) {
		
	}
}
