package Chapter7Annotation;

/**
 * Created by papu bhattacharya on 7/8/16.
 */
public class Animal {

    public void makeSound() {

    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("myyyyyaaawwwwww");
    }
}
  /*  When we use @Override annotation to a method, it let compiler know that we are overriding it from super class. It is not mandatory to use @Override when you override a method. Incase you are using @Override annotation, and the method signature is not found at super class will results compilation error.
*/