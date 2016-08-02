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

package Chapter1;

/**
 * Created by papu bhattacharya on 2/8/16.
 */
class WelcomeMessage {
    void printMessage() {
        System.out.println("Hello World");
    }
}

class Myclass {
    public static void main(String[] args) {
        WelcomeMessage obj = new WelcomeMessage();
        obj.printMessage();
    }
}
//a) Line 1. The package FirstCode creates a folder to store the class files generated after compilation
//        b) Line2. It imports the class library java.lang and its subsequent classes
//        c) Line 3. Initiates a class with the name WelcomeMessage
//        d) Line 5. Declares a method with name printMessage
//        e) Line 7. Defines the actual working code of the method
//        f) Line 10. Initiates the class having the main method; it should bear the name of the file : Myclass.java
//        g) Line 12. Declares the main method
//        h) Line 14. Initiates the creation of the object
//        i) Line 15. Calls the method printMessage () with the help of the object
//        j) The above code is saved and compiled to run on JVM