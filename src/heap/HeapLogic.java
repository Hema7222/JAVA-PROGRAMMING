package heap;

public class HeapLogic {
	int[] heap;
	int maxsize;
	int size;
	
	public HeapLogic(int maxsize) {
		this.maxsize = maxsize;
		this.heap = new int[maxsize];
		heap[0]=6789;
		this.size=0;
	}
	
	public int parentpos(int pos) {
		return pos/2;
	}
	public int leftchild(int pos) {
		return pos*2;
	}
	public int rightchild(int pos) {
		return (pos*2)+1;
	}
	
	public void swap(int pos1, int pos2) {
		int temp=heap[pos1];
		heap[pos1]=heap[pos2];
		heap[pos2]=temp;
	}
	
	public void maxheap(int pos) {
		//int value=heap[pos1];
		while(pos>0 && parentpos(pos) > 0 && heap[parentpos(pos)] < heap[pos]);
		{
			swap(pos, parentpos(pos));
			pos=parentpos(pos);
		}
	}
	
	public void minheaprecursion(int parentpos, int pos2) {
		if(parentpos !=0 && pos2 !=0 && heap[parentpos]>heap[pos2]) {
			swap(parentpos, pos2);
			minheaprecursion(parentpos(parentpos), parentpos);
		}
	}
	
	/*public void minheap(int pos) {
		//int value=heap[pos1];
		while(pos>0 && parentpos(pos) > 0 && heap[parentpos(pos)] > heap[pos]);
		{
			swap(pos, parentpos(pos));
			pos=parentpos(pos);
		}
	}*/
		
	
	
	public void insert(int val) {
		//size=size+1;
		heap[++size]=val;
		int currentsize=size;
		//minheap(currentsize);
		minheaprecursion(parentpos(currentsize), currentsize);
	}
	
	public void print() {
		//for(int i=1; i<heap.length/2;i++) {
		for(int i=1;i<heap.length;i++) {
			System.out.println(heap[i]);
			
			if(maxsize>=leftchild(i)) {
				System.out.println("left: "+heap[leftchild(i)]);
			}
			if(maxsize>=rightchild(i)) {
				System.out.println("right: "+heap[rightchild(i)]);
			}
		}
	}
	
}


