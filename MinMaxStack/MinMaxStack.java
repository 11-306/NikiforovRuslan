package MinMaxStack;

import java.util.Stack;

public class MinMaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    private Stack<Integer> maxStack;

    public MinMaxStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        int poppedValue = mainStack.pop();
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
        if (poppedValue == maxStack.peek()) {
            maxStack.pop();
        }
        return poppedValue;
    }

    public int min() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return minStack.peek();
    }

    public int max() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return maxStack.peek();
    }
}