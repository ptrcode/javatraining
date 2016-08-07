package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

    String key();

    String value();
}

public class MyAnnotationTest {

    public static void main(String a[]) {

        MyAnnotationTest mat = new MyAnnotationTest();
        mat.myAnnotationTestMethod();
    }

    @MyAnnotation(key = "site", value = "java2novice.com")
    public void myAnnotationTestMethod() {

        try {
            Class<? extends MyAnnotationTest> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
            System.out.println("key: " + myAnno.key());
            System.out.println("value: " + myAnno.value());
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
