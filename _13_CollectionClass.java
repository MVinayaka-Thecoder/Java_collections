package _1JavaCollectionsFramework;

import java.util.*;

public class _13_CollectionClass {
    public static void main(String[] args) {


        List<Integer> ls=new ArrayList<>();
        ls.add(4);
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(6);
        ls.add(5);

        System.out.println(ls);


        System.out.println("Min Element : "+ Collections.min(ls));
        System.out.println("Max Element : "+Collections.max(ls));


        System.out.println("Frequency : "+ Collections.frequency(ls,5)); // tell how many times 5 repeated

        Collections.sort(ls);
        System.out.println("Ascending order sort : "+ls);

        Collections.sort(ls, Comparator.reverseOrder());
        System.out.println("Descending order sort : "+ls);



    }
}
