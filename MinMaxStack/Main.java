package MinMaxStack;

public class Main {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();
        stack.push(5);
        stack.push(4);
        stack.push(7);
        System.out.println("Минимальное значение: " + stack.min());
        System.out.println("Максимальное значение: " + stack.max());
        stack.pop();
        System.out.println("Минимальное значение: " + stack.min());
        System.out.println("Максимальное значение: " + stack.max());
    }
}