package Chapter4;

/**
 * Created by zubair on 4/8/16.
 */

import java.util.LinkedList;

public class MyLinkedListClone {

    public static void main(String a[]) {

        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:" + arrl);
        LinkedList<String> copy = (LinkedList<String>) arrl.clone();
        System.out.println("Cloned LinkedList:" + copy);
    }
}
    /*Here we can see example for creating duplicate object of an LinkedList instance.
        we can done this by using clone() function. */