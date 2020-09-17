public class Program {
	private int id;
	private int size;
	private int time;
	private int memoryIndex;
	
	public Program(int id, int size, int time) {
		this.id = id;
		this.size = size;
		this.time = time;
		this.memoryIndex = -1;
	}

	public int getId() {
		return id;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getTime() {
		return time;
	}

	public int getMemoryIndex() {
		return memoryIndex;
	}

	public void setMemoryIndex(int memoryIndex) {
		this.memoryIndex = memoryIndex;
	}

//	@Override
//	public String toString() {
//		return "Program{" +
//				"id=" + id +
//				", size=" + size +
//				", time=" + time +
//				'}';
//	}

	public static void sortByTime(Program[] list) {
	    int i, j;
	    Program key;
		int size = list.length;
		for (i = 1; i < size; i++) {
		    key = list[i];
		    j = i - 1;
		    while (j >= 0 && list[j].getTime() > key.getSize()) {
		        list[j + 1] = list[j];
		        j = j - 1;
            }
		    list[j + 1] = key;
		}
	}
}
