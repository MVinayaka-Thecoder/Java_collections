package _1JavaCollectionsFramework;
// Stacks comes in List

import java.util.Stack;

public class _2_Stack {
    public static void main(String[] args){


        Stack<String> st=new Stack<>();
        st.add("Panda");
        st.add("Pig");
        st.add("Dog");
        st.add("Lion");

        System.out.println(st); // gives the element in the stack and it is a list so ordered maintained as inserted

        // If i want to see the top element in the stack : use peek().
        System.out.println("Returns the top element in the stack : "+st.peek());

        // if i want to remove elements we use : pop : is a method were it removes element from the top of teh stack
        // it means from the top of the stack is lion it will  removed.

        st.pop();
        System.out.println("Elements After Pop : "+st); // lion is removed
        System.out.println("Top element after pop operation is : "+st.peek());

        // If you want to add element using push

        st.push("Tiger"); // this is top now from in the stack
        System.out.println("Elements after push Operation : "+st);

        System.out.println("Top Element in the stac k : "+st.peek());




    }
}
