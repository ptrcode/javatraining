package Chapter4;

/**
 * Created by zubair on 4/8/16.
 */

import java.util.LinkedList;

public class MyAddFirstLinked {

    public static void main(String a[]) {

        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        System.out.println("Adding element at first position...");
        arrl.addFirst("I am first");
        System.out.println(arrl);
        System.out.println("Adding element at first position...");
        arrl.offerFirst("I am first - 2");
        System.out.println(arrl);
    }
}
/*
    Above example shows how to add element at first position in LinkedList.
    LinkedList provides few methods to add element at first position, those methods are:
    addFirst(): Inserts the specified element at the beginning of this list.
    offerFirst(): Inserts the specified element at the front of this list. */
