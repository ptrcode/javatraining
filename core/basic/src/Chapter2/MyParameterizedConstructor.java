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

package Chapter2;

/**
 * Created by papu bhattacharya on 2/8/16.
 */
public class MyParameterizedConstructor {

    private String name;

    public MyParameterizedConstructor(String str) {
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: " + str);
    }

    public static void main(String a[]) {
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("Madhu Raj");
        MyParameterizedConstructor mpc1 = new MyParameterizedConstructor("zubair");

    }
}

//    Parameterized constructors are required to pass parameters on creation of objects.
//        If we define only parameterized constructors, then we cannot create an object with default constructor. This is because compiler will not create default constructor. You need to create default constructor explicitly.
//        - See more at: http://www.java2novice.com/java_constructor_examples/constructor_with_parameters/#sthash.DeEm46xB.dpuf
