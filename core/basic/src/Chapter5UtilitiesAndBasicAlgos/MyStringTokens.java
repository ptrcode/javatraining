package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 5/8/16.
 */

import java.util.StringTokenizer;

public class MyStringTokens {
    public static void main(String a[]) {
        String msg = "http://10.123.43.67:80/";
        StringTokenizer st = new StringTokenizer(msg, "://.");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
    /*Below example shows how to break a string based on multiple delimiters. Each character in the constructors delimiter field acts as one delimiter. */