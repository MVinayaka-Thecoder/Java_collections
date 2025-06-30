package _1JavaCollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class _7_hashSet {
    public static void main(String[] args){
        // No order with no duplicated elements are allowed

        Set<Integer> s=new HashSet<>();
        s.add(32); // internally it uses hashing
        s.add(2);
        s.add(54);
        s.add(21);
        s.add(65);
        s.add(54); // this will not print
        System.out.println(s);



     s.remove(54);
        System.out.println(s);


        System.out.println(s.contains(2)); // this will give true : checks whether element present or not
        System.out.println(s.contains(24)); // this will give false


         System.out.println(s.isEmpty()); // this will give you false bec we have elements in the set

        s.clear();
        System.out.println(s);


    }
}
