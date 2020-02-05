package com.lnzz.stack;


import com.lnzz.linkedlist.ArrayList;
import com.lnzz.linkedlist.List;

/**
 * ClassName：Stack
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/2 11:37
 * @Description: 栈的实现
 */
public class Stack<E> {

    private List<E> list = new ArrayList<E>();

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public E top() {
        return list.get(list.size() - 1);
    }
}
