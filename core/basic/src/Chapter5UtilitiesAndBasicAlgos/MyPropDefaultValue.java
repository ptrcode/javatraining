package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 6/8/16.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropDefaultValue {

    private Properties prop = null;

    public MyPropDefaultValue() {

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

        MyPropDefaultValue mpc = new MyPropDefaultValue();
        System.out.println("db.host: " + mpc.getPropertyValue("db.tables"));
        System.out.println("db.User: " + mpc.getPropertyValue("db.user"));
    }

    public String getPropertyValue(String key) {
        return this.prop.getProperty(key, "Its Default Value");
    }
}
    /*The Properties class also provide a method, incase if the key is not available in the properties file, then you can specify the default value. Below example give sample code for this. -*/