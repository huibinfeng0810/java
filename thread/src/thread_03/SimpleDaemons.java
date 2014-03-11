package thread_03;

import java.util.concurrent.TimeUnit;

/**
 * Created by fenghb on 3/11/14.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemo = new Thread(new SimpleDaemons());
            daemo.setDaemon(true);
            daemo.start();
        }

        System.out.println("all daemons stared");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
