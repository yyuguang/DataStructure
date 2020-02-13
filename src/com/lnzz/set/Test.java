package com.lnzz.set;

/**
 * ClassName：Test
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/13 9:57
 * @Description:
 */
public class Test {

    static void test1() {
        Set<Integer> listSet = new ListSet<>();
        listSet.add(10);
        listSet.add(11);
        listSet.add(11);
        listSet.add(12);
        listSet.add(13);

        listSet.traversal(new Set.Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.println(element);
                return false;
            }
        });
    }

    static void test2() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(13);
        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(11);
        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(13);

        treeSet.traversal(new Set.Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.println(element);
                return false;
            }
        });
    }

    public static void main(String[] args) {
        test2();
    }
}
