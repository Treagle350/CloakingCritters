package Assets;

/**
* @author Treagle350
**/

public class Boundary {

	private double bound;
	private double upperbound;
	private double lowerbound;
	
	public boolean inBoundsYup;
	public boolean inBoundsYdown;
	public boolean inBoundsXleft;
	public boolean inBoundsXright;
	
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
	
	public int[] checkBoundary(int x, int y) {
		int[] result = {0,0};
		
		bound = ((-0.0025)*(Math.pow(x-140, 2)))-25;
		lowerbound = ((-0.0025)*(Math.pow((x - 2)-140, 2)))-25;
		upperbound = ((-0.0025)*(Math.pow((x + 2)-140, 2)))-25;
		
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
