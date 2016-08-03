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

package Chapter5;

/**
 * Created by papu bhattacharya on 3/8/16.
 */
/* Program: Linear Search Example
 * Written by: Chaitanya from beginnersbook.com
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers*/

import java.util.Scanner;

class LinearSearchExample {
    public static void main(String args[]) {
        int counter, num, item, array[];
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();
        //Creating array to store the all the numbers
        array = new int[num];
        System.out.println("Enter " + num + " integers");
        //Loop to store each numbers in array
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter the search value:");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++) {
            if (array[counter] == item) {
                System.out.println(item + " is present at location " + (counter + 1));
           /*Item is found so to stop the search and to come out of the
            * loop use break statement.*/
                break;
            }
        }
        if (counter == num)
            System.out.println(item + " doesn't exist in array.");
    }
}