package com.lnzz.util;

/**
 * ClassName：Asserts
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/30 12:52
 * @Description: 结果测试工具类
 */
public class Asserts {
    public static void test(boolean value) {
        try {
            if (!value) throw new Exception("测试未通过");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
