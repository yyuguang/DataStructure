package com.lnzz.queue;

import com.lnzz.linkedlist.List;
import com.lnzz.linkedlist.doubly.DoubleLinkedList;

/**
 * ClassName：Queue
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/3 10:49
 * @Description:
 */
public class Queue<E> {

    private List<E> list = new DoubleLinkedList<E>();

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * 入队
     *
     * @param element
     */
    public void enQueue(E element) {
        list.add(element);
    }

    /**
     * 出队
     *
     * @return
     */
    public E deQueue() {
        return list.remove(0);
    }

    public E front() {
        return list.get(0);
    }
}
