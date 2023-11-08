package Array_Program1;

import java.util.LinkedList;

//import java.util.ArrayList;

public class Linked {

	public static void main(String[] args) {
		/*ArrayList<Linked_List> arr = new ArrayList<Linked_List>();
		Linked_List mLinked_List = new Linked_List(10, "HP");
		arr.add(mLinked_List);
		arr.add(new Linked_List(20, "guru"));
		arr.add(new Linked_List(30, "hema"));
		arr.add(new Linked_List(240, "swathi"));
		arr.add(new Linked_List(260, "ravi"));
		arr.add(new Linked_List(270, "dhanush"));
		arr.add(new Linked_List(290, "gugu"));
		arr.add(new Linked_List(280, "hari"));
		arr.add(new Linked_List(2760, "mano"));
		arr.add(new Linked_List(2540, "shalu"));
		arr.add(new Linked_List(250, "kavya"));
		
		arr.remove(2);
		arr.contains(mLinked_List);
		
		for(Linked_List nd:arr) {
			System.out.println(nd.getIndex()+" : "+nd.getName());
			
		}*/
		int arr[]= {1,2,3,4,5,6};
		LinkedList<Integer> arr1 = new LinkedList<Integer>();
		for(int n:arr)
		{
			arr1.add(n);
		}
		arr1.add(3);
		arr1.add(4);
		int a=arr1.size();
		System.out.println(a);

	}

}
