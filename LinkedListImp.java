class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
        Node head;
        Node tail;

        public LinkedList(){
          head = null;
          tail = null;
        }

        public void insertAtBeg(int data) {
            Node newnode = new Node(data);
              if(head == null){
                head = newnode;
                tail = newnode;
              }
              else{
                newnode.next = head;
                head = newnode;
              }
        }

        public void insertAtEnd(int data){
          Node newnode = new Node(data);
          if(head == null){
            head = newnode;
            tail = newnode;
          }
          else {
            tail.next = newnode;
            tail = newnode;
          }
        }

        public void insertAtpos(int data, int pos){
          Node newnode = new Node(data);

          if(pos == 0){
            insertAtBeg(data);
          }
          Node temp = head;

          for(int i = 1; i<pos-1; i++){
            temp = temp.next;
          }
          if(temp == null){
            System.out.println("index out of bounds");
            return;
          }
          newnode.next = temp.next;
          temp.next = newnode;

          if(newnode.next == null){
            tail = newnode;
          }
        }

        public void delAtBeg(){
          if(head == null){
            System.out.println("List is empty");
            return;
          }
          head = head.next;
        }

        public void delAtEnd(){
          if(head == null){
            System.out.println("List is empty");
            return;
          }
          if(head.next == null){
            head = null;
            tail = null;
            return;
          }
          Node temp = head;
          while(temp.next != tail){
            temp = temp.next;
          }
          temp.next = null;
          tail = temp;
        }

        public void delAtPos(int pos){
          if(head == null){
            System.out.println("List is empty");
            return;
          }
          if(pos == 0){
            delAtBeg();
            return;
          }

          Node temp = head;
          for(int i=1; i<pos-1; i++){
            if(temp == null || temp.next == null){
              System.out.println("Index out of bounce");
              return;
            }
            temp = temp.next;
          }
          temp.next = temp.next.next;
          if(temp.next == null){
            tail = temp;
          }
        }

        public void display(){
          if(head == null){
            System.out.println("List is empty");
            return;
          }
          Node temp = head;
          while(temp != null){
            System.err.print(temp.data+ " -> ");
            temp = temp.next;
          }
          System.out.println("null");
        }
}

public class LinkedListImp {
    public static void main(String args[]){
      LinkedList obj = new LinkedList();
      obj.insertAtBeg(2);
      obj.insertAtBeg(1);
      obj.insertAtEnd(5);
      obj.insertAtpos(3,3);
      obj.insertAtpos(4, 4);
      obj.display();

      obj.delAtBeg();
      obj.display();

      obj.delAtEnd();
      obj.display();

      obj.delAtPos(2);
      obj.display();
    }
}