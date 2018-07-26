package algorithms;

/**
 * 单链表，储存 int
 */
public class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}
