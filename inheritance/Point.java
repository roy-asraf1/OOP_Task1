package inheritance;
public class Point extends Shape{
	protected double x,y; 
	public Point (double x1, double y1, String color){
		super(color);
		x = x1;
		y = y1;
		num++;
	}
	public Point (){
		super();
		x = 0;
		y = 0;
		num++;
	}
	public Point (Point p){
		this(p.x, p.y, p.color);
		num++;
	}
	// ********** public methods *********
	public double x() {return x;}	
	public double y() {return y;}
	public double distance() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	@Override
	public String toString(){return "("+x+","+y+")"+" color: "+color;}
	@Override
	public double area() {
		return 0;
	}
	@Override
	public double weight() {
		return 0;
	}
	@Override
	public double volume() {
		return 0;
	}
}
