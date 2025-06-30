package _1JavaCollectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//public class _5_priorityQueue {
//
//    public static void main(String[] args){
//
//
//        Queue<Integer> pq=new PriorityQueue<>();
//
//        pq.offer(49);
//        pq.offer(12);
//        pq.offer(24);
//        pq.offer(35);
//        System.out.println(pq); // inner it will implement minHeap so you will get 12,35,24,49
//
//
//        pq.poll(); // removes the smallest
//        System.out.println(pq);
//
//        System.out.println(pq.peek());
//
//// Till now we use to pop the smallest / min heap element right but now we use maxHeap
//
//
//
//    }
//}





// Method 2: // Till now we use to pop the smallest / min heap element right but now we use maxHeap


public class _5_priorityQueue {

    public static void main(String[] args){


        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(49);
        pq.offer(12);
        pq.offer(24);
        pq.offer(35);
        System.out.println(pq); // inner it will implement minHeap so you will get 49,35,24,12


        pq.poll(); // removes the smallest
        System.out.println(pq);

        System.out.println(pq.peek());

// Till now we use to pop the smallest / min heap element right but now we use maxHeap



    }
}
