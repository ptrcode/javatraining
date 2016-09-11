package Chapter9OOPS.InterfaceVsAbstractClass;

interface Flyer {
    public void fly();
}

/**
 * Created by papu bhattacharya on 11/9/16.
 */
public class PureInterfaceExample {
    public static void main(String[] args) {
        Flyer flyer = new AeroPlane();
        flyer.fly();
        flyer = new Bird();
        flyer.fly();
    }
}

class AeroPlane implements Flyer {
    @Override
    public void fly() {
        System.out.println("fluing aeroplane");
    }
}

class Bird implements Flyer {
    @Override
    public void fly() {
        System.out.println("flying bird");
    }
}