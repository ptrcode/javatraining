package Chapter4;

/**
 * Created by zubair on 4/8/16.
 */

import java.util.LinkedList;

public class MyLinkedListArray {

    public static void main(String a[]) {

        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:" + arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
    /*Here we can see example for copying all content of LinkedList to an array.
    You can get this done by calling toArray() method.*/