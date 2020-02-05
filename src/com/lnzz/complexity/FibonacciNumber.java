package com.lnzz.complexity;

import com.lnzz.util.TimeTool;

/**
 * ClassName：FibonacciNumber
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/30 10:20
 * @Description: 斐波那契数:两个数相加  0 1 1 2 3 5 8 13 21 ...
 */
public class FibonacciNumber {

    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }


    public static void main(String[] args) {
        final int num = 50;
        TimeTool.check("fib1", new TimeTool.Task() {
            public void execute() {
                System.out.println(fib1(num));
            }
        });
        TimeTool.check("fib2", new TimeTool.Task() {
            public void execute() {
                System.out.println(fib2(num));
            }
        });
    }
}
