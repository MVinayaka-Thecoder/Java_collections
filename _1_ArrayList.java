/**
  A List in Java is an ordered collection that can contain duplicate elements. Elements in a list have
  specific positions known as indices. The List interface provides methods to manipulate elements based
  on their positions.
 */
/**
 * The order collection means: Elements in a list maintain their insertion order, meaning
   they are sorted and retrieved in the sequence in which they were added
 */

//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//
//public class _1_ArrayList {
//    public static void main(String[] args){
//
//
//        ArrayList<Integer> nums=new ArrayList<>();
//        nums.add(20);
//        nums.add(30);
//        nums.add(40);
//        nums.add(20);
//        nums.add(40);
//        nums.add(50);
//
//        System.out.println(nums);
//
//
//    }
//}


//
//// Method 2: Taking string as data types
//
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//
//public class _1_ArrayList {
//    public static void main(String[] args){
//
//        ArrayList<String> nums=new ArrayList<>();
//        nums.add("Chimppu");
//        nums.add("Pepa");
//        nums.add("Ice Bear");
//        nums.add("Pan pan");
//        nums.add("Vimppu");
//        nums.add("Rocky");
//
//        System.out.println(nums);
//
//
//    }
//}



//
//// Method 3: Another way of taking inputs
//
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class _1_ArrayList {
//    public static void main(String[] args){
//
//
//        List<Integer> nums=Arrays.asList(20,30,20,40,50,40);
//
//
//
//        System.out.println(nums);
//
//
//    }
//}






//// Method 4: Another way of taking inputs for String
//
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class _1_ArrayList {
//    public static void main(String[] args){
//
//
//        List<String> nums=Arrays.asList("Chimppu","Peppa","Ice bear","Pan pan","Vimppu","Rocky");
//
//
//
//        System.out.println(nums);
//
//
//    }
//}



//// Method 5: 1. Adding Elements to the Collections Class Object

//package _1JavaCollectionsFramework;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
//import java.util.Arrays;
//
//public class _1_ArrayList {
//    public static void main(String[] args) {
//
//
//        List<String> nums = new ArrayList<>();
//        nums.add("Chimppu");
//        nums.add("Peppa");
//
//
//        // Adding elements Using Collection class : addAll
//
//        Collections.addAll(nums, "Ice bear", "Pan pan", "Vimppu", "Rocky");
//
////        System.out.println(nums); // to print entier list
//
//
//
//        // To print each element we can use loops
//
//        // Method 1: Using for loop
//        System.out.println("Printing the values using for loop :");
//        for (int i = 0; i < nums.size(); i++) // nums.length wont work here
//        {
//            System.out.print(nums.get(i) + " "); // nums[i] method wont work here
//
//        }
//
//        System.out.println();
//        System.out.println();
//
//        // we can use methods in gets like getfirst(), getLast(), getClass()
//
//        System.out.println("The First Element in the List is : "+nums.getFirst()+" ");
//        System.out.println("The last Element in the List : "+nums.getLast());
//        System.out.println("The class used in the List is returned : "+nums.getClass());
//
//
//
//    }
//}



//
//// Method 6: 2. Sorting a Collection of string values
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
//import java.util.Arrays;
//
//public class _1_ArrayList {
//    public static void main(String[] args) {
//
//
//        List<String> nums = new ArrayList<>();
//        nums.add("Chimppu");
//        nums.add("Peppa");
//
//        // Adding elements Using Collection class : addAll
//
//        Collections.addAll(nums, "Ice bear", "Pan pan", "Vimppu", "Rocky","Abhi");
//
//        System.out.println(nums); // to print entier list
//
//        // sort the nums
//
//        Collections.sort(nums);
//        System.out.println();
//        System.out.println("After Sorting : "+nums); // This will sort in ascending order
//
//    }
//}





//// Method 6: 2. Sorting a Collection of integer values
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
//import java.util.Arrays;
//
//public class _1_ArrayList {
//    public static void main(String[] args) {
//
//
//        List<Integer> nums = new ArrayList<>();
//        nums.add(9);
//        nums.add(8);
//
//        // Adding elements Using Collection class : addAll
//
//        Collections.addAll(nums, 7,6,5,4,3,2,1);
//
//        System.out.println("Before Sorting : "+nums); // to print entier list
//
//        // sort the nums
//
//        Collections.sort(nums);
//        System.out.println();
//        System.out.println("After Sorting : "+nums); // This will sort in ascending order
//
//    }
//}






//// Method 7:3. Searching in a Collection
///**
// Collections.binarySearch() method returns the position of an object in a sorted list.
// To use this method,the list should be sorted in ascending order, otherwise,
// the result returned from the method will be wrong. If the element exists in the
// list, the method will return the position of the element in the sorted list,
// if the element does not exist in the list then this method will return a negative number that
// shows where the item would be inserted in the list - 1.
// */
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
//import java.util.Arrays;
//
//public class _1_ArrayList {
//    public static void main(String[] args) {
//
//
//        List<String> nums = new ArrayList<>();
//        Collections.addAll(nums, "Chimppu","Peppa","Rocky","Ice bear", "Pan pan", "Vimppu","Abhi");
//        System.out.println("Elements Before Sorting : "+nums);
//        System.out.println();
//
//        Collections.sort(nums);
//        // Collections.binarySearch works on the sorted Array
//        System.out.println("Elements After Sorting : "+nums);
//        System.out.println();
//
//        // Printing the index value
//
//        System.out.println("The index value of the Rocky is :"+Collections.binarySearch(nums,"Rocky"));
//
//
//    }
//}





//// Method 8:4. copy Elements in a Collection
///**
// The copy() method of Collections class is used to copy all the elements from one list into another.
// After the operation, the index of each copied element in the destination list will be
// identical to its index in the source list. The destination list must be at least as long as the source list.
// If it is longer, the remaining elements in the destination list are unaffected.
// **/
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
//import java.util.Arrays;
//
//public class _1_ArrayList {
//    public static void main(String[] args) {
//
//
//        List<String> nums = new ArrayList<>();
//        Collections.addAll(nums, "1","2","3","4"); // nums is destination
//
//        List<String> nums1=new ArrayList<>(); // nums1 is destination
//        Collections.addAll(nums1,"5","6","8","4");
//
//        Collections.copy(nums,nums1); // Here we are copying the elements from nums1 to nums and nums is overriden by nums1 values
//
//
//        System.out.println(nums);
//
//    }
//}





//// Method 9:5. Disjoint Collection
///**
// Collections.disjoint() is used to check whether two specified collections have nothing in common.
// It returns true if the two collections do not have any element in common.
// **/
//package _1JavaCollectionsFramework;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
//import java.util.Arrays;
//
//public class _1_ArrayList {
//    public static void main(String[] args) {
//
//
//        List<String> nums = new ArrayList<>();
//        Collections.addAll(nums, "Apple","Ball","cat","dog"); // nums is destination
//        System.out.println("The elements in the Collection nums : "+nums);
//        System.out.println();
//
//        List<String> nums1=new ArrayList<>(); // nums1 is destination
//        Collections.addAll(nums1,"Panda","Grizly","Ice bear","dog");
//        System.out.println("The elements in the Collection nums1 : "+nums1);
//        System.out.println();
//
//     System.out.println("No Elements Are Similar in the two collections : "+Collections.disjoint(nums,nums1));
//
//// It returns true: if no similar elements are found in the collections.
//// It returns false: if similar elements are found in the collections.
//
//
//    }
//}





// Method 10:Basics

package _1JavaCollectionsFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;

public class _1_ArrayList {
    public static void main(String[] args) {


        List<String> nums1 = new ArrayList<>();
        Collections.addAll(nums1,"Panda","Grizzly","Ice bear","Black Bear");
        System.out.println("The elements in the Collection nums1 : "+nums1);

        // To insert value using index at any place

        nums1.add(1,"Chimppu");
        System.out.println(nums1);

        // To retreive element using Get
        System.out.println("The element at index 1 : "+nums1.get(1));


        // To remove element using index
        nums1.remove(1);
        System.out.println("Elements after removing index value 1: "+nums1);


        // To remove element using value(Example: 2,3.4,"Chimppu")
        nums1.remove("Black Bear");
        System.out.println("Elements after removing using value : "+nums1);


        // Using set Element: we can update values
        nums1.set(1,"Grizzly Bear");
        System.out.println("Elements After Updating the values : "+nums1);


        // Using contains: returns true if element present
        System.out.println(nums1.contains("Chimppu")); // returns false means no value called chimppu is present


        // Iterating using loops
        System.out.println();
        System.out.println("USing loops : ");
        for(int i=0;i<nums1.size();i++){
            System.out.println(nums1.get(i));
        }

        System.out.println();

        // Iterating using for each loop
        System.out.println("Using for each loop");
       for (String elements:nums1){ // String because we using string values if numericals use Integer
           System.out.println(elements);
       }


       // Using Iterator

        Iterator<String> lt=nums1.iterator();
       System.out.println();
       System.out.println("Using Iterator");
       while(lt.hasNext()){
           System.out.println("Iterator : "+lt.next());
       }



        nums1.clear(); // this will erase all the elements in the list
       System.out.println();
        System.out.println(nums1); // returns empty list




    }
}