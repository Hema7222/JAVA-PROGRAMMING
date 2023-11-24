package DataStructures;

public class TreeMain {

	public static void main(String[] args) {
		TreeNode<Integer> n = new TreeNode<Integer>(5);
		n.Left = new TreeNode<Integer>(10);
		n.Right = new TreeNode<Integer>(20);
		n.Left.Left = new TreeNode<Integer>(30);
		n.Left.Right = new TreeNode<Integer>(40);
		n.Right.Left = new TreeNode<Integer>(50);
		n.Right.Right = new TreeNode<Integer>(60);
		n.Left.Left.Left = new TreeNode<Integer>(70);
		n.Left.Left.Right = new TreeNode<Integer>(80);
		n.Left.Right.Left = new TreeNode<Integer>(100);
		n.Left.Right.Right = new TreeNode<Integer>(120);
		
		
		TreeTraversal traversal = new TreeTraversal(n);
		System.out.println("------inOrder------");
		traversal.inOrder(n);
		System.out.println("------preOrder------");
		traversal.preOrder();
		System.out.println("------postOrder------");
		traversal.postOrder();
	}
}
