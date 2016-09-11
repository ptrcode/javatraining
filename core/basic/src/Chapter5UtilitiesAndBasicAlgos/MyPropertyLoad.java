package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 5/8/16.
 */

import java.io.*;
import java.util.Properties;

public class MyPropertyLoad {

    public static void main(String a[]) {

        InputStream is = null;
        Properties prop = null;
        try {
            prop = new Properties();
            is = new FileInputStream(new File("src/Chapter5UtilitiesAndBasicAlgos/data/sample.properties"));
            prop.load(is);
            System.out.println("db.host: " + prop.getProperty("db.host"));
            System.out.println("db.User: " + prop.getProperty("db.user"));
            System.out.println("db.password: " + prop.getProperty("db.password"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    /*This example shows how to load properties file from a local file system. Here we are using FileInputStream to load the properties file. Here you have to pass the physical location of the file in the file system.
*/