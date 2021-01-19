package assignment2;

import java.util.Random;
import java.util.ArrayList;

public class DumbQueue {
    MyStack s;
    Random rand = new Random();

    public void queue(){
        this.s.push(rand.nextInt(10));
    }
    public int dequeue(){
        ArrayList<Integer> storage = new ArrayList<>();
        //create storage, take each element out, then put it back in
        for(int i = s.myStack.size(); i > 1; i--){
            storage.add(s.myStack.get(i));
            s.myStack.remove(i);
        }
        int remove = s.myStack.get(0);
        s.myStack.remove(0);
        return remove;
    }
}
