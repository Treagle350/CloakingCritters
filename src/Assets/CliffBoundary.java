package Assets;

public class CliffBoundary extends Boundary{
	
	@Override
	protected void calculateBoundary(int x, int y) {
		// TODO Auto-generated method stub
		bound = ((-0.0025)*(Math.pow(x-140, 2)))-25;
		lowerbound = ((-0.0025)*(Math.pow((x - 2)-140, 2)))-25;
		upperbound = ((-0.0025)*(Math.pow((x + 2)-140, 2)))-25;
	}
}
