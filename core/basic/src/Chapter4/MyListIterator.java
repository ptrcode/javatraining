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
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
    public static void main(String a[]) {
        List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        litr = li.listIterator();
        System.out.println("Elements in forward directiton");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward directiton");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
    /*Using ListIterator, we can iterate all elements of a list in either direction.
        You can access next element by calling next() method,
        and also you can access previous element by calling previous() method on the list.
*/