package _1JavaCollectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class _4_LinkedList {
    public static void main(String[] args){

        List<Integer> ls=new LinkedList<>();

        ls.add(12);
        ls.add(24);
        ls.add(36);

        System.out.println(ls);

        ls.remove(2);
        System.out.println(ls);




    }
}
