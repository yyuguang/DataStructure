package com.lnzz.linkedlist;

/**
 * ClassName：AbstractList
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/31 11:08
 * @Description:
 */
public abstract class AbstractList<E> implements List<E> {

    protected int size;


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    public void add(E element) {
        add(size, element);
    }

    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ",Size" + size);
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }
}
