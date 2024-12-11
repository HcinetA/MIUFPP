package Lesson8.prob4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1
    public void addLast(String item) {
        Node newNode = new Node();
        newNode.value = item;
        Node last = header;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.previous = last;
    }

    // 2
    public boolean remove(String item) {
        Node current = header.next;

        while (current != null) {
            if (current.value.equals(item)) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3
    public boolean removeFirst() {
        if (header.next == null) {
            return false;
        }

        Node first = header.next;

        if (first.next != null) {
            first.next.previous = header;
        }

        header.next = first.next;

        return true;
    }

    // 4
    public void printReverse() {
        Node current = header.next;


        while (current != null && current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header.next); // Start from the node after the header
        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        sb.append(n.value).append(" ");
        toString(sb, n.next);
    }

    // Node class
    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("List after adding elements: " + list);
        //1
            list.addLast("Carol");
            System.out.println("List after adding elements: " + list);

        // 2
        list.remove("Harry");
        System.out.println("List after removing 'Harry': " + list);

        // 3
        list.removeFirst();
        System.out.println("List after removing the first element: " + list);

        // 4
        System.out.print("List in reverse: ");
        list.printReverse();
    }
}
