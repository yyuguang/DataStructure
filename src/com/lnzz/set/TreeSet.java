package com.lnzz.set;

import com.lnzz.set.tree.RBBinaryTree;
import com.lnzz.set.tree.RBTree;

/**
 * ClassName：TreeSet
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/13 10:07
 * @Description:
 */
public class TreeSet<E> implements Set<E> {
    private RBTree<E> tree = new RBTree<>();

    @Override
    public int size() {
        return tree.size();
    }

    @Override
    public boolean isEmpty() {
        return tree.isEmpty();
    }

    @Override
    public void clear() {
        tree.clear();
    }

    @Override
    public boolean contains(E element) {
        return tree.contains(element);
    }

    @Override
    public void add(E element) {
        tree.add(element);
    }

    @Override
    public void remove(E element) {
        tree.remove(element);
    }

    @Override
    public void traversal(Visitor<E> visitor) {
        tree.inOrder(new RBBinaryTree.Visitor<E>() {
            @Override
            public boolean visit(E element) {
                return visitor.visit(element);
            }
        });

    }
}
