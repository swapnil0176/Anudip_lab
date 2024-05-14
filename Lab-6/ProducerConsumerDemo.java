package thursdayLab6;

import java.util.LinkedList;

class SharedResource {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedResource(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }

            System.out.println("Producing: " + item);
            buffer.add(item);

            notify(); // Notify consumer that an item is produced
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }

            int consumedItem = buffer.removeFirst();
            System.out.println("Consuming: " + consumedItem);

            notify(); // Notify producer that an item is consumed
        }
    }
}

class Producer extends Thread {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                sharedResource.produce(i);
                Thread.sleep(1000); // Simulate some time for production
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                sharedResource.consume();
                Thread.sleep(1500); // Simulate some time for consumption
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(2);

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}

