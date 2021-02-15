package assignment5;

public class Main {
    public static void main(String[] args){
        MyHashSet set = new MyHashSet(5);
        System.out.println(set);
        set.add(5);
        System.out.println(set);
        set.hash(5);
    }
}
