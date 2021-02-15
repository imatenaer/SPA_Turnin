package fib;
import java.util.*;

public class Main {
    //create a list with 10 numbers
    //"loop" through each item and print n + 4
    //cant use while or for loops
    public static int sudoLoop(ArrayList<Integer> m){
        if (m.size() == 0){
            return 0;
        } else {
            int x  = m.get(0) + 4;
            System.out.println(m.get(0) + " " + x);
            m.remove(0);
            return sudoLoop(m);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            num.add(rand.nextInt(10));
        }
        System.out.println(fib(13));
    }
    public static int fib(int n){
        //returns nth fibonacci number
        //(n - 2) + (n - 1);
        //code with while loop first, then go onto recursion
        //fib(6) --> 8, treat fib like a list instead of index (1, 2, 3) instead of (0, 1, 2)
        //1, 1, 2, 3, 5, 8, 13, 21, etc.
        
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);

    }
}
