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

package Chapter4Collections;

/**
 * Created by papu bhattacharya on 3/8/16.
 */

import java.util.Vector;

public class MyVectorClone {
    public static void main(String a[]) {
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:" + vct);
        Vector<String> copy = (Vector<String>) vct.clone();
        System.out.println("Cloned vector:" + copy);
    }
}
   /* Above example shows how to create exactly same object as available vector object.
        You can use clone() method to create similar copy of vector. */