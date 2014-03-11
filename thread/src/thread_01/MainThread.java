package thread_01;

/**
 * Created by fenghb on 3/4/14.
 */
public class MainThread {


    public static void main(String[] args) {
        /**
         * When a class is derived from Runnable, it must have a run( ) method, but that’s nothing
         * special—it doesn’t produce any innate threading abilities. To achieve threading behavior, you
         * must explicitly attach a task to a thread.
         */

        LiftOff launch = new LiftOff();
        launch.run();
    }
}
