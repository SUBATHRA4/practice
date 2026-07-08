import java.util.*;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(100);
        dll.insertEnd(200);
        dll.insertEnd(300);
        dll.insertStart(90);
        // System.out.println(dll.head.data+" "+dll.head.next.data +" "+dll.tail.prev.data+ " "+dll.tail.data);
        dll.insertAtPosition(150, 3);
        dll.traversalForward();
        dll.traversalBackwards();
        dll.deleteFromBeginning();
        System.out.println("\nAfter delete beginning:");
        dll.traversalForward();
        dll.traversalBackwards();
        // dll.deleteFromEnd();
        // System.out.println("\nAfter delete End:");
        // dll.traversalForward();
        // dll.traversalBackwards();
        // dll.deleteFromPosition(2);
        // System.out.println("\nAfter delete from position:");
        // dll.traversalForward();
        // dll.traversalBackwards();

    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList{
    Node head = null;
    Node tail = null;
    void traversalForward(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void traversalBackwards(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
   void insertStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
   }
    void insertAtPosition(int data, int pos){
        if(pos == 1){
            insertStart(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp==null || temp.next == null){
            insertEnd(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
// ================= DELETE =================

    void deleteFromBeginning() {

        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;	
        }
    }

    void deleteFromEnd() {

        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void deleteFromPosition(int position) {

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == tail) {
            deleteFromEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

}