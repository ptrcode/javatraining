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
public class MyOverloading {

    public MyOverloading() {
        System.out.println("Inside default constructor");
    }

    public MyOverloading(int i) {
        System.out.println("Inside single parameter constructor with int value");
    }

    public MyOverloading(String str) {
        System.out.println("Inside single parameter constructor with String object");
    }

    public MyOverloading(int i, int j) {
        System.out.println("Inside double parameter constructor");
    }

    public static void main(String a[]) {
        MyOverloading mco = new MyOverloading();
        MyOverloading spmco = new MyOverloading(10);
        MyOverloading dpmco = new MyOverloading(10, 20);
        MyOverloading lpmco = new MyOverloading("java2novice");
    }
}

//    Like method overloading we can overload constructors also. Along with default constructor, we can have constructors with parameters. The no of parameters can be same, and it can have different datatypes. Below example gives sample code for constructors overloading. - See more at: http://www.java2novice.com/java_constructor_examples/constructor_overloading/#sthash.bKV1wnef.dpuf