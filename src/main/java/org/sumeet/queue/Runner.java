package org.sumeet.queue;

public class Runner {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(6);
        queue.enqueue(6);

        queue.dequeue();
        queue.dequeue();


        queue.show();
    }
}
