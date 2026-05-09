package answer;
public class ArrayStack {

    static final int CAPACITY = 1000;
    int top;
    int stack[];

    public ArrayStack() {
        top = -1;
        stack = new int[CAPACITY];
        // array 的长度是固定的，相比之下 linked list 的长度就可以持续往后加，
        // 因为它是通过node来连接的，
        // 本质上没有自己的固定的“范围/长度”的概念（其实就是计算机的内存了）
        // 而 arraylist 就是可以调整长度的

    }

    // Stack 改成可配容量：
    //
    // public ArrayStack(int capacity) {
    // stack = new int[CAPACITY];
    // top = -1;
    // }
    //

    public boolean push(int val) { // 检查stack是否overflow了
        if (top >= (CAPACITY - 1)) {
            System.out.println("StackOverflow.");
            return false;
        }

        // stack[top + 1] = val;
        // top++;

        // 另一种写法，利用 ++top 来「先更新top=top+1」，「再用这个新top来访问」stack
        stack[++top] = val; // 把后一位的元素赋值为val，同时更新top

        return true;
    }

    public int pop() { // 「pop」意为“拿出来用”，所以要返回被pop的元素，并且代表着这个东西被“拿走了”
                       // 但是在这个简易array的实现中，不会被设置为null，也不会被删除，其实依旧在那里甚至可以手动访问到它（which其实是违反了stack的意图的），
                       // 但是我们通过top来控制访问的范围，所以就相当于被「pop」掉了。
                       // 然而这份代码中没有 private int top。
                       
                        // public class DequeStack {
                        //     private Deque<Integer> deque;  // ← private！外面摸不到
                        //     ...
                        // }

                        // ArrayDeque 内部大概长这样
                        //
                        // public E pop() {
                        //     E result = elements[head];
                        //     elements[head] = null;  // ← 真的把引用清空了！
                        //     head = (head + 1) & (elements.length - 1);
                        //     return result;
                        // }
                        //

        if (top < 0) { // 检查stack是否underflow了，是的话无法虚空pop一个元素
            System.out.println("StackUnderflow.");
            return 0;
        }

        int element = stack[top--]; // 准备一个element赋值为当前栈顶元素，
                                    // 然后top--执行，更新top，也就是把指针移向前面一位

        return element; // 返回被pop的元素。
                        // 也就是说，在这里并没有对「被pop的那个元素」做任何操作，也没有在这里更新它
                        // 只是把指针从它上面移开了。
    }

    public int peek() {
        if (top < 0) { // 检查stack是否underflow了，是的话peek你也找不到
            System.out.println("StackUnderflow");
            return 0;
        }

        int element = stack[top]; // 没有就正常peek那个元素

        return element;
    }

    public boolean isEmpty() { // 检查stack是否empty了，通过top<0来判断
        return top < 0;
    }
}