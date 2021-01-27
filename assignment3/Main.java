package assignment3;
import java.util.*;
class Main{
    public static void main(String[] args){
        Mouse mouse = new Mouse();
        while(mouse.coordinateHistoryStack != null){
            mouse.scan();
        }
    }
}