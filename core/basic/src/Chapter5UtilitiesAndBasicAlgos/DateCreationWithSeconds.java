package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by zubair on 7/8/16.
 */

import java.util.Date;

public class DateCreationWithSeconds {

    public static void main(String a[]) {
        //get current time in milli seconds
        long currentTimeInSec = System.currentTimeMillis();
        Date d = new Date(currentTimeInSec);
        System.out.println(d);
    }
}
