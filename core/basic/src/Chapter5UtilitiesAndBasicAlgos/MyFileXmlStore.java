package Chapter5UtilitiesAndBasicAlgos;

/**
 * Created by papu bhattacharya on 6/8/16.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class MyFileXmlStore {

    public static void main(String a[]) throws IOException {

        OutputStream os = null;
        Properties prop = new Properties();
        prop.setProperty("name", "java2novice");
        prop.setProperty("domain", "www.java2novice.com");
        prop.setProperty("email", "java2novice@gmail.com");
        try {
            os = new FileOutputStream("MyProp.xml");
            prop.storeToXML(os, "Dynamic Property File");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

/*
This example shows how to get create properties file dynamically and store as xml file. You have to create Properties object, set all properties by using setProperty() method, store it to file system as xml file by using storeToXML() method.
*/
