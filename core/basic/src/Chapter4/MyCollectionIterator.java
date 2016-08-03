/*
 *
 *  * See the NOTICE file distributed with this work for additional
 *  * information regarding copyright ownership.
 *  *
 *  * This is free software; you can redistribute it and/or modify it
 *  * under the terms of the GNU Lesser General Public License as
 *  * published by the Free Software Foundation; either version 2.1 of
 *  * the License, or (at your option) any later version.
 *  *
 *  * This software is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  * Lesser General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU Lesser General Public
 *  * License along with this software; if not, write to the Free
 *  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 *
 *
 */

package Chapter4;

/**
 * Created by papu bhattacharya on 3/8/16.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollectionIterator {

    public static void main(String a[]) {

        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
/*
    You can iterate through any collection object by using Iterator object. It provides two methods to iterate.
        The hasNext() method returns true if the iteration has more elements.
        The next() method returns the next element in the iteration.
        Below example shows how to iterate through an ArrayList.*/
