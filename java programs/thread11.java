class Counter {
    private int count;

    public Counter() {
        count = 0;
    }
    
    public synchronized void increment() {
        count++;
    }
    
    public synchronized int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;
    
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class thread11{
    public static void main(String[] args) {
        int numberOfThreads = 5;
        
        Counter counter = new Counter();
        MyThread[] threads = new MyThread[numberOfThreads];
        
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new MyThread(counter);
            threads[i].start();
        }
        
        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Final Count: " + counter.getCount());
    }
}