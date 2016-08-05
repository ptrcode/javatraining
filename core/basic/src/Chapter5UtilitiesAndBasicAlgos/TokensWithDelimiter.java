package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 5/8/16.
 */

import java.util.StringTokenizer;

public class TokensWithDelimiter {
    public static void main(String a[]) {
        String msg = "http://10.123.43.67:80/";
        StringTokenizer st = new StringTokenizer(msg, "://.", true);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
    /*example shows how to make delimiter characters also be part of tokens. During creating string tokenizer object, in the constructor field, pass boolean parameter value as true.*/