package uk.co.oliverdelange.multithreading;

public class NonThreadSafe {
    public static void main(String[] args) {
        new NonThreadSafe().doThreadStuff();
    }
    long counter = 0l;

    public long nextCount() {
        counter++;
        // This Thread.sleep forces the other thread to take over to force the problem
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public void doThreadStuff() {
        myThread thread1 = new myThread();
        myThread thread2 = new myThread();

        thread1.start();
        thread2.start();
    }

    public class myThread extends Thread {
        public void run() {
            while(true) {
                System.out.println(nextCount());
            }
        }
    }
}
