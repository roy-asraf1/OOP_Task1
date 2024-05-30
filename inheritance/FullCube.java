package inheritance;

public class FullCube extends Cube{
	private double density;
	public  FullCube(){
		super();
		density = 1;// the density of water
	}
public  FullCube(double edge, double density, String color){
	super(edge, color);
	this.density = density;
}
@Override
public double weight() {
	return this.volume()*density;
}
public String toString( ) {
	return super.toString() + ", density = "+density;
}

public static void main(String[] args) {
	FullCube c = new FullCube(2,10, "red");
	System.out.println(c);
	System.out.println(c.area());
	System.out.println(c.volume());
	System.out.println(c.weight());
	FullCube c1 = new FullCube();
	System.out.println(c1);
	}

}
