package answer;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(1);
        queue.offerLast(2);
        queue.offerLast(3);

        System.out.println("=== Queue ===");
        System.out.println("Front: " + queue.peekFirst());
        System.out.println(queue.pollFirst() + " dequeued");
        System.out.println(queue.pollFirst() + " dequeued");
        System.out.println(queue.pollFirst() + " dequeued");
        System.out.println("Empty? " + queue.isEmpty());

        System.out.println();

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("=== Stack ===");
        System.out.println("Top: " + stack.peek());
        System.out.println(stack.pop() + " popped");
        System.out.println(stack.pop() + " popped");
        System.out.println(stack.pop() + " popped");
        System.out.println("Empty? " + stack.isEmpty());
    }
}
