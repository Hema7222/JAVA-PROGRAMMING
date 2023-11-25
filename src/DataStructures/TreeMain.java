package DataStructures;

public class TreeMain {

	public static void main(String[] args) {
		/*TreeNode<Integer> n = new TreeNode<Integer>(19);
		n.Left = new TreeNode<Integer>(17);
		n.Right = new TreeNode<Integer>(22);
		n.Left.Left = new TreeNode<Integer>(7);
		n.Left.Right = new TreeNode<Integer>(2);
		n.Right.Left = new TreeNode<Integer>(8);
		n.Right.Right = new TreeNode<Integer>(6);
		n.Left.Left.Left = new TreeNode<Integer>(33);
		n.Left.Left.Right = new TreeNode<Integer>(31);
		n.Left.Right.Left = new TreeNode<Integer>(39);
		n.Left.Right.Right = new TreeNode<Integer>(32);
		n.Right.Right.Left =new TreeNode<Integer>(16);
		n.Right.Right.Right = new TreeNode<Integer>(12);
		n.Left.Left.Left.Left = new TreeNode<Integer>(5);
		n.Left.Left.Left.Right=new TreeNode<Integer>(29);
		n.Left.Left.Right.Left=new TreeNode<Integer>(9);
		n.Right.Right.Left.Left =new TreeNode<Integer>(13);
		n.Right.Right.Left.Right =new TreeNode<Integer>(14);
		n.Right.Right.Left.Right.Right =new TreeNode<Integer>(1);
		n.Right.Right.Left.Right.Right.Right =new TreeNode<Integer>(3);*/
		
		TreeNode<Integer> n = new TreeNode<Integer>(3);
		n.Left = new TreeNode<Integer>(7);
		n.Right = new TreeNode<Integer>(8);
		n.Left.Left = new TreeNode<Integer>(1);
		n.Left.Right = new TreeNode<Integer>(9);
		n.Left.Right.Right = new TreeNode<Integer>(2);
		
		
		TreeTraversal traversal = new TreeTraversal(n);
		System.out.println("------inOrder------");
		traversal.inOrder(n);
		System.out.println("------preOrder------");
		traversal.preOrder();
		System.out.println("------postOrder------");
		traversal.postOrder();
		System.out.println("-------depth-------");
		System.out.println(+traversal.height(n));
		
		//System.out.println(traversal.mirror(n));
		TreeNode<Integer> mirrorRoot = traversal.mirror(n);
		traversal.preOrder(mirrorRoot);
		

		
}
}
