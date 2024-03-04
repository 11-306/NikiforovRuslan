package Queue;

public class Queue {
    private static final int SIZE = 100;
    private String[] data = new String[SIZE];
    private int start = 0;
    private int end = 0;

    public void add(String element) {
        if ((end + 1) % SIZE == start) {
            System.out.println("Ошибка: Очередь переполнена!");
        } else {
            data[end] = element;
            end = (end + 1) % SIZE;
        }
    }

    public String remove() {
        if (start == end) {
            return null;
        } else {
            String x = data[start];
            start = (start + 1) % SIZE;
            return x;
        }
    }

    public int size() {
        return (end - start + SIZE) % SIZE;
    }
}