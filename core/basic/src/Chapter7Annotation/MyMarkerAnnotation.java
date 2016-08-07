package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarkerAnnot {
}

public class MyMarkerAnnotation {
    public static void main(String a[]) {

        MyMarkerAnnotation mat = new MyMarkerAnnotation();
        mat.myAnnotationTestMethod();
    }

    @MyMarkerAnnot
    public void myAnnotationTestMethod() {

        try {
            Class<? extends MyMarkerAnnotation> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            if (mth.isAnnotationPresent(MyMarkerAnnot.class)) {
                System.out.println("Hey... marker annotation is present.");
            } else {
                System.out.println("Marker annotation is not present.");
            }
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
