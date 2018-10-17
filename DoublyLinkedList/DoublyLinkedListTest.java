
/**
 * Write a description of class DoublyLinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoublyLinkedListTest
{
    public static void main(String[] args){
        long startTime = System.nanoTime();
        DoublyLinkedList numberLL = new DoublyLinkedList();
        
        numberLL.deleteWithValue(2);
        
        for (int i=1; i<=10000000; i++){
            numberLL.append(i);
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("DoublyLinkedList - Appending 1,000,000 Int records: " + totalTime);        
        /*
        numberLL.print(true);
        numberLL.print(false);
        
        numberLL.deleteWithValue(100);
        numberLL.deleteWithValue(5);
        numberLL.deleteWithValue(2);
        numberLL.deleteWithValue(8);
        
        numberLL.print(true);
        
        numberLL.prepend(5);
        numberLL.prepend(2);
        numberLL.prepend(8);
        numberLL.print(true);

        */
    }

}
