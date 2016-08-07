package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by zubair on 7/8/16.
 */

import java.util.Date;

public class MyBeforeDateTest {

    public static void main(String a[]) {

        Date current = new Date();
        //create a date one day before current date
        long prevDay = System.currentTimeMillis() - 1000 * 60 * 60 * 24;
        //create date object
        Date prev = new Date(prevDay);
        //compare both dates
        if (prev.before(current)) {
            System.out.println("The date is older than current day");
        } else {
            System.out.println("The date is future day");
        }
    }
}
