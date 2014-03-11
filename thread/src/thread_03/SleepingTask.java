package thread_03;

import thread_01.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by fenghb on 3/10/14.
 */
public class SleepingTask implements Runnable {
    private int totalTime = 10;
    private int id;

    public SleepingTask(int id) {
        this.id = id;
    }

    public void run() {
        while (totalTime-- > 0) {
            System.out.println();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("interrupted");
            }
            System.out.println(status());
        }
    }

    public String status() {
        return "#" + id + "(" +
                (totalTime > 0 ? totalTime : "Liftoff!") + "),";
    }


    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask(i));
        }
        exec.shutdown();
    }
}
