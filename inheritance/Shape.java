package inheritance;

public abstract class Shape{
	public static int num;
	static {
		num=0;
	}
	protected String color;
	public Shape(){
		this.color = "black";
	}
	public Shape( String color){
		this.color = color;
	}
	public String getColor( ) {
		return this.color;
	}
	public String toString( ) {
		return "color: "+color;
	}
	public abstract double area();
	public abstract double volume();
	public abstract double weight();
	
}
