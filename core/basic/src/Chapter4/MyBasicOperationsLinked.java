package Chapter4;

/**
 * Created by zubair on 4/8/16.
 */


import java.util.LinkedList;

public class MyBasicOperationsLinked {

    public static void main(String a[]) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size of the linked list: " + ll.size());
        System.out.println("Is LinkedList empty? " + ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
    }
}
/*
Here we can see example for basic operations like creating object for LinkedList, adding objects into LinkedList,
        searching an object in LinkedLis whether it is listed under this LinkedList instance or not,
        checking whether the LinkedList is empty or not, and finally size of the LinkedList.
*/
