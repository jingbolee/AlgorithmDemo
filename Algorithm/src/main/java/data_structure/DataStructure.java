package data_structure;

import algorithms.Node;

public class DataStructure {

    /**
     * string 转 int
     * @param input
     * @return
     */
    public static int string2Int(String input) {
        int value = 0;
        if (input == null) {
            value = 0;
        } else {
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                value = value * 10 + (chars[i] - '0');
            }
        }
        return value;
    }


    /**
     * 删除单列表中重复元素
     *
     * @param head
     */
    public static Node deleteDuplicatesNodeFromLinkedlist(Node head) {
        if (head == null) {
            return null;
        }
        Node preNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.data == preNode.data) {
                preNode.next = currentNode.next;
            } else {
                preNode = currentNode;
            }
            currentNode = preNode.next;
        }
        return head;
    }

    public static void printNode(Node head) {
        if (head != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Node concent: ");
            Node temp = head;
            while (temp != null) {
                sb.append("->" + temp.data);
                temp = temp.next;
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("head is null");
        }
    }

    public static void main(String... args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(3);
//        head.next.next.next.next = new Node(3);
//        head.next.next.next.next.next = new Node(3);
//        Node node = deleteDuplicatesNodeFromLinkedlist(head);
//        printNode(node);

        int anInt = string2Int("12345");
        System.out.println("" + anInt);
    }

}
