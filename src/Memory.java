public class Memory {
	private int id;
	private int size;
	private int elapsedTime;
	
	public Memory(int id, int size) {
		this.id = id;
		this.size = size;
		this.elapsedTime = 0;
	}

	public int getId() {
		return id;
	}

	public int getSize() {
		return size;
	}

	public int getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

//	@Override
//	public String toString() {
//		return "Memory{" +
//				"id=" + id +
//				", size=" + size +
//				", elapsedTime=" + elapsedTime +
//				'}';
//	}
}
