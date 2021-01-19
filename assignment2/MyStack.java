package assignment2;

import java.util.*;

public class MyStack {
    ArrayList<Integer> myStack;

    public MyStack(ArrayList<Integer> myStack){
        this.myStack = myStack;
    }
    //add to the end of a stack o(1)
    public void push(Integer k){
        this.myStack.add(k);
    }
    //take first(last element in list) element out FiLo (first in last out) and return it

    public int pop(){
        //get last item
        int last = this.myStack.get(this.myStack.size() - 1);
        //remove it
        this.myStack.remove(this.myStack.size() - 1);
        //return it
        return last;
    }

}
