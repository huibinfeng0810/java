package thread_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by fenghb on 3/11/14.
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {

            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());

        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory());
            System.out.println("all daemons started");
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }
}
