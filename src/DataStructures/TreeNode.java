package DataStructures;

public class TreeNode<A> {
	
		A data;
		TreeNode<A> Left;
		TreeNode<A> Right;
		
		public TreeNode(A data) {
			this.data=data;
			this.Left=null;
			this.Right=null;
		}
}
