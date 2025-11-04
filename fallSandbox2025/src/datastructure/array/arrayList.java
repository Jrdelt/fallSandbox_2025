package datastructure.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class arrayList {

   public static void main(String[] args) {

      // Common List Methods
      // .add(<element_type>) - Adds element to list.
      // .get(<index>) - Return the element in the list.
      // .remove(<index>) - Removed the element at specified element.
      // .set(<index>, <element_type>) - Replace the element at specified element.
      // .size(<index>) - Returns size of the list.

      // ArrayList resizable array
      // Compared to the simple Array[], which is not resizable.
      List<String> cars = new ArrayList<>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println("Before Collection.sort(cars): " + cars);

      // .sort() organizes the collection in order of alphabetic / number.
      Collections.sort(cars); // Sort cars
      System.out.println("After Collection.sort(cars): " + cars);

      List<Integer> nums = new ArrayList<>();
      nums.add(10);
      nums.add(12);
      nums.add(8);
      nums.add(1);
      nums.add(100);
      System.out.println("Before Collection.sort(nums): " + nums);
      Collections.sort(nums);
      System.out.println("After Collection.sort(nums): " + nums);

      // Hashset, essentially an ArrayList but not duplicate elements are allowed.\
      HashSet<String> food = new HashSet<>();
      food.add("Hotdog");
      food.add("Burger");
      food.add("Tacos");
      food.add("Hotdog");
      // System.out.println(food);

      // HashMap stores Key Value pairs.
      // Will not store duplicate key-values.

      HashMap<String, String> capitalCities = new HashMap<>();
      capitalCities.put("WA", "Olympia");
      capitalCities.putIfAbsent("CA", "Sacramento");
      capitalCities.put("WA", "Olympia");
      // System.out.println(capitalCities);

      // Interfaces
      // (1) List
      // (2) Set
      // (3) Map

      // Classes
      // (1) ArrayList
      // (2) HashMap
      // (3) HashSet
      /**
       * Interface Common Classes Description
       * - List ArrayList,LinkedList: Ordered collection that allows duplicates
       * - Set HashSet,TreeSet,LinkedHashSet: Collection of unique elements
       * - Map HashMap,TreeMap,LinkedHashMap: Stores key-value pairs with unique keys
       */
      /**
       * Use List classes when you care about order, you may have duplicates, and want
       * to access elements by index.
       * Use Set classes when you need to store unique values only.
       * Use Map classes when you need to store pairs of keys and values, like a name
       * and its phone number.
       */

   }

}
