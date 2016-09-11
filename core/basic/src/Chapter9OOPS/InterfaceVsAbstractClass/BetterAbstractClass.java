package Chapter9OOPS.InterfaceVsAbstractClass;

interface Animal1 {
    public void walk();

    public void bark();
}

/**
 * Created by papu bhattacharya on 11/9/16.
 */
public class BetterAbstractClass {
    public static void main(String[] args) {
        Animal1 animal = new Dog1();
        animal.walk();
        animal.bark();
        animal = new Cat1();
        animal.walk();
        animal.bark();
    }
}

class Dog1 extends WalkikngAnimal {
    @Override
    public void bark() {
        System.out.println("he he");
    }
}

class Cat1 extends WalkikngAnimal {
    @Override
    public void bark() {
        System.out.println("memu");
    }
}

abstract class WalkikngAnimal implements Animal1 {
    @Override
    public void walk() {
        System.out.println("we walk");
    }

    abstract public void bark();
}