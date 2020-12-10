package com.lnzz.algorithm.sort.cmp;

import com.lnzz.algorithm.sort.Sort;
import com.lnzz.util.Integers;
import com.lnzz.util.TimeTool;

/**
 * ClassName: SelectionSort
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/9 15:36
 * @description 选择排序
 */
public class SelectionSort<E extends Comparable<E>> extends Sort<E> {
    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int begin = 1; begin <= end; begin++) {
//                if (array[maxIndex] <= array[begin]) {
                if (cmp(maxIndex, begin) <= 0) {
                    maxIndex = begin;
                }
            }
            swap(maxIndex, end);
        }
    }
}
