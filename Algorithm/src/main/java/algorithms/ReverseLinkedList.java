package algorithms;

import java.util.Stack;

/**
 * 链表翻转，用 Java 逆序打印链表
 * 使用栈来实现链表的翻转，先把链表放入到栈中，然后打印栈
 * 利用了栈的特点是先进后出
 */
public class ReverseLinkedList {

    public static void reverseLinkedNode(Node node) {
        Stack<Node> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop().data + "");
        }
    }
    public static void main(String... args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        reverseLinkedNode(head);
    }

}
