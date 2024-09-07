import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {
    private Node head;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head; // Start from head
        while (temp != null) { // null implies end of list
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to next node
        }
        System.out.println();
    }

    public void insertAtPos(int pos, T val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) { // Move to previous node
            temp = temp.next;
            if (temp == null) 
                throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }

        // Reassign pointers
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPos(int pos) {
        if (head == null) 
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        // Move to node to be deleted
        for (int i = 1; i <= pos; i++) {
            prev = temp; // Keep track of previous node
            temp = temp.next; // Move to next node
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }

        prev.next = temp.next; // Reassign pointers
    }

    public void deleteAtBeginning() {
        if (head == null) 
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");

        head = head.next;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev; // Reverse link
            prev = current;
            current = next;
        }

        head = prev;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Insert nodes
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);

        // Display the list
        System.out.println("Linked List:");
        list.display();

        // Delete a node
        list.deleteAtBeginning();

        // Display the list after deletion
        System.out.println("Linked List after deletion of the first element:");
        list.display();
    }
}
