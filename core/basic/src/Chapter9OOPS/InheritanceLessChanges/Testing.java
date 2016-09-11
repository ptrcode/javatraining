package Chapter9OOPS.InheritanceLessChanges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by papu bhattacharya on 11/9/16.
 */
public class Testing {
    static List animals = new ArrayList();

    public static void main(String[] args) {
        new Testing().populate();
        for (Object animal : animals) {
            Animal myanimal = (Animal) animal;
            myanimal.bark();
        }
    }

    public void populate() {
        //read any property file having all animal lists
        try (BufferedReader br = new BufferedReader(new FileReader("/opt//data//javatraining//core//basic//animal.list"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                Object object = createObject(line);
                if ((object != null) && (object instanceof Animal)) {
                    animals.add(object);
                }
            }
        } catch (IOException e) {

        }
    }

    public Object createObject(String objectName) {

        Class<?> clazz = null;
        try {
            clazz = Class.forName(objectName);
            try {
                Constructor<?> ctor = clazz.getConstructor();
                try {
                    Object object = ctor.newInstance();
                    return object;
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (InvocationTargetException e1) {
                    e1.printStackTrace();
                }
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            }
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}

class Animal {
    public Animal() {
    }

    public void bark() {
        System.out.println("animal");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public void bark() {
        System.out.println("bow bow");
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public void bark() {
        System.out.println("mu mu");
    }
}

class Tiger extends Animal {
    public Tiger() {
    }

    public void bark() {
        System.out.println("halum");
    }
}

class Camel extends Animal {
    public Camel() {
    }

    public void bark() {
        System.out.println("OOOHH");
    }

}
