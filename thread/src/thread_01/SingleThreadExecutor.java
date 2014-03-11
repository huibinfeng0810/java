package thread_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by fenghb on 3/10/14.
 */
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff(i));
        }
        exec.shutdown();
    }
}
