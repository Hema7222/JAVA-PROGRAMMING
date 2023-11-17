package oops;

public class InheritanceMain {

	public static void main(String[] args) {
		
		ParentExample exp=new ParentExample(1);
		ParentExample exp1=new ParentExample("Hema");
		ChildExample childexp=new ChildExample();
		
		System.out.println("Print 1:"+exp.primeNumber());
		System.out.println("Print 2:"+exp.test());
		System.out.println("Print 3:"+exp1.test());
		System.out.println("Print 4:"+childexp.test());
		
		/*MyArrayList testArr = new MyArrayList();
		testArr.add("Raju");*/

	}

}
