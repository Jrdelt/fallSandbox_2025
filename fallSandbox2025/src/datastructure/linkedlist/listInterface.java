import java.util.LinkedList;
import java.util.List;

public interface listInterface {

    // Implementing abstract in a method means the method does not need to be used in implemented classes.
    public abstract void addElement(String element);
    public abstract void addElement(int index, String element);
    public abstract void getIndex(int index);
    public abstract void remove(String element);
    public abstract void remove(int element);



    // .size() In array represents each element that has a specific value in its placement.abstract 
    ??QUESTION?? // .capacity() In an array represents the total amount of indexes within an element.




    static List<Integer> numbers = new LinkedList<>(List.of(10, 25, 45, 10, 255, 1, 700, 80, 9, 100));
    

}   
