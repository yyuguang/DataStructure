package com.lnzz.array;

/**
 * ClassName：ArrayList
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/30 11:28
 * @Description: 动态数组实现
 */
public class ArrayList<E> {

    private int size;

    private E[] elements;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;

    public ArrayList(int capacity) {
        capacity = Math.max(capacity, DEFAULT_CAPACITY);
        elements = (E[]) new Object[capacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 清除所有数组
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;

        //动态数组缩容操作，trim()
//        if (elements != null && elements.length > DEFAULT_CAPACITY) {
//            elements = (E[]) new Object[DEFAULT_CAPACITY];
//        }
    }

    /**
     * 数组长度
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含某个元素
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }


    /**
     * 获取index元素的位置
     *
     * @param index
     * @return
     */
    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    /**
     * 设置index位置的元素
     *
     * @param index
     * @param element
     * @return
     */
    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * 添加元素到尾部
     *
     * @param element
     */
    public void add(E element) {
        add(size, element);
    }

    /**
     * 添加元素到某个位置
     *
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        ensureCapacity(size + 1);

        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    /**
     * 删除index位置的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        rangeCheck(index);

        E old = elements[index];
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
//        trim();
        return old;
    }

    /**
     * 缩容操作
     */
    private void trim() {

        int capacity = elements.length;
        int newCapacity = capacity >> 1;
        //数据大于一半或者小于默认空间容量
        if (size >= newCapacity || capacity <= DEFAULT_CAPACITY) {
            return;
        }
        //剩余空间还很多
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;

    }

    /**
     * 查看元素的索引
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * 保证容量
     *
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity)
            return;
        //新容量为旧容量的1.5倍，建议位运算，不建议 *1.5，浮点计算性能低
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
        System.out.println(oldCapacity + "扩容为：" + newCapacity);
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ",Size" + size);
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size=").append(size).append(", [");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elements[i]);
            if (i != size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
