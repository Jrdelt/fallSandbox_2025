package datastructure.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class linkedListJava {

    // Import Methods
    // import java.util.List;
    // import java.util.LinkedList;

    // LinkedList methods
    // (1) .addFirst()
    // (2) .addLast()
    // (3) .removeFirst()
    // (4) .removeLast()
    // (5) .remove(index) -> Remove the first copy of element.
    // (6) .getFirst() -> return type type of List<t>
    // (7) .getLast() 
    // (8) .get(index) -> returns element at specified index
    // (9) .size() -> return type int

    protected static  List<Integer> numbers = new LinkedList<>(List.of(10,25,45,10,255,1,700,80,9,100));
    protected static  List<Integer> numbers2 = new LinkedList<>(List.of(10,25,45,10,255,1,700,80,9,100));

    
    public static void main(String[] args) {
        List<String> people = new LinkedList<>();
        people.addFirst("First Element");
        people.addLast("Last Element");

        // System.out.println("Size of the LinkedList: " + people.size());
        // System.out.println("Elements: " + people);

        // LinkedList .sort()
        // System.out.println("Numbers not sorted: " + numbers);
        // Collections.sort(numbers);
        // System.out.println("Numbers Sorted: " + numbers);

        //LinkedList .reverseOrder()
        Collections.sort(numbers);
        // System.out.println("Reversed Order: " + numbers);

        // Enhanced for loop can typecast the initial variable and make it a new type
        for (String i : people){
            System.out.println(i);
        }
    }
}
