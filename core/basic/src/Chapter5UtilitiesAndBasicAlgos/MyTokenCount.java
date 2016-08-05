package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 5/8/16.
 */

import java.util.StringTokenizer;

public class MyTokenCount {
    public static void main(String a[]) {
        String msg = "This program gives sample code for String Tokenizer";
        StringTokenizer st = new StringTokenizer(msg, " ");
        System.out.println("Count: " + st.countTokens());
    }
}
    /*example shows no of token count after breaking the string by delimiter. You can get the count by using countTokens() method. */