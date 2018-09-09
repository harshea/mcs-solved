/**
 * 
 */
package mycodeschool.ds.bt;

/**
 * @author ashuu
 *
 */
public class BinaryTree_IsBinarySearchTree {
	
	//need to define min and max integer value, if data of binary tree is integer
	public boolean isValid(TreeNode root, Integer min, Integer max) {
	    if(root == null) return true;
	    Integer data = (Integer)root.data;
	    if(min != null && data <= min) return false;
	    if(max != null && data >= max) return false;
	    
	    return isValid(root.left, min, data) && isValid(root.right, data, max);
	}
	public boolean isBSTUtil(TreeNode root, int minValue, int maxValue) {
		
		if(root == null) {
			return true;
		}
		
		Integer data = (Integer)root.data;
		if(data >=minValue && data  < maxValue  
				&&  isBSTUtil(root.left, minValue, data)
				&&  isBSTUtil(root.right, data, maxValue)) {
			return true;
		}else {
		
			return false;
		}
	}
	public boolean isBinarySearchTree(TreeNode root) {
		
		//return isBSTUtil(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
		return isValid(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {//create Level 4 leaf nodes
		BinaryTree_IsBinarySearchTree obj = new BinaryTree_IsBinarySearchTree();
		
		TreeNode HNode = TreeNode.createNode(21, null, null);
		// create Level 3 leaf nodes
		TreeNode ANode = TreeNode.createNode(10, null, null);
		TreeNode CNode = TreeNode.createNode(13, null, null);
		TreeNode INode = TreeNode.createNode(23, HNode, null);

		// create Level 2 leaf nodes
		TreeNode BNode = TreeNode.createNode(12, ANode, CNode);
		TreeNode ENode = TreeNode.createNode(19, null, null);
		TreeNode GNode = TreeNode.createNode(22, null, INode);
		TreeNode KNode = TreeNode.createNode(26, null, null);

		// create Level 1 leaf nodes
		TreeNode DNode = TreeNode.createNode(18, BNode, ENode);
		TreeNode JNode = TreeNode.createNode(25, GNode, KNode);

		// create Level 0 leaf nodes
		TreeNode rootNode = TreeNode.createNode(20, DNode, JNode); // This is the root Node// TODO Auto-generated method stub
		//TreeNode.print(rootNode);
		
		//System.out.println("BinaryTree_IsBinarySearchTree = "+obj.isBinarySearchTree(rootNode));
		
		
		
		//second testcase 
		 BNode = TreeNode.createNode(1, null, null);
		 ENode = TreeNode.createNode(6, null, null);
		 
		DNode = TreeNode.createNode(4, BNode, ENode);
		JNode = TreeNode.createNode(9, null, null);
				 
				 
		 rootNode = TreeNode.createNode(7, DNode, JNode); 
		 
		
		 TreeNode.print(rootNode);
		
		System.out.println("BinaryTree_IsBinarySearchTree = "+obj.isBinarySearchTree(rootNode));
		

			
		//third testcase 
		JNode = TreeNode.createNode(1, null, null);
		rootNode = TreeNode.createNode(1, null, JNode); 
		 
		
		 TreeNode.print(rootNode);
		
		
		System.out.println("BinaryTree_IsBinarySearchTree = "+obj.isBinarySearchTree(rootNode));
	}

}
