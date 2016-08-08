package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by zubair on 7/8/16.
 */

import java.util.Date;

public class MyAfterDateTest {
    public static void main(String[] args) {
        Date now = new Date();
        long nextday = System.currentTimeMillis() + 1000 * 60 * 60 * 24;
        Date next = new Date(nextday);
        if (next.after(now)) {
            System.out.println("the date is future day");
        } else {
            System.out.println("the date is older than current day");
        }
    }
}
