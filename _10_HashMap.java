package _1JavaCollectionsFramework;


import java.util.HashMap;
import java.util.Map;

public class _10_HashMap {
    public static void main(String[] args){


        // Map= key value pair
        // key value can be it their own data types

       Map<String, Integer> numbers=new HashMap<>();
       numbers.put("one",1);
       numbers.put("Two",2);
       numbers.put("Three",3); // keys should always be unique

       System.out.println(numbers);

//       numbers.put("one",12); // this will over ride the previous value
//        System.out.println(numbers);

        //if you dont want to overide the exixiting key value then use like this


        if(numbers.containsKey("One")){
            numbers.put("one",12); // now this will not execute bec the key two is already present so it will wont ovrride
            System.out.println(numbers);
        }

        System.out.println("After : "+numbers);


        numbers.putIfAbsent("Three",23); // it will not override : we can use put or putifabsent it have some difference
        System.out.println(numbers);


        // to iterate

        for(Map.Entry<String , Integer> e: numbers.entrySet()){

            // System.out.println(e.getKey());
//            System.out.println(e.getValue());

            System.out.println(e); // or

        }

        // contains value
        System.out.println(numbers.containsValue(3)); // returns true
        System.out.println(numbers.isEmpty()); // returns false becuase it contains elements


     // if i want to print only keys then :

        for(String key:numbers.keySet()){
            System.out.println(key);
        }

     // if i want to print values then :

        for(Integer value:numbers.values()){

            System.out.println(value);

        }

        }

    }

