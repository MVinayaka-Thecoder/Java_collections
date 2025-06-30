package _1JavaCollectionsFramework;
// using arraydeque we can implement stack and queue.

import java.sql.SQLOutput;
import java.util.ArrayDeque;

public class _6_ArrayDeque {
    public static void main(String[] args){

        // ArrayDeque is used to add elements from the front and end / remove from front and end and we can peek from both side


        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offer(12); // offer comes from queue : this will add the element in the front automatically
        ad.offerFirst(24); // offerfirst comes from the Arraydeque and this will add element in the front
        ad.offerLast(60); // this will add element in the last
        ad.offer(1);

        System.out.println(ad);



        // peek

        System.out.println(ad.peek()); // to first element int the queue
        System.out.println(ad.peekFirst()); // to first element in the queue
        System.out.println(ad.peekLast()); // last element


        System.out.println();
        System.out.println("Poll : "+ad.poll());

        System.out.println("PollFirst : "+ad.pollFirst());

        System.out.println("Poll Last : "+ad.pollLast());

        System.out.println("Final Arraydeque : "+ad);





    }
}
