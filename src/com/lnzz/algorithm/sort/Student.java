package com.lnzz.algorithm.sort;

/**
 * ClassName: Student
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 10:46
 * @description TODO
 */
public class Student implements Comparable<Student> {
    public int score;
    public int age;

    public Student(int score, int age) {
        this.score = score;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return age - o.age;
    }
}