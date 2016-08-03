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

import java.util.Vector;

public class BasicVectorOperations {

    public static void main(String a[]) {
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        System.out.println(vct);
        //adding element at specified index
        vct.add(2, "Random");
        System.out.println(vct);
        //getting elements by index
        System.out.println("Element at index 3 is: " + vct.get(3));
        //getting first element
        System.out.println("The first element of this vector is: " + vct.firstElement());
        //getting last element
        System.out.println("The last element of this vector is: " + vct.lastElement());
        //how to check vector is empty or not
        System.out.println("Is this vector empty? " + vct.isEmpty());
    }
}
    /*Above example shows how to create vector object, adding elements to it, getting elements by specifying index, getting elements index,
        getting first element, getting last element, and is vector is empty or not.0*/