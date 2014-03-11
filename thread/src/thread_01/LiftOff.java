package thread_01;

/**
 * Created by fenghb on 3/4/14.
 */
public class LiftOff implements Runnable {
    private int countDown = 10;
    private int id;

    public LiftOff() {

    }

    public LiftOff(int id) {
        this.id = id;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
