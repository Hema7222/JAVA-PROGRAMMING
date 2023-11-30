package DataStructures;

public class TreeMain {

	public static void main(String[] args) {
		/*TreeNode<Integer> n = new TreeNode<Integer>(50);
		
		BinarySearchTree bst = new BinarySearchTree(n);
		
		
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        int search1=70;
        int search2=75;
        int search3=(80);
        System.out.println("search1: "+bst.search(search1));
        System.out.println("search2: "+bst.search(search2));
        System.out.println("search3: "+bst.search(search3));*/
		
		
		TreeNode<Integer> n = new TreeNode<Integer>(38);
		n.Left = new TreeNode<Integer>(27);
		n.Right = new TreeNode<Integer>(25);
		n.Left.Left = new TreeNode<Integer>(20);
		n.Left.Right = new TreeNode<Integer>(18);
		n.Right.Left = new TreeNode<Integer>(45);
		n.Right.Right = new TreeNode<Integer>(32);
		n.Left.Left.Left = new TreeNode<Integer>(55);
		n.Left.Left.Right = new TreeNode<Integer>(24);
		n.Left.Right.Left = new TreeNode<Integer>(28);
		//n.Left.Right.Right = new TreeNode<Integer>(32);
		n.Right.Left.Left =new TreeNode<Integer>(39);
		n.Right.Left.Right = new TreeNode<Integer>(8);
		n.Right.Left.Right.Right = new TreeNode<Integer>(12);
		n.Right.Left.Right.Right.Left = new TreeNode<Integer>(9);
		
		n.Right.Right.Left = new TreeNode<Integer>(13);
		n.Right.Right.Right = new TreeNode<Integer>(16);
		n.Right.Right.Right.Left = new TreeNode<Integer>(6);
		n.Right.Right.Right.Right = new TreeNode<Integer>(4);
		//n.Right.Right.Left.Left = new TreeNode<Integer>(11);
		
		
		
		/*n.Right.Left.Right.Left = new TreeNode<Integer>(65);
		n.Right.Left.Right.Left.Left = new TreeNode<Integer>(70);
		n.Right.Right.Right = new TreeNode<Integer>(75);
		n.Left.Left.Left.Left = new TreeNode<Integer>(5);
		n.Left.Left.Left.Right=new TreeNode<Integer>(29);
		n.Left.Left.Right.Left=new TreeNode<Integer>(45);
		n.Right.Right.Right.Left =new TreeNode<Integer>(80);
		n.Right.Right.Right.Left.Right =new TreeNode<Integer>(100);
		n.Right.Right.Right.Left.Left =new TreeNode<Integer>(85);
		n.Right.Right.Right.Left.Left.Right =new TreeNode<Integer>(90);
		n.Right.Right.Right.Left.Left.Right.Left =new TreeNode<Integer>(110);
		
		n.Right.Right.Left.Right.Right.Right =new TreeNode<Integer>(3);*/
		
		
		
		
		TreeTraversal traversal = new TreeTraversal(n);
		System.out.println("------inOrder------");
		traversal.inOrder(n);
		System.out.println("------preOrder------");
		traversal.preOrder(n);
		//traversal.preOrder(n);
		System.out.println("------postOrder------");
		traversal.postOrder();
		System.out.println("-------depth-------");
		System.out.println(+traversal.height(n));
		
		
		/*System.out.println(traversal.mirror(n));
		TreeNode<Integer> mirrorRoot = traversal.mirror(n);
		traversal.preOrder(mirrorRoot);*/
		
		        

		
}
}
