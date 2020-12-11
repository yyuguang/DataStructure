package com.lnzz.algorithm.sort;

/**
 * ClassName: BinarySearch
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 15:50
 * @description TODO
 */
public class BinarySearch {
    /**
     * 查找 v 在有序数组 array 中的位置
     *
     * @param array
     * @param v
     * @return
     */
    public static int indexOf(int[] array, int v) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int begin = 0;
        int end = array.length;
        while (begin < end) {
            int middle = (begin + end) >> 1;
            if (v < array[middle]) {
                end = middle;
            } else if (v > array[middle]) {
                begin = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 查找 v 在有序数组 array 中的待插入位置
     *
     * @param array
     * @param v
     * @return
     */
    public static int search(int[] array, int v) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int begin = 0;
        int end = array.length;
        while (begin < end) {
            int middle = (begin + end) >> 1;
            if (v < array[middle]) {
                end = middle;
            }else {
                begin = middle + 1;
            }
        }
        return begin;
    }
}
