package Practice;

public class TreeNode1<A> {
	
	A data;
	//A n;
	TreeNode1<A> left;
	TreeNode1<A> right;
	
	public TreeNode1(A data) {        // there is no return type in constructor
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public TreeNode1(A data, TreeNode1<A> left, TreeNode1<A> right) {
		this.data= data;
		this.left=left;
		this.right=right;
	}
	
	public A getData() {
		return data;
	}
	
	public TreeNode1<A> getLeft() {
		return left;
	}
	
	public TreeNode1<A> getRight() {
		return right;
	}
	
	public void setData(A data) {
		this.data = data;
	}
	
	public void setLeft(TreeNode1<A> left) {
		this.left = left;
	}
	
	public void setRight(TreeNode1<A> right) {
		this.right = right;
	}
}


