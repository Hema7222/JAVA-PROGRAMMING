package DataStructures;

public class TreeTraversal {
	TreeNode<Integer> root;
	
	public TreeTraversal(TreeNode<Integer> root) {
		this.root = root;
	}
	
	/*public void inOrder() {
		inOrder(root);
	}*/
	
	public void inOrder(TreeNode<Integer> currentRoot) {
		if(currentRoot != null)
		{
			inOrder(currentRoot.Left);
			System.out.println(currentRoot.data);
			inOrder(currentRoot.Right);
		}
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(TreeNode<Integer> currentRoot) {
		if(currentRoot != null)
		{
			System.out.println(currentRoot.data);
			preOrder(currentRoot.Left);
			preOrder(currentRoot.Right);
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(TreeNode<Integer> currentRoot) {
		if(currentRoot != null)
		{
			postOrder(currentRoot.Left);
			postOrder(currentRoot.Right);
			System.out.println(currentRoot.data);
		}
	}

}
