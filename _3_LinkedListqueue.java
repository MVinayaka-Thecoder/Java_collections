package _1JavaCollectionsFramework;

// in list we  have linked list and also queue is done using array;ist or linked list lets do it linked list to solve queue and undersdtand linkedlist
// queue is an interface can b implemented by array list , linked list and priroty queue

import java.util.LinkedList;
import java.util.Queue;

public class _3_LinkedListqueue {

    public static void main(String[] args){

        // Using linked list we implement queue

        Queue<Integer> queue=new LinkedList<>();

        queue.offer(12); // to add number
        queue.offer(24);
        queue.offer(36);

        System.out.println("Original Queue : "+queue);


        System.out.println(queue.poll()); // to remove the first element because its queue
        System.out.println("After removing element : "+queue);


        queue.offer(59);
        System.out.println(queue);

        System.out.println("Peek : "+queue.peek()); // next element to remove(Pop)

    }






}
