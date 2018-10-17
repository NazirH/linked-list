
/**
 * Write a description of class DoublyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoublyLinkedList
{
    private class Node{
        int data;
        Node next;
        Node previous;
        
        public Node(int data){
            this.data = data;
        }
    }
    
    Node head;
    Node tail;
    
    public void append(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
            return;
        }
    
        // this gives us direct access to the tail of the linked list
        // to apend the record without having to traverse the list.
        // hence increasing the apend method speed to 
        // big O(1) instead of big O(n) 
        
        Node newNode = new Node(data);
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
    }
    
    public void prepend(int data){
        if (head == null){
            head = new Node(data);
            tail = head;
            return;
        }
        
        Node newNode = new Node(data);
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }
    
    public void deleteWithValue(int data){
        if (head == null){
            System.out.println("Linked List is Empty. Nothing to delete");
            return;
        }
        if (head.data == data){
            head.next.previous = null;
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
            }
            if (current.next == tail){
                current.next.previous = current;
            }
            current = current.next;
        }
    }

    public void print(boolean moveForward){
        if(head == null){
            System.out.println("Linked List Empty!");
            return;
        }
        
        Node current;
        if (moveForward){
            current = head;
            System.out.print("Printing in order left to right: " + current.data);
            while (current.next != null){
                System.out.print(", " + current.next.data);
                current = current.next;
            }
            System.out.println();
        } else {
            current = tail;
            System.out.print("Printing in reverse order: " + current.data);
            while (current.previous != null){
                System.out.print("," + current.previous.data);
                current = current.previous;
            }
            System.out.println();
        }
    }
}
