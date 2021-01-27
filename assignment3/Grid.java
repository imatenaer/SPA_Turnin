package assignment3;
import java.util.*;
//90% of code from google classroom
public class Grid {
	
	ArrayList<ArrayList<Integer>> grid;
	int xDimension;
	int yDimension;
    int numberOfWalls;
	
	public Grid(int xDimension, int yDimension, int numberOfWalls) {
		
		
		this.xDimension = xDimension;
		this.yDimension = yDimension;
		this.numberOfWalls = numberOfWalls;
		this.grid = populateGrid();

        grid.get(0).set(0, 3);
    }
    public Grid(ArrayList<ArrayList<Integer>> cGrid){
        this.grid = cGrid;
    }
	
	private ArrayList<ArrayList<Integer>> populateGrid() {	
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < this.yDimension; i++) {
			ArrayList<Integer> zeros = new ArrayList<Integer>(Collections.nCopies(this.xDimension, 0));
			
			
			Random rand = new Random(); 
			
			int change = rand.nextInt(zeros.size());
			zeros.set(change, 1);
			
			g.add(zeros);
			
		}
		return g;
		

	}
    public String toString(){
        String gridString = "";
        for(int i = 0; i < xDimension; i++){
            for(int i2 = 0; i2 < yDimension; i2++){
                gridString = gridString + "[" + grid.get(i).get(i2) + "] ";
            }
            gridString = gridString + "\n"; 
        }

        return gridString;
	}
	public void changeSpot(int x, int y, Mouse m){
		m.setX(x);
		m.setY(y);
	}
	public int getXSize(){
		return xDimension;
	}
	public int getYSize(){
		return yDimension;
	}
	public ArrayList<ArrayList<Integer>> getGrid(){
		return grid;
	}
}