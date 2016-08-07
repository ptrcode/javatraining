package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by zubair on 7/8/16.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormatter {
    public static void main(String a[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd G 'at' HH:mm:ss z");
        System.out.println("yyyy.mm.dd G at HH:mm:ss z --->" + sdf.format(new Date()));
        sdf = new SimpleDateFormat("hh 'o' 'clock' a, zzzz");
        System.out.println("hh 'o''clock' a, zzzz --->" + sdf.format(new Date()));
    }
}
