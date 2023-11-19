
class MyThread extends Thread {
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + name + " finished.");
    }
}

public class thread13
 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
            thread3.join(); // Wait for thread3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");
    }
}