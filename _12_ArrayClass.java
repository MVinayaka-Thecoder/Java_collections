package _1JavaCollectionsFramework;

import java.util.Arrays;

public class _12_ArrayClass {
    public static void main(String[] args) {


        // Array class works on primitive arrays

        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        int index=Arrays.binarySearch(numbers,8); // this should return index value of 8 which is 7
        System.out.println("The index of the element 8 is : "+index);



        // we can also sort

        int [] nums1={5,3,5,2,6,7,8};
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
}
