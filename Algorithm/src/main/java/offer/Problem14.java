package offer;

import algorithms.Node;

/**
 * 14.合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
 */
public class Problem14 {

    /**
     * 使用递归的方式
     *
     * @param node1
     * @param node2
     * @return
     */
    public static Node merge(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        Node newNode;
        if (node1.data > node2.data) {
            newNode = node2;
            newNode.next = merge(node1, node2.next);
        } else {
            newNode = node1;
            newNode.next = merge(node1.next, node2);
        }
        return newNode;
    }


    public static void main(String... args) {
        Node node1 = new Node(1);
        node1.next = new Node(3);
        node1.next.next = new Node(5);

        Node node2 = new Node(2);
        node2.next = new Node(4);
        node2.next.next = new Node(6);

        Node newNode = merge(node1, node2);
        while (newNode != null) {
            System.out.print(newNode.data + "");
            newNode = newNode.next;
        }

    }

}
