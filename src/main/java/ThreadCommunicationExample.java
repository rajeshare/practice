class SharedData {
    private int data;
    private boolean isProduced = false; // Flag to track data availability

    // Producer method
    public synchronized void produce(int value) {
        while (isProduced) { // If data is already produced, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = value;
        System.out.println("Produced: " + value);
        isProduced = true;
        notify(); // Notify the consumer that data is available
    }

    // Consumer method
    public synchronized void consume() {
        while (!isProduced) { // If no data, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify(); // Notify the producer that consumption is done
    }
}

// Producer Thread
class Producer extends Thread {
    private SharedData sharedData;

    Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedData.produce(i);
            try {
                Thread.sleep(500); // Simulating delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private SharedData sharedData;

    Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedData.consume();
            try {
                Thread.sleep(1000); // Simulating delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main Class
public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}
