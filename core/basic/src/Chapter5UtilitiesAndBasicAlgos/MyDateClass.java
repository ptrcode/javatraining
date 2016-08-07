package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by zubair on 7/8/16.
 */

import java.util.Date;

public class MyDateClass {

    public static void main(String a[]) {

        Date d = new Date();
        System.out.println("Todays Date is: " + d);
        System.out.println("Current Date: " + d.getDate());
        System.out.println("Current Day: " + d.getDay());
        System.out.println("Current Hours: " + d.getHours());
        System.out.println("Current Minutes: " + d.getMinutes());
        System.out.println("Current Seconds: " + d.getSeconds());
        System.out.println("Current Year: " + d.getYear());
    }
}
