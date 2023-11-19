class MyThread extends Thread {
    private int threadNumber;
    
    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
    }
}

public class thread9 {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        
        for (int i = 1; i <= numberOfThreads; i++) {
            MyThread thread = new MyThread(i);
            thread.start();
        }
    }
}