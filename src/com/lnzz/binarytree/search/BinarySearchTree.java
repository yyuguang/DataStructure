package com.lnzz.binarytree.search;

import com.lnzz.util.binarytree.BinaryTreeInfo;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

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
        root = null;
        size = 0;
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
     * 前序遍历
     */
    public void prevOrderTraversal() {
        prevOrderTraversal(root);
    }

    private void prevOrderTraversal(Node<E> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.element);
        prevOrderTraversal(node.left);
        prevOrderTraversal(node.right);
    }

    /**
     * 中序遍历
     */
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<E> node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.element);
        inOrderTraversal(node.right);
    }

    /**
     * 后序遍历
     */
    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node<E> node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.element);
    }

    /**
     * 层序遍历
     */
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node<E> node = queue.poll();
            System.out.println(node.element);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
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
