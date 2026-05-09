package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // 3

        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // 1

        // ---

        System.out.println("=== Deque as Queue ===");
        Deque<Integer> dequeQueue = new ArrayDeque<>();
        dequeQueue.offerLast(1);
        dequeQueue.offerLast(2);
        dequeQueue.offerLast(3);
        System.out.println(dequeQueue.pollFirst()); // 1

        System.out.println("=== Deque as Stack ===");
        Deque<Integer> dequeStack = new ArrayDeque<>();
        dequeStack.push(10);
        dequeStack.push(20);
        dequeStack.push(30);
        System.out.println(dequeStack.pop()); // 30
    }
}
