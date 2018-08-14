
package offer;

import java.util.Stack;

/**
 * 5. 两个栈实现队列
 * 栈特点：先进后出
 * 队列特点：先进先出
 * 思路：
 * 1. 栈A 压入元素
 * 2. 栈B pop 元素
 * 3. 栈A 的元素往栈B元素压入，必须一次性全部都压入
 * 4. 栈B 的元素为空，把栈A元素全部都压入栈B，栈B不为空，不可压入元素
 */
public class Problem5<E> {
    private Stack<E> stackA;
    private Stack<E> stackB;

    public Problem5() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    /**
     * 入队
     */
    public boolean add(E o) {
        stackA.push(o);
        return true;
    }

    /**
     * 出队
     */
    public E offer() {
        if (stackA.isEmpty() && stackB.isEmpty()) {
            return null;
        }
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();
    }

    /**
     * peek 不操作元素，只返回队列头部的元素值
     */
    public E peek() {
        if (stackA.isEmpty() && stackB.isEmpty()) {
            return null;
        }
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.peek();
    }

    public int count() {
        return stackB.size() + stackA.size();
    }

    public static void main(String... args) {
        Problem5<String> stackQueue = new Problem5<>();
        for (int i = 0; i < 10; i++) {
            stackQueue.add(i + "");
            System.out.println("入队：" + i);
        }
        int count = stackQueue.count();
        for (int i = 0; i < count; i++) {
            System.out.println("出队：" + stackQueue.offer());
        }
    }
}
