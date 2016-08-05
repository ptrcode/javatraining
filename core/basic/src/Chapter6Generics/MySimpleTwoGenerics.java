package Chapter6Generics;

/**
 * Created by papu bhattacharya on 4/8/16.
 */
public class MySimpleTwoGenerics {
    public static void main(String[] args) {
        SimpleGen<String, Integer> object = new SimpleGen<String, Integer>("JAVA2NOVICE", 100);
        object.printTypes();
    }
}

/**
 * Simple generics class with two type parameters U, V.
 */
class SimpleGen<U, V> {
    private U objUref;
    private V objVref;

    public SimpleGen(U objUref, V objVref) {
        this.objUref = objUref;
        this.objVref = objVref;
    }

    public void printTypes() {
        System.out.println("U Type: " + this.objUref.getClass().getName());
        System.out.println("V Type: " + this.objVref.getClass().getName());
    }
}