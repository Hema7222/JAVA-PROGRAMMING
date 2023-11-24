package DataStructures;

public class TreeTraversal {
	TreeNode<Integer> root;
	
	public TreeTraversal(TreeNode<Integer> root) {
		this.root = root;
	}
	
	/*public void inOrder() {
		inOrder(root);
	}*/
	
	/*public void inOrder(TreeNode<Integer> currentRoot) {
		if(currentRoot != null)
		{
			inOrder(currentRoot.Left);
			System.out.println(currentRoot.data);
			inOrder(currentRoot.Right);
		}
	}*/
	
	public void preOrder() {
		preOrder(root);
	}
	
	/*public void preOrder(TreeNode<Integer> currentRoot) {
		if(currentRoot != null)
		{
			System.out.println(currentRoot.data);
			preOrder(currentRoot.Left);
			preOrder(currentRoot.Right);
		}
	}*/
	
	public void postOrder() {
		postOrder(root);
	}
	
	/*public void postOrder(TreeNode<Integer> currentRoot) {
		if(currentRoot != null)
		{
			postOrder(currentRoot.Left);
			postOrder(currentRoot.Right);
			System.out.println(currentRoot.data);
		}
	}*/
	
	
//Inorder, Preorder and Postorder using while loop:
	
	public void inOrder(TreeNode<Integer> currentRoot) {
        while (currentRoot != null)                     //loop continues until it covers entire tree
        {
            if (currentRoot.Left == null) 
            {
                System.out.println(currentRoot.data);       
                currentRoot = currentRoot.Right;
            } 
            else 
            {
                
                TreeNode<Integer> rightmost = currentRoot.Left;    // initialize rightmost to the left child
                while (rightmost.Right != null && rightmost.Right != currentRoot) 
                {
                    rightmost = rightmost.Right;      //move rightmost --> rightmost.Right in left sub tree
                }

                if (rightmost.Right == null) 
                {
                    System.out.println(currentRoot.data);  //print the node and create a temp link 
                    rightmost.Right = currentRoot;        //continue the loop until it completes the process in left subtree
                    currentRoot = currentRoot.Left;
                } 
                else 
                {
                    rightmost.Right = null;        //after completing left side now rightmost.Right will be null
                    currentRoot = currentRoot.Right;     //now it will move to right child
                }
            }
        }
    }
	
	public void preOrder(TreeNode<Integer> currentRoot) {
        while (currentRoot != null) 
        {
            if (currentRoot.Left == null) 
            {
                System.out.println(currentRoot.data);
                currentRoot = currentRoot.Right;
            } 
            else 
            {
                
                TreeNode<Integer> rightmost = currentRoot.Left;
                while (rightmost.Right != null && rightmost.Right != currentRoot) 
                {
                    rightmost = rightmost.Right;
                }

                if (rightmost.Right == null) 
                {
                    System.out.println(currentRoot.data);  
                    rightmost.Right = currentRoot;
                    currentRoot = currentRoot.Left;
                } else 
                {
                    rightmost.Right = null;
                    currentRoot = currentRoot.Right;
                }
            }
        }
    }
	
	public void postOrder(TreeNode<Integer> currentRoot) {
        while (currentRoot != null) 
        {
            if (currentRoot.Left == null) 
            {
                System.out.println(currentRoot.data);
                currentRoot = currentRoot.Right;
            } 
            else 
            {
                // Find the rightmost node in the left subtree
                TreeNode<Integer> rightmost = currentRoot.Left;
                while (rightmost.Right != null && rightmost.Right != currentRoot) 
                {
                    rightmost = rightmost.Right;
                }

                if (rightmost.Right == null) 
                {
                    System.out.println(currentRoot.data);  // Visit the current node before moving to the left subtree
                    rightmost.Right = currentRoot;
                    currentRoot = currentRoot.Left;
                } else 
                {
                    rightmost.Right = null;
                    currentRoot = currentRoot.Right;
                }
            }
        }
    }
}
