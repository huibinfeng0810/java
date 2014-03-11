package thread_01;

/**
 * Created by fenghb on 3/10/14.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff(i)).start();
            System.out.print("watting(" + i + ") for liftoff");
        }
    }
}
