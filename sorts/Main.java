package sorts;

import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list.add(rand.nextInt(10));
            list1.add(rand.nextInt(10));
            list2.add(rand.nextInt(10));
        }
        System.out.println(list.toString());
        System.out.println(minTwo(list1, list2));
        System.out.println(merge(list1, list2).toString());
        System.out.println(selection(list).toString());
    }
    public static int minValue(ArrayList<Integer> list){
        int min = 2147483647;
        //if list is empty, this giant number is going to be returned
        for(int i : list){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int minTwo(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        int min = minValue(list1);
        return min;
    }
    public static ArrayList<Integer> selection(ArrayList<Integer> list){
        ArrayList<Integer> sort = new ArrayList<Integer>();
        while(list.size() != 0){
            int min = minValue(list);
            list.remove(new Integer(minValue(list)));
            sort.add(min);
        }
        return sort;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        list1 = selection(list1);
        return list1;
    }
    public static ArrayList<ArrayList<Integer>> divide(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> flist = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < list.size() / 2; i++){
            list1.add(list.get(i));
            list.remove(i);
        }
        for(int i = 0; i < list.size(); i++){
            list2.add(list.get(i));
            list.remove(i);
        }
        flist.add(list1);
        flist.add(list2);
        return flist;
    }
}
