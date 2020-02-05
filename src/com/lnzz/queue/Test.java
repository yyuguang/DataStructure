package com.lnzz.queue;

/**
 * ClassName：Test
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/3 10:56
 * @Description:
 */
public class Test {

    static void test1() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enQueue(11);
        queue.enQueue(22);
        queue.enQueue(33);
        queue.enQueue(44);

        while (!queue.isEmpty()) {
            System.out.println(queue.deQueue());
        }

//		Deque<Integer> queue = new Deque<>();
//		queue.enQueueFront(11);
//		queue.enQueueFront(22);
//		queue.enQueueRear(33);
//		queue.enQueueRear(44);
//
//
//		while (!queue.isEmpty()) {
//			System.out.println(queue.deQueueRear());
//		}
    }

    static void test2() {
        CircleQueue<Integer> queue = new CircleQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.enQueue(i);
        }
        for (int i = 0; i < 5; i++) {
            queue.deQueue();
        }
        for (int i = 15; i < 20; i++) {
            queue.enQueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.deQueue());
        }
        System.out.println(queue);
    }

    static void test3() {
        CircleDeque<Integer> queue = new CircleDeque<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.enQueueFront(i + 1);
            queue.enQueueRear(i + 100);
        }

        for (int i = 0; i < 3; i++) {
            queue.deQueueFront();
            queue.deQueueRear();
        }

        queue.enQueueFront(11);
        queue.enQueueFront(12);
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.deQueueFront());
        }
    }

    public static void main(String[] args) {
        test2();
        test3();
    }

}
