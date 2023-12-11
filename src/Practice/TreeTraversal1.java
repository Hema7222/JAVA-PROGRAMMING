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
	
	
	
	public int lowest(TreeNode1<Integer> currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		
		else {
			int leftheight=height(currentRoot.getLeft());
			int rightheight=height(currentRoot.getRight());
			if(leftheight<rightheight)
			{
				return leftheight+1;
			}
			else
			{
				return rightheight+1;
			}
		}
	}
	
	public int diameter(TreeNode1<Integer> currentRoot) {
	    if (currentRoot == null) {
	        return 0;
	    }

	    int lheight = height(currentRoot.getLeft());
	    int rheight = height(currentRoot.getRight());

	    int ldiameter = diameter(currentRoot.getLeft());
	    int rdiameter = diameter(currentRoot.getRight());

	    System.out.println(currentRoot.getData() + " lh: " + lheight + " rh: " + rheight
	            + " ldia: " + ldiameter + " rdia: " + rdiameter);

	    
	    //return Math.max((lheight + rheight + 1), Math.max(ldiameter, rdiameter));
	
			
			
			if((lheight+rheight+1)>(ldiameter+rdiameter))
			{
				return lheight+rheight+1;
			}
			else
			{
				return ldiameter+rdiameter;
	}
	}
	
	
	
	public static TreeNode1<Integer> shortPath(TreeNode1<Integer> currentRoot,int a,int b) {
		if(currentRoot==null||currentRoot.data==a||currentRoot.data==b) {
			return currentRoot;
		}
		else {
			TreeNode1<Integer> left=shortPath(currentRoot.getLeft(), a, b);
			TreeNode1<Integer> right=shortPath(currentRoot.getRight(), a, b);
			
			if(left==null) {
				return right;
			}else if(right==null) {
				return left;
			}else {
				return currentRoot;
			}
		}
	}
}



