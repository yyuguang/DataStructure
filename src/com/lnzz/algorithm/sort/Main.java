package com.lnzz.algorithm.sort;

import com.lnzz.util.Asserts;
import com.lnzz.util.Integers;
import com.lnzz.util.TimeTool;

import java.util.Arrays;

/**
 * ClassName: Main
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 9:35
 * @description TODO
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = Integers.random(10000, 1, 20000);
        testSorts(array, new BubbleSort1(), new BubbleSort2(), new HeapSort(), new SelectionSort(), new BubbleSort3());
    }

    static void testSorts(Integer[] array, Sort... sorts) {
        for (Sort sort : sorts) {
            sort.sort(Integers.copy(array));
        }

        Arrays.sort(sorts);

        for (Sort sort : sorts) {
            System.out.println(sort);
        }
    }
}
