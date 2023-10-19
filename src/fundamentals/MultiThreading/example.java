package fundamentals.MultiThreading;

// multithreading -> Process of executing multiple threads simultaneously
// Helps maximum utilization of CPU
// Threads are independent, they do not affect the execution of other threads
// And exception in one thread will not interrup other threads
// usefull for serving multiple clients, multiplayer games, or other mutually independent tasks

public class example {
    public static void main(String[] args) throws InterruptedException {

        // Create a subclass of thread
        MyThread thread1 = new MyThread();

        // implement Runnable interface and pass instance as an argument to Thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread1.join(3000); // calling thread (ex: main) wait until the specified thread dies or for x milliseconds
        thread2.start();

        // System.out.println(1/0); -> exception
    }
}
