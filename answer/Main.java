package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Deque as Queue ===");
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(1);
        queue.offerLast(2);
        queue.offerLast(3);
        System.out.println(queue.pollFirst()); // == .peak()。注意.peak()是有返回值的，返回「队首指针」所指向的 element

        System.out.println("=== Deque as Stack ===");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // == .pop() 注意pop是有返回值的，返回被pop的element

        System.out.println("=== Double-Ended Queue ===");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(1);      // [1]
        dq.addLast(2);   
        // 此时为：[1, 2]

        // 此时为：[0, 1, 2]    ← 在队首新增｜array 实现的 queue 做不到
        dq.addFirst(0);     
        System.out.println(dq.pollFirst());

        System.out.println(dq.pollLast());      // 返回 2       ← 在队尾peek｜数组 queue 也做不到

    }
}
