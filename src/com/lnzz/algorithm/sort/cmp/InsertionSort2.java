package com.lnzz.algorithm.sort.cmp;

import com.lnzz.algorithm.sort.Sort;

/**
 * ClassName: InsertionSort2
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 15:32
 * @description TODO
 */
public class InsertionSort2<E extends Comparable<E>> extends Sort<E> {
    @Override
    protected void sort() {
        for (int begin = 0; begin < array.length; begin++) {
            int current = begin;
            E v = array[current];
            while (current > 0 && cmp(v, array[current - 1]) < 0) {
                array[current] = array[current - 1];
                current--;
            }
            array[current] = v;
        }
    }
}
