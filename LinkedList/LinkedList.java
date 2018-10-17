
/**
 * Creating a simple linkedList class.
 * The Node class contains an Int and a pointer to the next Node named next.
 * this is a classic scenario of the LinkedList.
 *
 * @author (Nazir Hajje)
 * @version (1)
 */

public class LinkedList{
    
    private class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
        }
    }
    
    Node head;
    
    public void append(int data){
        // head is null. point head to the new node.
        if(head == null){
            head = new Node(data);
            return;
        }
        
        // current is pointing to where the head pointer is pointing to.
        Node current = head;
        while(current.next != null){
            // traverse the linkedlist to reach the end
            current = current.next;
        }
        // the current pointer is now pointing to the last node. 
        // assign the (lastnode) current.next to the new node 
        current.next = new Node(data);
    }
    
    public void prepend(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void deleteWithValue(int data){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        if (head.data == data){
            head = head.next;
            System.out.println("Successfully deleted record : " + data);
            return;
        }
        Node current = head;
        while (current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                System.out.println("Successfully deleted record : " + data);
                return;
            }
            current = current.next;
        }
        System.out.println("Record not found : " + data);
    }
    
    public void print(){
        if(head == null){
            System.out.println("Link List is empty");
            return;
        }
        Node current = head;
        System.out.print(head.data);
        while (current.next != null){
            System.out.print(", " + current.next.data);
            current = current.next;
        }
        System.out.println();
    }
}