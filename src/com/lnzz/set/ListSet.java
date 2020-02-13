package com.lnzz.set;

import com.lnzz.set.list.DoubleLinkedList;
import com.lnzz.set.list.List;

/**
 * ClassName：ListSet
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/13 9:42
 * @Description:
 */
public class ListSet<E> implements Set<E> {
    private List<E> list = new DoubleLinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean contains(E element) {
        return list.contains(element);
    }

    @Override
    public void add(E element) {
        if (element == null) {
            throw new NullPointerException("element is null");
        }
        int index = list.indexOf(element);
        if (index != List.ELEMENT_NOT_FOUND) {
            list.set(index, element);
        } else {
            list.add(element);
        }
    }

    @Override
    public void remove(E element) {
        int index = list.indexOf(element);
        if (index != List.ELEMENT_NOT_FOUND) {
            list.remove(index);
        }
    }

    @Override
    public void traversal(Visitor<E> visitor) {
        if (visitor == null) {
            return;
        }

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (visitor.visit(list.get(i))) {
                return;
            }
        }
    }
}
