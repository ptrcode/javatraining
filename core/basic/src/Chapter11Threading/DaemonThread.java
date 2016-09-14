package Chapter11Threading;

/**
 * Created by papu bhattacharya on 14/9/16.
 */
public class DaemonThread extends Thread {

    public DaemonThread() {
        setDaemon(true);
    }

    public static void main(String a[]) {
        DaemonThread dt = new DaemonThread();
        // even you can set daemon constrain here also
        // it is like dt.setDeamon(true)
        dt.start();
    }

    public void run() {
        System.out.println("Is this thread Daemon? - " + isDaemon());
    }
}
