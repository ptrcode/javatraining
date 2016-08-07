package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by zubair on 7/8/16.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDifferenceExamples {
    public static void main(String[] args) {
        String startdate = "22/02/2016 12:30:00";
        String enddate = "24/02/2016 12:30:00";
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        try {
            Date startdateobj = sdformat.parse(startdate);
            Date enddateobj = sdformat.parse(enddate);
            System.out.println("time in mili seconds" + startdateobj.getTime());
            long timeDiff = enddateobj.getTime() - startdateobj.getTime();
            System.out.println(+timeDiff);

            long secondsDiff = (timeDiff / 1000);
            System.out.println("Time difference in seconds: " + secondsDiff);

            // time difference in minutes
            long minDiff = timeDiff / (1000 * 60);
            System.out.println("Time difference in minutes: " + minDiff);

            // time difference in minutes
            long hoursDiff = timeDiff / (1000 * 60 * 60);
            System.out.println("Time difference in hours: " + hoursDiff);

            // time difference in minutes
            long daysDiff = timeDiff / (1000 * 60 * 60 * 24);
            System.out.println("Time difference in days: " + daysDiff);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
