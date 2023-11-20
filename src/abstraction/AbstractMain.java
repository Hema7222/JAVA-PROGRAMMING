package abstraction;

public class AbstractMain {
	public static void main(String[] args) {
		AbstractChild a = new AbstractChild();
		System.out.println(a.onChip(20));
		System.out.println(a.onLongClick());
	}

}
