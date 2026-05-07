import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueue {
    private Deque<Integer> deque;

    public DequeQueue() {
        deque = new ArrayDeque<>();
    }

    public void enqueue(int item) {
        deque.offerLast(item);
        System.out.println(item + " is enqueued.");
    }

    public int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return deque.pollFirst();
    }

    public int peek() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return deque.peekFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
