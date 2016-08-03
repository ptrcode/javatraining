package Chapter4;

/**
 * Created by zubair on 3/8/16.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    public static void main(String a[]) {
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator<String> itr = arrl.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
    /*Here we can see example for reading all elements from ArrayList by using Iterator.
        Also you can iterate through the ArrayList based on index too.
*/