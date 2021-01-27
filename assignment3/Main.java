package assignment3;
//thanks to henry and lyle for helping me on this assignment
public class Main{
    public static void main(String[] args){
        Grid grid = new Grid(4, 4, 3);
        System.out.println(grid);
        Mouse mouse = new Mouse("Chuck", 0, 0);
        mouse.update(grid);
    }
}