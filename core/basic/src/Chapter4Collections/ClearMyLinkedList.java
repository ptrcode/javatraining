package Chapter4Collections;

/**
 * Created by zubair on 4/8/16.
 */

import java.util.LinkedList;

public class ClearMyLinkedList {

    public static void main(String a[]) {

        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:" + arrl);
        arrl.clear();
        System.out.println("After clear LinkedList:" + arrl);
    }
}
    /*Here we can see example for deleting all objects from LinkedList at one method call.
        We can do this by calling clear() method on LinkedList, it will delete all objects */