package com.lnzz.array;

/**
 * ClassName：Person
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/30 15:15
 * @Description:
 */
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("Person - finalize");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return this.age == person.age;
        }
        return false;
    }
}
