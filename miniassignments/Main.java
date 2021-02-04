package miniassignments;
import java.util.*;


class Main{
    public static void main(String[] args){
        String input = "hello 90, where is 2";
        System.out.println("New string: " + getInts(input, 9));;
        //create method where you input string with numbers in it
        // add int to string
        //input: "hello 90, where is 2"
        //if n = 9, output = hello 99 where is 11

        //create method where you turn int into string
        // h3ll0 -> hthreellzero
    }
    public static String getInts(String input, int add){
        char[] inputArray = input.toCharArray();
        input = "";

        for(int i = 0; i < inputArray.length; i++){
            if(Character.isDigit(inputArray[i])){
                int x = Character.getNumericValue(inputArray[i]);
                input += x;
            } else if (i > 0){
                if(Character.isDigit(inputArray[i-1])){
                    int x = Character.getNumericValue(inputArray[i - 1])* 10 + Character.getNumericValue(inputArray[i]);
                    input += x;
                }
            } else {
                input += inputArray[i];
            }
        }
        return input;
    }
}