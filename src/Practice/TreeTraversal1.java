package Practice;

public class TreeTraversal1 {
	TreeNode1<Integer> root;

    public TreeTraversal1(TreeNode1<Integer> root) {
        this.root = root;
    }
    
    public void inOrder() {
		inOrder(root);
	}
    public void inOrder(TreeNode1<Integer> currentRoot) {
		if(currentRoot != null)
		{
			inOrder(currentRoot.getLeft());
			System.out.println(currentRoot.getData());
			inOrder(currentRoot.getRight());
		}
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(TreeNode1<Integer> currentRoot) {
		if(currentRoot != null)
		{
			
			System.out.println(currentRoot.getData());
			preOrder(currentRoot.getLeft());
			preOrder(currentRoot.getRight());
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(TreeNode1<Integer> currentRoot) {
		if(currentRoot != null)
		{
			//if(currentRoot == n)
			postOrder(currentRoot.getLeft());
			postOrder(currentRoot.getRight());
			System.out.println(currentRoot.getData());
		}
	}
	
	//Maximum depth of a tree
	public int height(TreeNode1<Integer> currentRoot) {
		if(currentRoot == null) {
			return 0;
		}
		else {
			//Integer data = currentRoot.data;
			int leftheight=height(currentRoot.getLeft());
			int rightheight=height(currentRoot.getRight());
			
			if(leftheight>rightheight)
			{
				return leftheight+1;
			}
			else
			{
				return rightheight+1;
			}
			
		}
	}

}
