package thread_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by fenghb on 3/10/14.
 */
public class SimplePrioritys implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;

    public SimplePrioritys(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (countDown-- > 0) {
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
                System.out.println(this);
                if (--countDown == 0) return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask(i));
            exec.shutdown();
        }
    }
}
