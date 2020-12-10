package com.lnzz.algorithm.sort.cmp;

import com.lnzz.algorithm.sort.Sort;

/**
 * ClassName: BubbleSort2
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/9 16:39
 * @description TODO
 */
public class BubbleSort2<E extends Comparable<E>> extends Sort<E> {
    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            boolean sorted = true;
            for (int begin = 1; begin <= end; begin++) {
//                if (array[begin] < array[begin - 1]) {
                if (cmp(begin, begin - 1) < 0) {
                    swap(begin, begin - 1);
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }
    }
}
