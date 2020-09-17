public class ProgramQueue {
	int size;
	Program[] array;
	int front;
	int rear;
	int nItems;
	
	public ProgramQueue(int size) {
		this.size = size;
		this.array = new Program[this.size];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(Program program) {
		if (!isFull()) {
			if (rear == size - 1) {
				rear = -1;
			}
			rear++;
			array[rear] = program;
			nItems++;
		}
	}
	
	public Program remove() {
		if (!isEmpty()) {
			Program program = array[front];
			front++;
			if (front == size) {
				front = 0;
			}
			nItems--;
			return program;
		}
		return null;
	}
	
	public Program peekFront() {
		if (!isEmpty()) {
			return array[front];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == size);
	}
}
