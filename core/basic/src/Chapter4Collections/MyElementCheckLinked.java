package Chapter4Collections;

/**
 * Created by zubair on 4/8/16.
 */

import java.util.LinkedList;
import java.util.List;

public class MyElementCheckLinked {

    public static void main(String a[]) {

        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        List<String> list = new LinkedList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does LinkedList contains all list elements?: "
                + arrl.containsAll(list));
        list.add("one");
        System.out.println("Does LinkedList contains all list elements?: "
                + arrl.containsAll(list));
    }
}
/*
    Here we can see example for finding whether the instance of an LinkedList contains
    all objects of another Collection instance.
    Here we are checking with another List instance.*/