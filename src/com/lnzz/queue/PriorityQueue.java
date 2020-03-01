package com.lnzz.queue;

import com.lnzz.heap.BinaryHeap;
import com.lnzz.linkedlist.List;
import com.lnzz.linkedlist.doubly.DoubleLinkedList;

import java.util.Comparator;

/**
 * ClassName：PriorityQueue
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/1 11:28
 * @Description: 优先级队列
 */
public class PriorityQueue<E> {
    private BinaryHeap<E> heap;

    public PriorityQueue(Comparator<E> comparator) {
        heap = new BinaryHeap<>(comparator);
    }

    public PriorityQueue() {
        this(null);
    }


    public int size() {
        return heap.size();
    }

    public void clear() {
        heap.clear();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    /**
     * 入队
     *
     * @param element
     */
    public void enQueue(E element) {
        heap.add(element);
    }

    /**
     * 出队
     *
     * @return
     */
    public E deQueue() {
        return heap.remove();
    }

    public E front() {
        return heap.get();
    }
}

