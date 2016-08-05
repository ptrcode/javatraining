package Chapter4Collections;

/**
 * Created by zubair on 4/8/16.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class MyReverseIterLinked {

    public static void main(String a[]) {

        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator<String> itr = arrl.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
   /* Above example shows how to iterate through LinkedList in reverse order.
    The method descendingIterator() returns an Iterator object with reverse order.
    By iterating through it, you can get the elements in the reverse order.*/