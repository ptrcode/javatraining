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
import java.util.Vector;

public class MyElementCheck {

    public static void main(String a[]) {
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does vector contains all list elements?: " + vct.containsAll(list));
        list.add("one");
        System.out.println("Does vector contains all list elements?: " + vct.containsAll(list));
    }
}
    /*Above example shows how to find whether a vector contains list of objects or not.
        The method containsAll() helps us to find the match.
*/