package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 6/8/16.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropUsingClassName {

    private static Properties prop;

    static {
        InputStream is = null;
        try {
            prop = new Properties();
            is = MyPropUsingClassName.class.getResourceAsStream("/sample.properties");
            prop.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyValue(String key) {
        return prop.getProperty(key);
    }

    public static void main(String a[]) {
    
        System.out.println("db.host: " + getPropertyValue("db.host"));
        System.out.println("db.User: " + getPropertyValue("db.user"));
        System.out.println("db.password: " + getPropertyValue("db.password"));
    }
}
    /*This example shows how to load a property file using class name in java.*/