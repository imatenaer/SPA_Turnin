package assignment3;

import java.util.*;


public class Mouse {
    private String name;
    private int xCoordinate;
    private int yCoordinate;
    private ArrayList<ArrayList<Integer>> coordinateHistoryStack;
    private MyStack stack;

    public Mouse(String iName, int iXCoord, int iYCoord){
        coordinateHistoryStack = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> coords = new ArrayList<Integer>();
        stack = new MyStack();
        name = iName;
        xCoordinate = iXCoord;
        yCoordinate = iYCoord;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }

    public String toString(){
        String info = name + ": (" + xCoordinate + ", " + yCoordinate + "), history: " + coordinateHistoryStack + "\n";

        return info;
    }

    public void update(Grid grid){
        grid.getGrid().get(xCoordinate).set(yCoordinate, 2);
        scan(grid);
        while(stack.arrayStack.size() > 0){
            changeCell(grid);
            scan(grid);
            updatePOS(grid);
            System.out.println(grid);
            wait(700);
            clearScreen();
        }
        System.out.println(grid + "\nComplete! " + toString());
    }
    public void changeCell(Grid grid){
        grid.getGrid().get(xCoordinate).set(yCoordinate, 2);
    }
    public void updatePOS(Grid grid){
        grid.getGrid().get(xCoordinate).set(yCoordinate, 3);
    }
    public boolean scan(Grid grid){
        if(yCoordinate - 1 >= 0){
            if(grid.getGrid().get(xCoordinate).get(yCoordinate - 1) == 0){
                stack.push(currentPos());
                moveUp();
                return true;
            }
            else if(xCoordinate + 1 < grid.getXSize()){
                if(grid.getGrid().get(xCoordinate + 1).get(yCoordinate - 1) == 0){
                    stack.push(currentPos());
                    moveNE();
                    return true;
                }
            }
        }
        if(xCoordinate + 1 < grid.getXSize()){
            if(grid.getGrid().get(xCoordinate + 1).get(yCoordinate) == 0){
                stack.push(currentPos());
                moveRight();
                return true;
            }
            else if(yCoordinate + 1 < grid.getYSize()){
                if(grid.getGrid().get(xCoordinate + 1).get(yCoordinate + 1) == 0){
                    stack.push(currentPos());
                    moveSE();
                    return true;
                }
            }
        }
        if(yCoordinate + 1 < grid.getYSize()){
            if(grid.getGrid().get(xCoordinate).get(yCoordinate + 1) == 0){
                stack.push(currentPos());
                moveDown();
                return true;
            }
            else if (xCoordinate - 1 >= 0){
                if(grid.getGrid().get(xCoordinate - 1).get(yCoordinate + 1) == 0){
                    stack.push(currentPos());
                    moveSW();
                    return true;
                }
            }
        }
        if(xCoordinate - 1 >= 0){
            if(grid.getGrid().get(xCoordinate - 1).get(yCoordinate) == 0){
                stack.push(currentPos());
                moveLeft();
                return true;
            }
            else if (yCoordinate - 1 >= 0){
                if(grid.getGrid().get(xCoordinate - 1).get(yCoordinate - 1) == 0){
                    stack.push(currentPos());
                    moveNW();
                    return true;
                }
            }
        }
        moveBack();
        return false;
    }
    public void moveBack(){
        ArrayList<Integer> lastPos = stack.pop();
        if(xCoordinate > lastPos.get(0)){
            if(yCoordinate < lastPos.get(1)){
                moveSW();
            }
            else if (yCoordinate == lastPos.get(1)){
                moveLeft();
            }
            else{
                moveNW();
            }
        }
        else if(xCoordinate < lastPos.get(0)){
            if(yCoordinate < lastPos.get(1)){
                moveSE();
            }
            else if (yCoordinate == lastPos.get(1)){
                moveRight();
            }
            else{
                moveNE();
            }
        }
        else{
            if(yCoordinate < lastPos.get(1)){
                moveDown();
            }
            else if (yCoordinate > lastPos.get(1)){
                moveUp();
            }
        }
    }
    public void moveUp(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        yCoordinate--;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }

    public void moveDown(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        yCoordinate++;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }
    public void moveRight(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        xCoordinate++;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }
    public void moveLeft(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        xCoordinate--;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }
    public void moveNE(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        xCoordinate++;
        yCoordinate--;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }
    public void moveSE(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        xCoordinate++;
        yCoordinate++;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }
    public void moveSW(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        xCoordinate--;
        yCoordinate++;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }
    public void moveNW(){
        ArrayList<Integer> coords = new ArrayList<Integer>();
        xCoordinate--;
        yCoordinate--;
        coords.add(xCoordinate);
        coords.add(yCoordinate);
        coordinateHistoryStack.add(coords);
    }

    public void setX(int x){
        xCoordinate = x;
    }

    public void setY(int y){
        yCoordinate = y;
    }

    public ArrayList<Integer> currentPos(){
        ArrayList<Integer> pos = new ArrayList<Integer>();
        pos.add(xCoordinate);
        pos.add(yCoordinate);

        return pos;
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void wait(int ms){
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
}
}