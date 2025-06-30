package _1JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _11_Treemap {
    public static void main(String[] args){


        // Map= key value pair
        // key value can be it their own data types

        Map<String, Integer> numbers=new TreeMap<>();
        numbers.put("one",1);
        numbers.put("Two",2);
        numbers.put("Three",3); // keys should always be unique
        numbers.put("Five",5);
        numbers.put("four",4);

        System.out.println(numbers); // sorted based on the strings


        numbers.remove("Three");
        System.out.println(numbers); // removes three


    }

}

