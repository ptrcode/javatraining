package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnot {

    String key() default "site";

    String value() default "java2novice.com";
}

public class MyAnnotDefaultValues {

    public static void main(String a[]) {

        MyAnnotDefaultValues mat = new MyAnnotDefaultValues();
        mat.myAnnotationTestMethod();
    }

    @MyAnnot()
    public void myAnnotationTestMethod() {

        try {
            Class<? extends MyAnnotDefaultValues> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            MyAnnot myAnno = mth.getAnnotation(MyAnnot.class);
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
/*
    The @Deprecated annotation will be used to inform the compiler to generate a warning whenever a program uses a method, class, or field with the @Deprecated annotation. It is good to document the reason with Javadoc @deprecated tag. Make a note of case difference with @Deprecated and @deprecated. @deprecated is for documentation purpose.*/
