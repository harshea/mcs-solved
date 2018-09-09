/**
 * 
 */
package mycodeschool.ds.bt;

/**
 * Time comlexity O(n)
 * Space complexity : O(h) where h - height if tree
 * best case or average O (logn)
 * worst O(n)
 * 
 * @author ashuu
 *
 */
public class BinaryTreeTraversal_PreOrder_PostOrder_InOrder {
	
	/**
	 * here we are using recursive function for traversal
	 * Root -> left -> Right
	 * @param root
	 */
	public void preOrder(TreeNode root) {
		//exit considtion
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	/**
	 * Left -> Right -> Root
	 * here we are using recursive function for traversal
	 * @param root
	 */
	public void postOrder(TreeNode root) {
		//exit considtion
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	

	/**
	 * Left -> Root -> Right
	 * here we are using recursive function for traversal
	 * @param root
	 */
	public void inOrder(TreeNode root) {
		//exit considtion
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinaryTreeTraversal_PreOrder_PostOrder_InOrder obj = new BinaryTreeTraversal_PreOrder_PostOrder_InOrder();
		//create Level 4 leaf nodes
		TreeNode HNode = TreeNode.createNode("H", null, null);
		// create Level 3 leaf nodes
		TreeNode ANode = TreeNode.createNode("A", null, null);
		TreeNode CNode = TreeNode.createNode("C", null, null);
		TreeNode INode = TreeNode.createNode("I", HNode, null);

		// create Level 2 leaf nodes
		TreeNode BNode = TreeNode.createNode("B", ANode, CNode);
		TreeNode ENode = TreeNode.createNode("E", null, null);
		TreeNode GNode = TreeNode.createNode("G", null, INode);
		TreeNode KNode = TreeNode.createNode("K", null, null);

		// create Level 1 leaf nodes
		TreeNode DNode = TreeNode.createNode("D", BNode, ENode);
		TreeNode JNode = TreeNode.createNode("J", GNode, KNode);

		// create Level 0 leaf nodes
		TreeNode FNode = TreeNode.createNode("F", DNode, JNode); // This is the root Node
		
		System.out.println("Preorder traversal");
		obj.preOrder(FNode);
		System.out.println("====================");
		
		System.out.println("PostOrder traversal");
		obj.postOrder(FNode);
		System.out.println("====================");
	
		
		System.out.println("InOrder traversal");
		obj.inOrder(FNode);
		System.out.println("====================");
	
	}

}
