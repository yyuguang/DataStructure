package com.lnzz.algorithm.sort.cmp;

import com.lnzz.algorithm.sort.Sort;

/**
 * ClassName: InsertionSort3
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 15:32
 * @description TODO
 */
public class InsertionSort3<E extends Comparable<E>> extends Sort<E> {
    @Override
    protected void sort() {
      /*  for (int begin = 1; begin < array.length; begin++) {
            E v = array[begin];
            int insertIndex = search(begin);
            for (int i = begin; i > insertIndex; i--) {
                array[i] = array[i - 1];
            }
            array[insertIndex] = v;
        }*/
        for (int begin = 1; begin < array.length; begin++) {
            insert(begin, search((begin)));
        }
    }

    /**
     * 将source位置的元素插入到dest位置
     *
     * @param source
     * @param dest
     */
    private void insert(int source, int dest) {
        E v = array[source];
        for (int i = source; i > dest; i--) {
            array[i] = array[i - 1];
        }
        array[dest] = v;
    }

    /**
     * 利用二分搜索找到index位置元素的待插入位置
     *
     * @param index
     * @return
     */
    private int search(int index) {
        int begin = 0;
        int end = index;
        while (begin < end) {
            int middle = (begin + end) >> 1;
            if (cmp(array[index], array[middle]) < 0) {
                end = middle;
            } else {
                begin = middle + 1;
            }
        }
        return begin;
    }
}
