package com.lnzz.linkedlist.single;

import com.lnzz.linkedlist.List;

/**
 * ClassName：SingleLinkedListTest
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/31 11:05
 * @Description:
 */
public class SingleLinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new SingleLinkedList<Integer>();
        list.add(20);
        list.add(0, 10);
        list.add(30);
        list.add(list.size(), 40);

        System.out.println(list);
    }
}
