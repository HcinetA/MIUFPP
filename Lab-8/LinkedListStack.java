package prob1;

public class LinkedListStack {
    /* Stack implementation using a singly linked list */

    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    private Node top = null;
    private int size = 0;

    public void push(Integer x) {
        if (x == null) return;
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Integer peek() {
        return (top == null) ? null : top.data;
    }

    public Integer pop() {
        Integer ret = peek();
        if (ret != null) {
            top = top.next;
            size--;
        }
        return ret;
    }

    public boolean isEmpty() { // true if stack is empty
        return top == null;
    }

    public int size() { // returns number of items in the stack
        return size;
    }

    @Override
    public String toString() {
        if (top == null) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("Size = " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
