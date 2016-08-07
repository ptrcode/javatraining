package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */
public @interface MySampleAnn {

    String name();

    String desc();
}

class MyAnnTest {

    @MySampleAnn(name = "test1", desc = "testing annotations")
    public void myTestMethod() {
        //method implementation
    }
}

/*
    Annotations are created by using @ sign, folled by the keyword interface, and followed by annotation name as shown in the below example.
        Members can be decleared as shown in the example, it looks like methods. The example defines two members called name and desc. We should not provide implementation for these members.
        All annotations extends java.lang.annotation.Annotation interface. Annotations cannot include any extends caluse.
        Below example shows how to use this annotation to method.
*/
