package Chapter11Threading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by papu bhattacharya on 14/9/16.
 */
public class MyThreadYield {
    public static void main(String a[]) {
        List<ExmThread> list = new ArrayList<ExmThread>();
        for (int i = 0; i < 3; i++) {
            ExmThread et = new ExmThread(i + 5);
            list.add(et);
            et.start();
        }
        for (ExmThread et : list) {
            try {
                et.join();
            } catch (InterruptedException ex) {
            }
        }
    }
}

class ExmThread extends Thread {

    private int stopCount;

    public ExmThread(int count) {
        this.stopCount = count;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % stopCount == 0) {
                System.out.println("Stoping thread: " + getName());
                yield();
            }
        }
    }
}
