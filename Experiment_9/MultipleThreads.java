package Experiment_9;

class counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    counter c;
    MyThread(counter c) {
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class MultipleThreads { 

    public static void main(String[] args) throws InterruptedException {
        
        counter c = new counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();
    
        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + c.count);
     
    }

    
}
