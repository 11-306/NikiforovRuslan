package Queue;

public class Queue {
    private static final int SIZE = 100;
    private String[] data = new String[SIZE];
    private int start = 0;
    private int end = 0;
    public boolean add(String element) {
        if (end == SIZE) {
            return false;
        } else {
            data[end] = element;
            end++;
            return true;
        }
    }

    public String remove() {
        if (start == end) {
            return null;
        } else {
            String x = data[start];
            start++;
            return x;
        }
    }

    public int size() {
        return end - start;
    }
}