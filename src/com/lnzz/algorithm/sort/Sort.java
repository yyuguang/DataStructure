package com.lnzz.algorithm.sort;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * ClassName: Sort
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/12/9 16:29
 * @description TODO
 */
public abstract class Sort implements Comparable<Sort> {

    protected Integer[] array;
    /**
     * 比较次数
     */
    private int cmpCount;
    /**
     * 交换次数
     */
    private int swapCount;

    private long time;
    private DecimalFormat fmt = new DecimalFormat("#.00");

    public void sort(Integer[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        this.array = array;
        long begin = System.currentTimeMillis();
        sort();
        time = System.currentTimeMillis() - begin;
    }

    @Override
    public int compareTo(Sort o) {
        int result = (int) (time - o.time);
        if (result != 0) {
            return result;
        }

        result = cmpCount - o.cmpCount;
        if (result != 0) {
            return result;
        }

        return swapCount - o.swapCount;
    }

    protected abstract void sort();

    /**
     * 比较
     *
     * @param index1
     * @param index2 <p></p>
     *               返回值等于0，代表 array[index1]==array[index2]
     *               返回值小于0，代表 array[index1]<array[index2]
     *               返回值大于0，代表 array[index1]>array[index2]
     */
    protected int cmp(int index1, int index2) {
        cmpCount++;
        return array[index1] - array[index2];
    }

    protected int cmpElements(Integer v1, Integer v2) {
        cmpCount++;
        return v1 - v2;
    }

    protected void swap(int index1, int index2) {
        swapCount++;
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Override
    public String toString() {
        String timeStr = "耗时：" + (time / 1000.0) + "s(" + time + "ms)";
        String compareCountStr = "比较：" + numberString(cmpCount);
        String swapCountStr = "交换：" + numberString(swapCount);
        return "【" + getClass().getSimpleName() + "】\n"
                + timeStr + " \t"
                + compareCountStr + "\t "
                + swapCountStr + "\n"
                + "------------------------------------------------------------------";
    }

    private String numberString(int number) {
        if (number < 10000) {
            return "" + number;
        }

        if (number < 100000000) {
            return fmt.format(number / 10000.0) + "万";
        }
        return fmt.format(number / 100000000.0) + "亿";
    }


}

