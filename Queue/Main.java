package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Иван");
        queue.add("Пётр");
        queue.add("Дарья");
        System.out.println("Кол-во элементов: " + queue.size());
        System.out.println(queue.remove() + ", " + queue.remove() + ", " + queue.remove());
        queue.add("Василий");
        queue.add("Владимир");
        queue.remove();
        System.out.println("Кол-во элементов: " + queue.size());
        System.out.println(queue.remove());
        System.out.println("Кол-во элементов: " + queue.size());
        System.out.println(queue.remove());
        for(int i=0;i<100;i++){
            queue.add("Иван");
        }
    }
}
