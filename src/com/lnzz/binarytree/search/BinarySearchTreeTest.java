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

    static void test1() {
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.println(bst);
        System.out.println();
        bst.levelOrderTraversal();
    }

    static void test2() {
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 1
        };

        BinarySearchTree02<Integer> bst = new BinarySearchTree02<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        BinaryTrees.println(bst);

        bst.prevOrder(new BinarySearchTree02.Visitor<Integer>() {

            @Override
            public boolean visit(Integer element) {
                System.out.print(element + " ");
                return element == 2 ? true : false;
            }
        });
        System.out.println();

        bst.inOrder(new BinarySearchTree02.Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + " ");
                return element == 4 ? true : false;
            }
        });
        System.out.println();

        bst.postOrder(new BinarySearchTree02.Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + " ");
                return element == 4 ? true : false;
            }
        });
        System.out.println();

        bst.levelOrder(new BinarySearchTree02.Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + " ");
                return element == 9 ? true : false;
            }
        });
        System.out.println();
    }

    static void test3() {
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 5
        };

        BinarySearchTree02<Integer> bst = new BinarySearchTree02<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.println(bst);
        System.out.println(bst.isComplete());
    }

    static void test4() {
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };

        BinarySearchTree02<Integer> bst = new BinarySearchTree02<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.println(bst);

        bst.remove(7);
        BinaryTrees.println(bst);
    }

    public static void main(String[] args) {
        test4();
    }
}
