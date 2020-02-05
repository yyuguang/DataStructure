package com.lnzz.binarytree.search;

import com.lnzz.util.binarytree.BinaryTreeInfo;

import java.util.Comparator;

/**
 * ClassName：BinarySearchTree
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/5 10:18
 * @Description: 二叉搜索树
 */
public class BinarySearchTree<E> implements BinaryTreeInfo {

    private int size;
    /**
     * 根节点
     */
    private Node<E> root;

    private Comparator<E> comparator;

    public BinarySearchTree() {
        this(null);
    }

    public BinarySearchTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {

    }

    public void add(E element) {
        elementNoyNullCheck(element);
        if (root == null) {
            //添加第一个节点
            root = new Node<>(element, null);
            size++;
            return;
        }
        //添加的不是第一个节点
        //找到父节点
        Node<E> parent = root;
        Node<E> node = root;
        int compare = 0;
        while (node != null) {
            compare = compare(element, node.element);
            parent = node;
            if (compare > 0) {
                node = node.right;
            } else if (compare < 0) {
                node = node.left;
            } else {
                return;
            }
        }

        //插入到父节点那个位置
        Node<E> newNode = new Node<>(element, parent);
        if (compare > 0) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        size++;
    }

    public void remove(E element) {

    }

    public boolean contains(E element) {
        return false;
    }

    /**
     * @param e1
     * @param e2
     * @return 返回值等于0，代表e1和e2相等;大于0，e1>e2;小于0;e1<e2
     */
    private int compare(E e1, E e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2);
        }
        return ((Comparable<E>) e1).compareTo(e2);
    }

    private static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }
    }

    private void elementNoyNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element must not ne null");
        }
    }

    @Override
    public Object root() {
        return root;
    }

    @Override
    public Object left(Object node) {
        return ((Node<E>) node).left;
    }

    @Override
    public Object right(Object node) {
        return ((Node<E>) node).right;
    }

    @Override
    public Object string(Object node) {
        return ((Node<E>) node).element;
    }

}
