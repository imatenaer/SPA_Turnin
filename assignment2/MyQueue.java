package assignment2;

import java.util.*;

public class MyQueue{
    ArrayList<Integer> myQ;
    public static void main(String args[]){

    }
    public void queue(int a){
        this.myQ.add(a);
    }
    public int dequeue(int b){
        int start = this.myQ.get(0);
        this.myQ.remove(0);
        return start;
    }
}