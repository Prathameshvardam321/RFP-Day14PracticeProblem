package queue;

public class QueueMain<T> {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.deQueue();
        queue.printQueue();
    }
}
