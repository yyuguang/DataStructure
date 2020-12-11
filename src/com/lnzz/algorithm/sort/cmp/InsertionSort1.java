package com.lnzz.algorithm.sort.cmp;

import com.lnzz.algorithm.sort.Sort;

/**
 * ClassName: InsertionSort
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 14:54
 * @description 插入排序
 */
public class InsertionSort1<E extends Comparable<E>> extends Sort<E> {
    @Override
    protected void sort() {
        for (int begin = 0; begin < array.length; begin++) {
            int current = begin;
            while (current > 0 && cmp(current, current - 1) < 0) {
                swap(current, current - 1);
                current--;
            }
        }
    }
}
