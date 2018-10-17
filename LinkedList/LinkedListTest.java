
/**
 * Write a description of class LinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedListTest
{
    public static void main(String[] args){
        long startTime = System.nanoTime();

        LinkedList numberLL = new LinkedList();
        
        numberLL.deleteWithValue(2);
        
        for (int i=1; i<=100000; i++){
            numberLL.append(i);
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("LinkedList - Appending 1,000,000 Int records: " + totalTime);        
        /*
        numberLL.print();
        
        numberLL.deleteWithValue(100);
        numberLL.deleteWithValue(5);
        numberLL.deleteWithValue(2);
        numberLL.deleteWithValue(8);
        
        numberLL.print();
        
        numberLL.prepend(5);
        numberLL.prepend(2);
        numberLL.prepend(8);
        numberLL.print();
        */
    }

}
