package Chapter9OOPS.InterfaceVsAbstractClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by papu bhattacharya on 11/9/16.
 */
public class AbstractClassUse {
    static List animals = new ArrayList();

    public static void main(String[] args) {
        new AbstractClassUse().populate();
        for (Object animal : animals) {
            Animal myanimal = (Animal) animal;
            myanimal.bark();
        }
    }

    public void populate() {
        //read any property file having all animal lists
        try (BufferedReader br = new BufferedReader(new FileReader("/opt//data//javatraining//core//basic//src//Chapter9OOPS//InterfaceVsAbstractClass//animal.list"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                StringTokenizer tokens = new StringTokenizer(line, ":");
                String objectName = (String) tokens.nextElement();
                String fieldName = (String) tokens.nextElement();
                Object object = createObject(objectName, fieldName);
                if ((object != null) && (object instanceof Animal)) {
                    animals.add(object);
                }
            }
        } catch (IOException e) {

        }
    }

    public Object createObject(String objectName, String fieldName) {

        Class<?> clazz = null;
        try {
            clazz = Class.forName(objectName);
            try {
                Constructor<?> ctor = clazz.getConstructor(String.class);
                try {
                    Object object = ctor.newInstance(fieldName);
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

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void bark();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("hou hou");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("meu meu");
    }
}