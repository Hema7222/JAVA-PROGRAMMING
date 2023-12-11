package heap;

public class HeapNode {
	int data;
	HeapNode left;
	HeapNode right;
	
	public HeapNode(int data) {
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	public HeapNode getLeft() {
		return left;
	}
	public HeapNode getRight() {
		return right;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(HeapNode left) {
		this.left = left;
	}
	public void setRight(HeapNode right) {
		this.right = right;
	}

}
