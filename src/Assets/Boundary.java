package Assets;

/**
* @author Treagle350
**/

public abstract class Boundary {

	protected double bound;
	protected double upperbound;
	protected double lowerbound;
	
	protected boolean inBoundsYup;
	protected boolean inBoundsYdown;
	protected boolean inBoundsXleft;
	protected boolean inBoundsXright;
	
	public Boundary() {
		
	}
	private int[] shove(int x, int y) {
		int[] result = {x,y};
		if(!inBoundsYup) {
			x = x + 0;
			y = y + 2;
			result[0] = x;
			result[1] = y;
		}
		if(!inBoundsYdown) {
			x = x + 0;
			y = y - 2;
			result[0] = x;
			result[1] = y;
		}
		if(!inBoundsXleft) {
			x = x + 2;
			y = y + 0;
			result[0] = x;
			result[1] = y;
		}
		if(!inBoundsXright) {
			x = x - 2;
			y = y + 0;
			result[0] = x;
			result[1] = y;
		}
		return result;
	}
	
	protected abstract void calculateBoundary(int x, int y);
	
	public int[] checkBoundary(int x, int y) {
		int[] result = {0,0};
		
		calculateBoundary(x,y);
		
		if(y >= Math.abs(bound)) {
			inBoundsYup = true;
			inBoundsYdown = true;
			inBoundsXleft = true;
			inBoundsXright = true;
		}else {
			inBoundsYup = false;
			if(y >= Math.abs(lowerbound)) {
				inBoundsXleft = true;
			}else {
				inBoundsXleft = false;
			}
			if(y >= Math.abs(upperbound)) {
				inBoundsXright = true;
			}else {
				inBoundsXright = false;
			}
		}
		result = shove(x,y);
		return result;
	}
}
