/**
 * 
 */
package mycodeschool.ds.bt;

/**
 * @author ashuu
 * heigh of BT is the no of edges in longest path from root to leaf nodes.
 * for leaf noes height is 0
 * 
 * depth of tree is no of edges from Root to that node
 */
public class BinaryTree_FindHeightOfBinaryTree {

	public class Node {
		int data = 0;
		Node leafNode;
		Node rightNode;
		
		/**
		 * @param data
		 * @param leafNode
		 * @param rightNode
		 */
		public Node(int data, Node leafNode, Node rightNode) {
			super();
			this.data = data;
			this.leafNode = leafNode;
			this.rightNode = rightNode;
		}
		
	}
	public Node createNode(int data,Node leftNode,Node rightNode) {
		Node node = new Node(data, leftNode, rightNode);
		return node;
	}
	public  int findHeight(Node root) {
		
		//exit condition
		if(root == null) {
			return -1;
		}
		
		int heightOfBT = 0;
		
		//calculate height of left subtree
		int hLeft = findHeight(root.leafNode);
		System.out.println("hLeft="+hLeft);
		
		//calculate height of right subtee
		
		int hRight = findHeight(root.rightNode);
		System.out.println("hRight="+hRight);
		
		//height of BT = max of [hLeft,hRight] +1 
		heightOfBT = Math.max(hLeft,hRight) + 1;
		System.out.println("heightOfBT="+heightOfBT);
		
		return heightOfBT;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree_FindHeightOfBinaryTree bt = new BinaryTree_FindHeightOfBinaryTree();
		//create leaf nodes
		Node EightNode = bt.createNode(8, null, null);
		Node NinthNode = bt.createNode(9, null, null);
		Node FourthNode = bt.createNode(4, null, null);
		Node SixthNode = bt.createNode(6, null, null);
		Node SeventhNode = bt.createNode(7, null, null);
		
		//Craete other nodes
		
		Node FifthNode = bt.createNode(5, EightNode, NinthNode);
		Node ThirdNode = bt.createNode(3, SixthNode, SeventhNode);
		Node SecondNode = bt.createNode(3, FourthNode, FifthNode);
		Node FirstNode = bt.createNode(3, SecondNode, ThirdNode);
		
		int heightOfBT = bt.findHeight(FirstNode);
		System.out.println("heightOfBT="+heightOfBT);
		
	}

}
