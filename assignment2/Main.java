package assignment2;

public class Main {
    public static void main(String[] args){
        DumbQueue q = new DumbQueue();

        for(int i = 0; i < 6; i++){
            q.queue();
        }
        q.sort();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
    }
}
