package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotn {

    String value();
}

public class MySingleMembAnnotation {

    public static void main(String a[]) {

        MySingleMembAnnotation mat = new MySingleMembAnnotation();
        mat.myAnnotationTestMethod();
    }

    @MyAnnotn("java2novice.com")
    public void myAnnotationTestMethod() {

        try {
            Class<? extends MySingleMembAnnotation> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            MyAnnotn myAnno = mth.getAnnotation(MyAnnotn.class);
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
    /*Single member contatins only one member, and it is also kind of normal annotation.
        The only difference we can make is the value assignment.
        We can assign the value without specifing the member name as shown in the below example. This only works when we declare name of the member as value.
    */