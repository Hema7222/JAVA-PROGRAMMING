package heap;

public class HeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapLogic heap = new HeapLogic(8);
		heap.insert(21);
		heap.insert(17);
		heap.insert(12);
		heap.insert(19);
		heap.insert(15);
		heap.insert(18);
		heap.insert(13);
		heap.insert(12);
		
		heap.print();
		//heap.minheaprecursion(0, 0);

	}

}
