class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList{
    Node head;
    Node tail;

    public DoubleLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtBeg(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtEnd(int data){
        if(head == null){
            insertAtBeg(data);
        }
        else{
            Node newnode = new Node(data);
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void insertAtPos(int data, int pos){
        if(head == null){
            insertAtBeg(data);
        }
        else{
            Node newnode = new Node(data);

            Node temp = head;
            for(int i=1; i<pos-1; i++){
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("Index out of bound");
                return;
            }

            newnode.prev = temp;
            newnode.next = temp.next;
            if(temp.next != null){
                temp.next.prev = newnode;
            }            
            temp.next = newnode;

            if(newnode.next == null){
                tail = newnode;
            }
        }
    }

    public void delAtBeg(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }

    public void delAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            tail.prev.next = null;
            tail = tail.prev;
        }
    }

    public void delAtPos(int pos){
        if(pos == 0){
            System.out.println("Cannot be deleted");
            return;
        }
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp =temp.next;
        }
        if(temp == null){
            System.out.println("out of bound");
            return;
        }
        temp.next = temp.next.next;
        if(temp.next.next != null){
            temp.next.prev = temp;
        }
        if(temp.next == null){
            tail = temp;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}



public class DoubleLinkedListImp {
    public static void main(String args[]){
        DoubleLinkedList obj = new DoubleLinkedList();

        obj.insertAtBeg(2);
        obj.insertAtBeg(1);
        obj.insertAtEnd(5);
        obj.insertAtPos(3,3);
        obj.insertAtPos(4, 4);
        obj.display();

        obj.delAtBeg();
        obj.display();

        obj.delAtEnd();
        obj.display();

        obj.delAtPos(2);
        obj.display();
    }
}
