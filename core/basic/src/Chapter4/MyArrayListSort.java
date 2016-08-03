<<<<<<< HEAD
package Chapter4;

/**
 * Created by zubair on 3/8/16.
=======
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
>>>>>>> origin/master
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayListSort {

    public static void main(String a[]) {

        List<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram", 3000));
        list.add(new Empl("John", 6000));
        list.add(new Empl("Crish", 2000));
        list.add(new Empl("Tom", 2400));
<<<<<<< HEAD
        Collections.sort(list, new MySalaryComp());
=======
        List<Tiger> tigerList = new ArrayList<Tiger>();
        tigerList.add(new Tiger(20, "tiger1", 50));
        tigerList.add(new Tiger(10, "tiger2", 50));
        tigerList.add(new Tiger(30, "tiger3", 50));
        Collections.sort(list, new MySalaryComp());
        Collections.sort(tigerList, new TigerComparator());
>>>>>>> origin/master
        System.out.println("Sorted list entries: ");
        for (Empl e : list) {
            System.out.println(e);
        }
<<<<<<< HEAD
=======
        for (Tiger t : tigerList) {
            System.out.println(t);
        }
>>>>>>> origin/master
    }
}

class MySalaryComp implements Comparator<Empl> {

    @Override
    public int compare(Empl e1, Empl e2) {
        if (e1.getSalary() < e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Empl {

    private String name;
    private int salary;

    public Empl(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + this.name + "-- Salary: " + this.salary;
    }
}
<<<<<<< HEAD
    /*This example gives you how to sort an ArrayList using Comparator. The ArrayList contains user defined objects.
        By using Collections.sort() method you can sort the ArrayList.
        You have to pass Comparator object which contains your sort logic.
        The example sorts the Empl objects based on highest salary. */
=======

class Tiger {
    private int age;
    private String name;
    private int weight;

    public Tiger(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class TigerComparator implements Comparator<Tiger> {
    @Override
    public int compare(Tiger tiger1, Tiger tiger2) {
        if (tiger1.getAge() < tiger2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
>>>>>>> origin/master
