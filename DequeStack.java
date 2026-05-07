import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack {
    private Deque<Integer> deque;

    public DequeStack() {
        deque = new ArrayDeque<>();
    }

    public boolean push(int val) {
        deque.push(val);
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("DequeStack Underflow.");
            return 0;
        }
        return deque.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("DequeStack Underflow");
            return 0;
        }
        return deque.peek();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
