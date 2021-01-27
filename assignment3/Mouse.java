package assignment3;

import java.util.*;

class Mouse{
    public String name;
    public int xCoordinate;
    public int yCoordinate;
    public Grid grid = new Grid(3, 3, 1);
    public Deque<ArrayList<Integer>> coordinateHistoryStack = new ArrayDeque<ArrayList<Integer>>();
    public Mouse(){
        name = "Chuck";
        xCoordinate = 0;
        yCoordinate = 0;
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(xCoordinate);
        a1.add(yCoordinate);
        coordinateHistoryStack.push(a1);
    }
    public Mouse(String n, int x, int y){
        name = n;
        xCoordinate = x;
        yCoordinate = y;
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(xCoordinate);
        a2.add(yCoordinate);
        coordinateHistoryStack.push(a2);
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
        grid.grid.get(yCoordinate).set(xCoordinate, 2);
        yCoordinate--;
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(xCoordinate);
        a3.add(yCoordinate);
        coordinateHistoryStack.push(a3);
    }
    public void moveDown(){
        yCoordinate++;
        ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(xCoordinate);
        a4.add(yCoordinate);
        coordinateHistoryStack.push(a4);
    }
    public void moveRight(){
        grid.grid.get(yCoordinate).set(xCoordinate, 2);
        xCoordinate++;
        grid.grid.get(yCoordinate).set(xCoordinate, 3);
        ArrayList<Integer> a5 = new ArrayList<Integer>();
        a5.add(xCoordinate);
        a5.add(yCoordinate);
        coordinateHistoryStack.push(a5);
    }
    public void moveLeft(){
        xCoordinate--;
        ArrayList<Integer> a6 = new ArrayList<Integer>();
        a6.add(xCoordinate);
        a6.add(yCoordinate);
        coordinateHistoryStack.push(a6);
    }
    public void moveUpRight(){ //all of these need more stuff (otherwise the stack will break)
        xCoordinate++;
        yCoordinate--;
        ArrayList<Integer> a7 = new ArrayList<Integer>();
        a7.add(xCoordinate);
        a7.add(yCoordinate);
        coordinateHistoryStack.push(a7);
    }
    public void moveDownRight(){
        xCoordinate++;
        yCoordinate++;
        ArrayList<Integer> a8 = new ArrayList<Integer>();
        a8.add(xCoordinate);
        a8.add(yCoordinate);
        coordinateHistoryStack.push(a8);
    }
    public void moveUpLeft(){
        xCoordinate--;
        yCoordinate--;
        ArrayList<Integer> a9 = new ArrayList<Integer>();
        a9.add(xCoordinate);
        a9.add(yCoordinate);
        coordinateHistoryStack.push(a9);
    }
    public void moveDownLeft(){
        xCoordinate--;
        yCoordinate++;
        ArrayList<Integer> a0 = new ArrayList<Integer>();
        a0.add(xCoordinate);
        a0.add(yCoordinate);
        coordinateHistoryStack.push(a0);
    }
    public void scan(){
        if(yCoordinate == 0 && xCoordinate == 0){
            if(this.grid.grid.get(yCoordinate).get(xCoordinate + 1) == 0){
                moveRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate + 1) == 0){
                moveDownRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate) == 0){
                moveDown();
            } else {
                moveBack();
            }
        } else if (yCoordinate == 0){
            if(this.grid.grid.get(yCoordinate).get(xCoordinate + 1) == 0){
                moveRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate + 1) == 0){
                moveDownRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate) == 0){
                moveDown();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate - 1) == 0){
                moveDownLeft();
            } else if (this.grid.grid.get(yCoordinate).get(xCoordinate - 1) == 0){
                moveLeft();
            } else {
                moveBack();
            }
        } else if(xCoordinate == 0){ // cant move downLeft left or upLeft
            //completed: right, downright, down
            //add: up, upright, 
            if(this.grid.grid.get(yCoordinate - 1).get(xCoordinate + 1) == 0){
                moveUpRight();
            } else if (this.grid.grid.get(yCoordinate).get(xCoordinate + 1) == 0){
                moveRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate + 1) == 0){
                moveDownRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate) == 0){ //remove this, change to up
                moveDown();
            } else if (this.grid.grid.get(yCoordinate - 1).get(xCoordinate) == 0){ 
                moveUp();
            } else {
                moveBack();
            }
        } else if (yCoordinate == grid.yDimension && xCoordinate == grid.xDimension){ //cant move down or right
            if(this.grid.grid.get(yCoordinate).get(xCoordinate - 1) == 0){
                moveLeft();
            } else if (this.grid.grid.get(yCoordinate - 1).get(xCoordinate - 1) == 0){
                moveUpLeft();
            } else if (this.grid.grid.get(yCoordinate - 1).get(xCoordinate) == 0){
                moveUp();
            } else {
                moveBack();
            }
        } else if (yCoordinate == grid.yDimension){ //cannot move down
            if(this.grid.grid.get(yCoordinate - 1).get(xCoordinate + 1)== 0){
                moveUpRight();
            } else if (this.grid.grid.get(yCoordinate).get(xCoordinate + 1) == 0){
                moveRight();
            } else if (this.grid.grid.get(yCoordinate).get(xCoordinate - 1) == 0){
                moveLeft();
            } else if (this.grid.grid.get(yCoordinate - 1).get(xCoordinate - 1) == 0){
                moveUpLeft();
            } else {
                moveBack();
            }
        } else if(xCoordinate == grid.xDimension){ //cant move right
            if(this.grid.grid.get(yCoordinate + 1).get(xCoordinate) == 0){
                moveDown();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate - 1) == 0){
                moveDownLeft();
            } else if (this.grid.grid.get(yCoordinate).get(xCoordinate - 1) == 0){
                moveLeft();
            } else if (this.grid.grid.get(yCoordinate - 1).get(xCoordinate - 1) == 0){
                moveUpLeft();
            } else if (this.grid.grid.get(yCoordinate - 1).get(xCoordinate) == 0){
                moveUp();
            } else {
                moveBack();
            }
        } else {
            if(this.grid.grid.get(yCoordinate - 1).get(xCoordinate + 1) == 0){
                moveUpRight();
            } else if (this.grid.grid.get(yCoordinate).get(xCoordinate + 1) == 0){
                moveRight();
            } else if (this.grid.grid.get(yCoordinate + 1).get(xCoordinate + 1) == 0){
                moveDownRight();
            } else if(this.grid.grid.get(yCoordinate + 1).get(xCoordinate) == 0){
                moveDown();
            } else if(this.grid.grid.get(yCoordinate + 1).get(xCoordinate - 1) == 0){
                moveDownLeft();
            } else if(this.grid.grid.get(yCoordinate).get(xCoordinate - 1) == 0){
                moveLeft();
            } else if(this.grid.grid.get(yCoordinate - 1).get(xCoordinate - 1) == 0){
                moveUpLeft();
            } else if(this.grid.grid.get(yCoordinate - 1).get(xCoordinate) == 0){
                moveUp();
            } else {
                moveBack();
            }
        }
    }
    public void moveBack(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp = coordinateHistoryStack.pop();
    }
    public ArrayList<Integer> getLocation(){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.set(0, xCoordinate);
        l.set(1, yCoordinate);
        return l;
    }
}
