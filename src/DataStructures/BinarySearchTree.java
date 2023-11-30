package DataStructures;

public class BinarySearchTree {
	TreeNode<Integer> root;          //BSTNode root;
	
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
