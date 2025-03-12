package datastructures.linkedlist;

public class LinkedList <T> {
    public Node<T> head;

    public void insert(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0)
            head = head.next;
        else {
            Node<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node<T> n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data + " ");
    }
}
