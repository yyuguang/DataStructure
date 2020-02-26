package com.lnzz.heap;

/**
 * ClassName：Heap
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/26 10:12
 * @Description:
 */
public interface Heap<E> {
    /**
     * 元素的数量
     *
     * @return
     */
    int size();

    /**
     * 是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 清空
     */
    void clear();

    /**
     * 添加
     *
     * @param element
     */
    void add(E element);

    /**
     * 获得堆顶元素
     *
     * @return
     */
    E get();

    /**
     * 删除堆顶元素
     *
     * @return
     */
    E remove();

    /**
     * 删除堆顶元素，同时插入一个新元素
     *
     * @param element
     * @return
     */
    E replace(E element);
}
