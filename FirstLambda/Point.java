package lambda.FirstLambda;
public class Point implements Comparable<Point>{
	public double _x, _y;
	
	public Point (double x1, double y1){
		_x = x1;
		_y = y1;
	}
	public Point (Point p){
		this(p.x(), p.y());		
	}
	public double x() {return _x;}
	public double y() {return _y;}

	public String toString() {
		return " [" + _x + "," + _y+"]";
	}
	@Override
	public boolean equals(Object o){
		if (o instanceof Point){
			Point p = (Point)o;
			return p._x==_x && p._y==_y;
		}
		return false;
	}
	public double dist0(){
		return Math.sqrt(_x*_x + _y*_y);
	}
	@Override
	public int compareTo(Point p) {
		int ans = 0;
		double d = this.dist0(), pd = p.dist0();
		if (d < pd) ans = -1;
		else if (d > pd) ans = 1;
		return ans;
	}
	public static void main(String[] args) {
	}
}
