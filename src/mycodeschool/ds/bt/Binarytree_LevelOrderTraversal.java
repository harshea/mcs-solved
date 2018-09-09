/**
 * 
 */
package mycodeschool.ds.bt;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author ashuu
 *
 */
public class Binarytree_LevelOrderTraversal {

	
	//Here we would be using queue to traverse BT level order or breadth first strategy 
	
	public  void levelOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new ArrayBlockingQueue<TreeNode>(10);
		queue.add(root);
		
		//loop queue till its not empty
		System.out.print("[ ");
		while(!queue.isEmpty()) {
			TreeNode currentNodeInQueue = queue.peek();
			if(currentNodeInQueue.left != null) {
				queue.add(currentNodeInQueue.left);
			}
			
			if(currentNodeInQueue.right != null) {
				queue.add(currentNodeInQueue.right);
			}
			//print data before remove
			System.out.print(currentNodeInQueue.data+" , ");
			queue.remove(currentNodeInQueue);
		}
		System.out.print(" ] ");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Level 4 leaf nodes
		TreeNode HNode = TreeNode.createNode("H", null, null);
				
		//create Level 3 leaf nodes
		TreeNode ANode = TreeNode.createNode("A", null, null);
		TreeNode CNode = TreeNode.createNode("C", null, null);
		TreeNode INode = TreeNode.createNode("I", HNode, null);
		
		//create Level 2 leaf nodes
		TreeNode BNode = TreeNode.createNode("B", ANode, CNode);
		TreeNode ENode = TreeNode.createNode("E", null, null);				
		TreeNode GNode = TreeNode.createNode("G", null, INode);
		TreeNode KNode = TreeNode.createNode("K", null, null);				
		
		//create Level 1 leaf nodes
		TreeNode DNode = TreeNode.createNode("D", BNode, ENode);
		TreeNode JNode = TreeNode.createNode("J", GNode, KNode);				
				
				
		//create Level 0 leaf nodes
		TreeNode FNode = TreeNode.createNode("F", DNode, JNode); //This is the root Node
		
		
		Binarytree_LevelOrderTraversal btl = new Binarytree_LevelOrderTraversal();
		btl.levelOrderTraversal(FNode);
				
				
	}

}
