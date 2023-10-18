package fundamentals.Thread;

// Thread -> A thread of execution in a program (kind of lke a Virtual CPU)
// The JVM allows an application to have multiple threads running concurrently
// Each thread can execute parts of your code in parallel with the main thread
// Each thread has a priority.
// Threads with higher priority are executed in preference compared to thereds with lower priority

// The Java Virtual Machine continues to execute threads until either of the following occurs
// 1. The exit method of calss RunTime has been called.
// 2. No All user threads

// When a JVM starts up, there is a thread which calls the main method
// This thread is call `main`

// Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
// JVM terminates itself when all user threads (non-daemon threads) finish their execution


public class example {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("Main........");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

        for (int i = 3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("You are done!");

        //------ Making other thread
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);
        System.out.println("thred2 Daemon or not " + thread2.isDaemon());
        thread2.start();
        System.out.println(thread2.isAlive());
        thread2.setName("Second Thread....");
        System.out.println(thread2.getName());
        thread2.setPriority(1);
        System.out.println(thread2.getPriority());
    }
}
