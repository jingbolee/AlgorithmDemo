package algorithms;

import java.util.ArrayList;

/**
 * 链表翻转，用 Java 逆序打印链表
 * 使用ArrayList 来实现链表的翻转，先把链表放入到数组中中，然后倒叙遍历打印
 */
public class ReverseLinkedList2 {

    public static void printReverseLinked(Node head) {
        ArrayList<Node> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i).data + "");
        }
    }

    public static void main(String... args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printReverseLinked(head);
    }

}
