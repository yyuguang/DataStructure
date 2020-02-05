package com.lnzz.array;

/**
 * ClassName：ArrayListTest
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/30 12:25
 * @Description:
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person(10, "Kobe"));
        persons.add(new Person(20, "James"));
        persons.add(null);
        persons.add(new Person(30, "Wade"));

        System.out.println(persons);
    }
}
