package DataStructures;

public class BinarySearchTree {
	TreeNode<Integer> root;          
	
	public BinarySearchTree(TreeNode<Integer> root)
	{
		this.root=root;
	}
	

	public boolean search(int data) {
		return search(root, data);
	}
	
	public boolean search(TreeNode<Integer> currentRoot,int data) {
		if(currentRoot==null) {      //root node no value send means it is null
			return false;          //if(currentRoot!=null && currentRoot.data == data)
		}
			//System.out.println(currentRoot.data);
			
			if(data < currentRoot.data) {
				return search(currentRoot.Left, data);
				
			}
			
			if(data > currentRoot.data) {
				return search(currentRoot.Right, data);
				
			}
			//System.out.println("false");
			return true;
			
	}
	
	
	public static TreeNode<Integer> shortPath(TreeNode<Integer> currentRoot,int a,int b) {
		if(currentRoot==null||currentRoot.data==a||currentRoot.data==b) {
			return currentRoot;
		}
		else {
			TreeNode<Integer> left=shortPath(currentRoot.Left, a, b);
			TreeNode<Integer> right=shortPath(currentRoot.Right, a, b);
			
			if(left==null) {
				return right;
			}else if(right==null) {
				return left;
			}else {
				return currentRoot;
			}
		}
	}
	
	public void insert(int data) {
		insert(root,data);
	}
	
	public TreeNode<Integer> insert(TreeNode<Integer> currentRoot,int data) {
		if(currentRoot==null) {
			return new TreeNode<>(data);
		}
		if(data<currentRoot.data) {
			currentRoot.Left=insert(currentRoot.Left, data);
		}
		if(data > currentRoot.data) {
			currentRoot.Right=insert(currentRoot.Right, data);
		}
		return currentRoot;
	}
	
	

}
