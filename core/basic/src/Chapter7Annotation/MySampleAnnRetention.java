package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */

/*
A retention policy determines at what point annotation should be discarded.
        Java defined 3 types of retention policies through java.lang.annotation.RetentionPolicy enumeration. It has SOURCE, CLASS and RUNTIME.
        Annotation with retention policy SOURCE will be retained only with source code, and discarded during compile time.
        Annotation with retention policy CLASS will be retained till compiling the code, and discarded during runtime.
        Annotation with retention policy RUNTIME will be available to the JVM through runtime.
        The retention policy will be specified by using java built-in annotation @Retention, and we have to pass the retention policy type.
        The default retention policy type is CLASS.
*/

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySampleAnnRetention {

    String name();

    String desc();
}

class MyAnnTestRetention {

    @MySampleAnnRetention(name = "test1", desc = "testing annotations")
    public void myTestMethod() {
        //method implementation
    }
}
