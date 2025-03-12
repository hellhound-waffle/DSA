package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.insert(5);
        list.insert(7);
        list.insert(1);
        list.insert(666);
        list.insertAtStart(69);
        list.insertAt(3, 969);
        list.deleteAt(2);

        list.show();
    }
}
