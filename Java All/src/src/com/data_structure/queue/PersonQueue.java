package src.com.data_structure.queue;

import java.util.ArrayList;

public class PersonQueue {
    private final ArrayList<String> queue;

    public PersonQueue() {
        queue = new ArrayList<>();
    }

    public void push(String person) {
        queue.add(person);
    }

    public String pop() throws EmptyQueueException {
        if (!queue.isEmpty()) {
            return queue.removeFirst();
        }
        throw new EmptyQueueException("Queue is empty");
    }

    public String peek() throws EmptyQueueException {
        if (!queue.isEmpty()) {
            return queue.getFirst();
        }
        throw new EmptyQueueException("Queue is empty");
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        if (!queue.isEmpty()) {
            for (String string : queue) {
                System.out.print(string + " ");
            }
        } else {
            System.out.println("Queue is empty");
        }
    }
}
