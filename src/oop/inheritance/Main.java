package oop.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clinked c = new Clinked();
		
		c.addNode(12);
		c.addNode(13);
		c.addNode(15);
		
		c.deleteFirst(0);
		c.addFirst(33);
		
		c.display();

	}

}
