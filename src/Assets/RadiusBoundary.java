package Assets;

public class RadiusBoundary extends Boundary{

	@Override
	protected void calculateBoundary(int x, int y) {
		// TODO Auto-generated method stub
		//parameter functions splitting circle formula in 2 ?
		int radius = 10;
		bound = Math.sqrt(radius - Math.pow(x, 2));
		lowerbound = Math.sqrt(radius - Math.pow((x - 2), 2));
		upperbound = Math.sqrt(radius - Math.pow((x + 2), 2));;
	}

}
