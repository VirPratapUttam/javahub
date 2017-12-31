package datastructure.heap;

public class Heap {
	public int[] array;
	public int count;
	public int capacity;
	public int heap_type;

	public Heap(int capacity, int heap_type) {
		this.heap_type = heap_type;
		this.count = 0;
		this.capacity = capacity;
		this.array = new int[capacity];
	}

	public int parent(int i) {
		if (i <= 0 || i >= this.count)
			return -1;
		return i - 1 / 2;
	}

	public int leftChild(int i) {
		int left = 2 * i + 1;
		if (left >= this.count)
			return -1;
		return left;
	}

	public int rightChild(int i) {
		int right = 2 * i + 2;
		if (right >= this.count)
			return -1;
		return right;
	}

	public int getMaximum() {
		if (this.count == 0)
			return -1;
		return this.array[0];
	}

	void resizeHeap() {
		int[] array_old = new int[this.capacity];
		System.arraycopy(this.array, 0, array_old, 0, this.count - 1);
		this.array = new int[this.capacity * 2];
		if (this.array == null) {
			System.out.println("Memory Error");
			return;
		}
		for (int i = 0; i < this.capacity; i++) {
			this.array[i] = array_old[i];
		}
		this.capacity *= 2;
		array_old = null;
		System.out.println("Exist from resize");
	}
	void destroyHeap()
	{
		this.count=0;
		this.array=null;
	}
}
