package inheritance;

public class Cube extends Shape{
	double edge;
	public Cube(){
		this.edge = 1;
	}
	public Cube(double edge, String color){
		super(color);
		this.edge = edge;
	}	
	@Override
	public double area() {
		return 6*edge*edge;
	}

	@Override
	public double volume() {
		return edge*edge*edge;
	}

	@Override
	public double weight() {
		return 0;
	}
	public String toString( ) {
		return super.toString() + ", edge = "+edge;
	}

	public static void main(String[] args) {
		Cube c = new Cube();
		System.out.println(c);

	}

}
