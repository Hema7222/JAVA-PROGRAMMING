package Array_Program1;

public class Linked_List {
	int index;
	String name;
	public Linked_List(int index, String name) {         //constructor
		this.index=index;
		this.name=name;
	}
	
	//Encapsulation
	public void setIndex(int index) {       //set the value "index" by passing integer value as parameter
		this.index = index;
	}
	public int  getIndex() {            //returns the current value of "index" property
		return index;
	}
	public void setName(String name) {      //set the value "name" by passing string value as parameter
		this.name = name;
	}
	public String getName() {            //returns the current value of "name" property
		return name;
	}
}
