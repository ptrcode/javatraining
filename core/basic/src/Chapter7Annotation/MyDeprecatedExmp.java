package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */
public class MyDeprecatedExmp {

    public static void main(String a[]) {

        MyDeprecatedExmp mde = new MyDeprecatedExmp();
        mde.showDeprecatedMessage();
    }

    /**
     * @deprecated reason for why it was deprecated
     */
    @Deprecated
    public void showDeprecatedMessage() {
        System.out.println("This method is marked as deprecated");
    }
}
/*
    The @Deprecated annotation will be used to inform the compiler to generate a warning whenever a program uses a method, class, or field with the @Deprecated annotation. It is good to document the reason with Javadoc @deprecated tag. Make a note of case difference with @Deprecated and @deprecated. @deprecated is for documentation purpose.*/
