
public class maxheap {
	public Integer[] heap;
	int n;
	public maxheap(int capacity) {
		heap=new Integer[capacity+1];
		n=0;
	}
	public boolean isempty() {
		return n==0;
		
	}
	public int size() {
		return n;
	}
	public void insert(int x) {
		if(n==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	public void swim(int k) {
		while(k>1 && heap[k]>heap[k/2]) {
			int temp= heap[k/2];
			heap[k/2]=heap[k];
			heap[k]=temp;
			k=k/2;
		}
	}
	public void resize(int capacity) {
		Integer[] temp=new Integer[capacity];
		for(int i=0;i<heap.length;i++) {
		temp[i]=heap[i];
			
		}
		heap=temp;
	}
	public void display() {
		for(int i=0;i<heap.length;i++) {
			System.out.println(heap[i]);
		}
	}
	public static void main(String ar[] ){
		maxheap Heap=new maxheap(3);
		Heap.insert(1);
		Heap.insert(1);
		Heap.insert(1);
		Heap.insert(1);
		Heap.insert(1);
		Heap.insert(1);
		System.out.println(Heap.isempty());
		System.out.println(Heap.size());
		Heap.display();
		}
		
	
}
