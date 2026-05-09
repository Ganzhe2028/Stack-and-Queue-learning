package answer;
public class ArrayQueue {

    int front, rear, size;
    int capacity;
    int array[];

    public ArrayQueue(int capacity) { 
        // 为了环形队列（circular buffer）而不写死capacity
        this.capacity = capacity;
        front = 0;
        rear = 0;
        size = 0;
        array = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull()) return; // 满了就无法再添加了 
        array[rear] = item; // 赋值当前位置元素为传入的参数 item，下一步再为下一次操作更新位置
        
        rear = (rear + 1) % capacity; // 更新为下一次enqueu的位置。如果r<capacity，则意味着运算得到的余数就是r自己的当前值
                                      // 如果是 r=capacity，也就是说r到了末尾了，那么 % 的操作会让它回到0，也就是开头的位置。
                                      // 也就是说 % 的作用就是在累积到末尾的时候，类似于「清楚了累积的index」以回到开头
                                      // x = (x+1) % capacity 的操作是通用的（用于在array中达到循环的效果），
                                      // 因此 rear 和 front 都可以用这个操作来更新位置。
        size++;

        System.out.println(item + " is enqueued.");
    }

    public int dequeue() {
        if (isEmpty()) return Integer.MIN_VALUE; // 空了就无法再删除了
        int item = array[front]; // 记录被dequeue的值

        front = (front + 1) % capacity; // 和上面的enqueue一样，更新为下一次dequeue的位置
                                        // 如果f<capacity，则意味着运算得到的余数就是f自己的当前值
                                        // 如果是 f=capacity，也就是说f到了末尾了，那么 % 的操作会让它回到0，也就是开头的位置。
                                        // 也就是说 % 的作用就是在累积到末尾的时候，类似于「清楚了累积的index」以回到开头
        size--;

        return item; // 返回被dequeue的值
        // 实际上并没有删除任何数值和覆盖数值，因为我们通过front和rear来控制访问的位置，所以即使array中原来的数值还在，我们也已经不访问它了。
    }

    public int peek() {
        if (isEmpty()) return Integer.MIN_VALUE; // 空了就无法再查看了
        return array[front];
    }

    public boolean isFull() { // 判断是否满
        return size == capacity; // size是否相等于capacity
    }

    public boolean isEmpty() { // 判断是否空
        return size == 0; // size是否相等于0
    }

}

