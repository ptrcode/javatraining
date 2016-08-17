package Chapter9OOPS.Interfaces;

/**
 * Created by papu bhattacharya on 12/8/16.
 */
interface Flyable {
    void fly();
}

class Aeroplane implements Flyable {
    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class InterfaceExamples {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
    }
}
