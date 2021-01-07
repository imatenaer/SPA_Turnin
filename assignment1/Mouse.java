import java.util.*;

class Mouse{
    public String name;
    public int xCoordinate;
    public int yCoordinate;
    public ArrayList<ArrayList<Integer>> coordinateHistoryStack = new ArrayList<ArrayList<Integer>>();
    public Mouse(){
        name = "Chuck";
        xCoordinate = 0;
        yCoordinate = 0;
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(xCoordinate);
        a1.add(yCoordinate);
        coordinateHistoryStack.add(a1);
    }
    public Mouse(String n, int x, int y){
        name = n;
        xCoordinate = x;
        yCoordinate = y;
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(xCoordinate);
        a2.add(yCoordinate);
        coordinateHistoryStack.add(a2);
    }
    public String getMouseName(){
        return name;
    }
    public int getXCoordinate(){
        return xCoordinate;
    }
    public int getYCoordinate(){
        return yCoordinate;
    }
    public void printInformation(){
        System.out.println("Name: " + name + "\nCurrent Location: (" + xCoordinate + ", " + yCoordinate + ")\n History: " + coordinateHistoryStack.toString());
    }
    public void moveUp(){
        yCoordinate++;
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(xCoordinate);
        a3.add(yCoordinate);
        coordinateHistoryStack.add(a3);
    }
    public void moveDown(){
        yCoordinate--;
        ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(xCoordinate);
        a4.add(yCoordinate);
        coordinateHistoryStack.add(a4);
    }
    public void moveRight(){
        xCoordinate++;
        ArrayList<Integer> a5 = new ArrayList<Integer>();
        a5.add(xCoordinate);
        a5.add(yCoordinate);
        coordinateHistoryStack.add(a5);
    }
    public void moveLeft(){
        xCoordinate--;
        ArrayList<Integer> a6 = new ArrayList<Integer>();
        a6.add(xCoordinate);
        a6.add(yCoordinate);
        coordinateHistoryStack.add(a6);
    }
}
