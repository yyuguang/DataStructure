package com.lnzz.algorithm.sort;

import com.lnzz.algorithm.sort.cmp.*;
import com.lnzz.util.Asserts;
import com.lnzz.util.Integers;

import java.util.Arrays;

/**
 * ClassName: Main
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/10 9:35
 * @description TODO
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Main {
    public static void main(String[] args) {
        Integer[] array = Integers.random(10000, 1, 20000);
        testSorts(array,
                new BubbleSort1(),
                new BubbleSort2(),
                new HeapSort(),
                new SelectionSort(),
                new BubbleSort3());
    }

    static void testSorts(Integer[] array, Sort... sorts) {
        for (Sort sort : sorts) {
            Integer[] newArray = Integers.copy(array);
            sort.sort(newArray);
            Asserts.test(Integers.isAscOrder(newArray));
        }

        Arrays.sort(sorts);

        for (Sort sort : sorts) {
            System.out.println(sort);
        }
    }
}
