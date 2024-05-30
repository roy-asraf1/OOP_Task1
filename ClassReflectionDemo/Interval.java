package classDemo;



public class Interval {
	private static int num=0;
	private double left, right;
	public Interval(){//constructor without arguments
		this(0, 1);
	}
	public Interval(double left , double right) {//constructor
		this.left = Math.min(left, right);
		this.right= Math.max(left, right);
		 num++;
	}
	public Interval(Interval interval) {//copy constructor
		this(interval.left, interval.right);
	}
	public boolean contains(double x){
		if( x<=right && x>=left){
			return true;
		}
		return false;
	}
	public double length() {
		return right - left;
	}
	public static int getNum() {
		return num;
	}
	public String toString() {
		return "("+left+","+right+")";
	}
	public static void main(String[] args){
		System.out.println("num = "+Interval.getNum());
		Interval v=new Interval(7,100);
		double x = 20;
		System.out.println("v.contains("+x+")?  "+v.contains(x) );
		x = 220;
		System.out.println("v.contains("+x+")?  "+v.contains(x) );
		System.out.println("num = "+Interval.getNum());
		Interval w=new Interval(7,100);
		System.out.println("num = "+Interval.getNum());
		System.out.println(Double.doubleToLongBits(1));
	}
}
