package Practice;

public class ClsMain {

	public static void main(String[] args) {
		
		//Index Position Program:
		
		/*IndexPosition i = new IndexPosition();
		String str = "Power";
		i.test(str);*/
		
		
		
		//Duplicate Character Program:
		
		/*DuplicateChar c = new DuplicateChar();
		String str = "moment";
		c.Duplicate(str);*/
		
		
		
		//String Example:
		
		/*StringExample s = new StringExample();
		String b = "welcome";
		String a = "hello world";
		String c = "welcome hello world";
		s.example(b, a, c);*/
		
		
		// Operations Example:
		
		/*OperstionsExample s = new OperstionsExample();
		
		s.setA(10);
		s.setB(5);
		System.out.println("Add: "+s.getC());
		System.out.println("Sub: "+s.getX());
		System.out.println("Mul: "+s.getY());*/
		
		//BINARY TREE TRAVERSAL:             
		TreeNode1<Integer> n = new TreeNode1<Integer>(38);
		n.left = new TreeNode1<Integer>(27);
		n.right = new TreeNode1<Integer>(25);
		n.left.left = new TreeNode1<Integer>(20);
		n.left.right = new TreeNode1<Integer>(18);
		n.right.left = new TreeNode1<Integer>(45);
		n.right.right = new TreeNode1<Integer>(32);
		n.right.right.right=new TreeNode1<Integer>(30);
		
		TreeTraversal1 tt = new TreeTraversal1(n);
		System.out.println("------PostOrder------");
		tt.postOrder(n);
		System.out.println("------InOrder------");
		tt.inOrder(n);
		System.out.println("------PreOrder------");
		tt.preOrder(n);
		System.out.println("-------height-------");
		System.out.println(+tt.height(n));
		System.out.println("----lowest----");
		System.out.println(+tt.lowest(n));
		System.out.println("------diameter------");
		System.out.println(+tt.diameter(n));
		//Logic logic=new Logic(n);
		TreeNode1<Integer> LCA= TreeTraversal1.shortPath(n,18,30);
		if(LCA!=null)
			System.out.println("Shortest path b/w 18 & 30 :"+LCA.data);
		else
			System.out.println("No path found");

	}

}
