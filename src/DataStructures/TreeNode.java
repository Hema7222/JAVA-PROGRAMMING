package DataStructures;

public class TreeNode<A> {
	
		A data;
		//A n;
		TreeNode<A> Left;
		TreeNode<A> Right;
		
		public TreeNode(A data) {        // there is no return type in constructor
			this.data=data;
			this.Left=null;
			this.Right=null;
		}
}
