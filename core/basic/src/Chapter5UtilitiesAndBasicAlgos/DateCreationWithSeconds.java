package Chapter5UtilitiesAndBasicAlgos;

/**
<<<<<<< HEAD
 * Created by zubair on 7/8/16.
=======
 * Created by papu bhattacharya on 6/8/16.
>>>>>>> origin/master
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
