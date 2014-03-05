package thread_01;

/**
 * Created by fenghb on 3/4/14.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("waiting for liftoff!");
    }
}
