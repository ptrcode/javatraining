package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */
public class MySupressExmp {
    @SuppressWarnings("deprecation")
    public static void main(String a[]) {

        MyDeprecatedExmp mde = new MyDeprecatedExmp();
        mde.showDeprecatedMessage();
    }

    @Deprecated
    public void showDeprecatedMessage() {
        System.out.println("This method is marked as deprecated");
    }
}
/*
Incase if you don't want to get any warnings from compiler for the known things, then you can use @SuppressWarnings annotation. For example, you are calling deprecated method, and you know that it is deprecated, to avoid compiler warnings, user @SuppressWarnings annotation.
*/
