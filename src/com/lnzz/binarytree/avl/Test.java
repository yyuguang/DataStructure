package com.lnzz.binarytree.avl;

import com.lnzz.util.binarytree.BinaryTrees;

/**
 * ClassName：Test
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/9 15:52
 * @Description:
 */
public class Test {

    static void test1() {
        Integer data[] = new Integer[]{
                85, 19, 69, 3, 7, 99, 95, 2, 1, 70, 44, 58, 11, 21, 14, 93, 57, 4, 56
        };

        AvlTree<Integer> avl = new AvlTree<>();
        for (int i = 0; i < data.length; i++) {
            avl.add(data[i]);
        }

        BinaryTrees.println(avl);
    }

    static void test2() {
        Integer data[] = new Integer[]{
                85, 19, 69, 3, 7, 99, 95
        };

        AvlTree<Integer> avl = new AvlTree<>();
        for (int i = 0; i < data.length; i++) {
            avl.add(data[i]);
        }

        BinaryTrees.println(avl);
        avl.remove(99);
        avl.remove(85);
        System.out.println("--------------------------");
        BinaryTrees.println(avl);
    }

    public static void main(String[] args) {
        test2();
    }
}
