package com.lnzz.set;

/**
 * ClassName：Set
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/13 9:37
 * @Description:
 */
public interface Set<E> {
    /**
     * size
     *
     * @return
     */
    int size();

    /**
     * isEmpty
     *
     * @return
     */
    boolean isEmpty();

    /**
     * clear
     */
    void clear();

    /**
     * contains
     *
     * @param element
     * @return
     */
    boolean contains(E element);

    /**
     * add
     *
     * @param element
     */
    void add(E element);

    /**
     * remove
     *
     * @param element
     */
    void remove(E element);

    /**
     * 遍历
     *
     * @param visitor
     */
    void traversal(Visitor<E> visitor);

    public static abstract class Visitor<E> {
        boolean stop;

        public abstract boolean visit(E element);
    }
}
