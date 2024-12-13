package prob2;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (rear == arr.length){
            resize();
        }
        if (front == -1){
            front = 0;
        }
        arr[rear++] = obj;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = arr[front];
        arr[front] = 0;
        front++;

        if (front == rear) {
            front = -1;
            rear = 0;
        }
        return result;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (isEmpty()){
            return 0;
        }
        return rear - front;
    }

    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];
        for (int i = front; i < rear; i++) {
            newArr[i - front] = arr[i];
        }
        rear = rear - front;
        front = 0;
        arr = newArr;
    }

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();

        System.out.println("Is queue empty? " + queue.isEmpty()); // true

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Peek: " + queue.peek()); // 10

        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Peek: " + queue.peek()); // 20

        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Queue size: " + queue.size()); // 4

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        System.out.println("Dequeue on empty: " + queue.dequeue());
    }
}