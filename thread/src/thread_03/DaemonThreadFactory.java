package thread_03;

import java.util.concurrent.ThreadFactory;

/**
 * Created by fenghb on 3/11/14.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread();
        t.setDaemon(true);
        return t;
    }
}
