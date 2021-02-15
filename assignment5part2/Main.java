package assignment5part2;
import java.util.*;


public class Main {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        int i = 100000000;
        arrayList(i);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime)/1000000;
        System.out.println(duration + "ms");
    }
    public static void hash(int bounds){
        Random rand = new Random();
        int searchfor = rand.nextInt(100000);
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < bounds; i++){
            hash.add(rand.nextInt(100000));
        }
        boolean contains = hash.contains(searchfor);
    }
    public static void tree(int bounds){
        Random rand = new Random();
        int searchfor = rand.nextInt(100000);
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i = 0; i < bounds; i++){
            tree.add(rand.nextInt(100000));
        }
        boolean contains = tree.contains(searchfor);
    }
    public static void arrayList(int bounds){
        Random rand = new Random();
        int searchfor = rand.nextInt(100000);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < bounds; i++){
            arrayList.add(rand.nextInt(100000));
        }
        boolean contains = arrayList.contains(searchfor);
    }
    public static void linkedList(int bounds){
        Random rand = new Random();
        int searchfor = rand.nextInt(100000);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < bounds; i++){
            linkedList.add(rand.nextInt(100000));
        }
        boolean contains = linkedList.contains(searchfor);
    }

}

