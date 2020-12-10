package com.lnzz.algorithm.sort.cmp;

import com.lnzz.algorithm.sort.Sort;

/**
 * ClassName: BubbleSort3
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/9 16:39
 * @description TODO
 */
public class BubbleSort3<E extends Comparable<E>> extends Sort<E> {
    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            //sortedIndex得初始值在数组完全有序时有用
            int sortedIndex = 1;
            for (int begin = 1; begin <= end; begin++) {
//                if (array[begin] < array[begin - 1]) {
                if (cmp(begin, begin - 1) < 0) {
                    swap(begin, begin - 1);
                    sortedIndex = begin;
                }
            }

            end = sortedIndex;
        }
    }
}
