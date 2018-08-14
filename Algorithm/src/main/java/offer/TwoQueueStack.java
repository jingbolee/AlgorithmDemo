package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列实现一个栈
 * 思路：
 * 1. 栈的特点：先进后出，队列特点：先进先出
 * 2. 入栈，入不为空的队列，都为空的时候，入队列A
 * 3. 出栈，拿到不为空队列的最后一个元素，实现出栈
 */
public class TwoQueueStack<E> {
    private Queue<E> queueA;
    private Queue<E> queueB;

    public TwoQueueStack() {
        queueA = new LinkedList<>();
        queueB = new LinkedList<>();
    }

    public E push(E e) {
        if (!queueA.isEmpty()) {
            queueA.add(e);
        } else if (!queueB.isEmpty()) {
            queueB.add(e);
        } else {
            queueA.add(e);
        }
        return e;
    }

    public E pop() {
        if (queueA.isEmpty() && queueB.isEmpty()) {
            return null;
        }
        if (!queueA.isEmpty()) {
            while (!queueA.isEmpty()) {
                if (queueA.size() == 1) {
                    return queueA.poll();
                } else {
                    queueB.add(queueA.poll());
                }
            }
        } else if (!queueB.isEmpty()) {
            while (!queueB.isEmpty()) {
                if (queueB.size() == 1) {
                    return queueB.poll();
                } else {
                    queueA.add(queueB.poll());
                }
            }
        } else {
            return null;
        }

        return null;
    }

    public int count() {
        return queueA.size() + queueB.size();
    }

    public static void main(String... args) {
        TwoQueueStack<String> queueStack = new TwoQueueStack<>();
        for (int i = 0; i < 10; i++) {
            queueStack.push(i + "");
        }
        int count = queueStack.count();
        for (int i = 0; i < count; i++) {
            System.out.println(queueStack.pop());
        }
    }

}
