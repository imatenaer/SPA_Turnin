package assignment2;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class DumbQueue {
    MyStack s = new MyStack();
    Random rand = new Random();

    public DumbQueue(){
    }

    public void queue(){
        this.s.push(rand.nextInt(10));
    }
    public void dequeue(){
        ArrayList<Integer> storage = new ArrayList<>();
        //create storage, take each element out, then put it back in
        for(int i = this.s.myStack.size() - 1; i > 1; i--){
            storage.add(this.s.myStack.get(i));
            this.s.pop();
        }
        s.myStack.remove(0);
        for(int i = storage.size() - 1; i >= 0; i--){
            this.s.myStack.add(storage.get(i));
        }
    }
    public String toString(){
        return this.s.myStack.toString();
    }
    public void sort(){
        Collections.sort(this.s.myStack);
    }
}
