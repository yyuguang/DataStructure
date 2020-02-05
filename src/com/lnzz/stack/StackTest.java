package com.lnzz.stack;

/**
 * ClassName：StackTest
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/2 11:42
 * @Description:
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
