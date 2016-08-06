package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 6/8/16.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class MyPropAllKeys {

    private Properties prop = null;

    public MyPropAllKeys() {

        InputStream is = null;
        try {
            this.prop = new Properties();
            is = this.getClass().getResourceAsStream("/sample.properties");
            prop.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String a[]) {

        MyPropAllKeys mpc = new MyPropAllKeys();
        Set<Object> keys = mpc.getAllKeys();
        for (Object k : keys) {
            String key = (String) k;
            System.out.println(key + ": " + mpc.getPropertyValue(key));
        }
    }

    public Set<Object> getAllKeys() {
        Set<Object> keys = prop.keySet();
        return keys;
    }

    public String getPropertyValue(String key) {
        return this.prop.getProperty(key);
    }
}
