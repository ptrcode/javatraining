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

package Chapter3;

/**
 * Created by papu bhattacharya on 2/8/16.
 */
public class MyStaticMethods {

    private static String staticStr = "STATIC-STRING";
    private String name;

    public MyStaticMethods(String n) {
        this.name = n;
    }

    public static void testStaticMethod() {
        System.out.println("Hey... I am in static method...");
        //you can call static variables here
        System.out.println(MyStaticMethods.staticStr);
        //you can not call instance variables here.
    }

    public static void main(String a[]) {
        //By using class name, you can call static method
        //testStaticMethod();
        MyStaticMethods.testStaticMethod();
        MyStaticMethods msm = new MyStaticMethods("Java2novice");
        msm.testObjectMethod();
    }

    public void testObjectMethod() {
        System.out.println("Hey i am in non-static method");
        //you can also call static variables here
        System.out.println(MyStaticMethods.staticStr);
        //you can call instance variables here
        System.out.println("Name: " + this.name);
    }
}
