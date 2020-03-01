package com.lnzz.queue.model;

/**
 * ClassName：Person
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/1 11:34
 * @Description:
 */
public class Person implements Comparable<Person> {

    private String name;

    private int boneBreak;

    public Person(String name, int boneBreak) {
        this.name = name;
        this.boneBreak = boneBreak;
    }

    @Override
    public int compareTo(Person person) {
        return this.boneBreak - person.boneBreak;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", boneBreak=" + boneBreak + "]";
    }
}
