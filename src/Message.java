public class Message {
    private int id;
    private String message;

    public Message(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public static void sortById(Message[] list) {
	    int i, j;
        Message key;
        int size = list.length;
        for (i = 1; i < size; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && list[j].getId() > key.getId()) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
