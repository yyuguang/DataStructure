package com.lnzz.binarytree.search;

import com.lnzz.util.binarytree.BinaryTrees;

/**
 * ClassName：BinarySearchTreeTest
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/5 10:39
 * @Description:
 */
public class BinarySearchTreeTest {

    public static void main(String[] args) {
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 5, 8, 11, 3,12,1
        };

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.print(bst);
    }
}
