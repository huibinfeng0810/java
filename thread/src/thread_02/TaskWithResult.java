package thread_02;

import java.util.concurrent.Callable;

/**
 * Created by fenghb on 3/10/14.
 */
public class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }


    @Override
    public String call() {
        return "result of TaskWithResult " + id;
    }
}
