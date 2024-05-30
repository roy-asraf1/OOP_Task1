package lambda.FirstLambda;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {

	public static void main(String[] args) {

		List<Double> numbersD = Arrays.asList(6., 15., 14., 3., 12., 9.);
		Comparator<Double> comp = (Double a, Double b) -> a.compareTo(b);
		Collections.sort(numbersD, comp);
		numbersD.forEach(x->System.out.print(x+", "));

		List<Integer> numbers = Arrays.asList(6, 5, 4, 3, 2, 9);
		Collections.sort(numbers, (Integer a, Integer b)-> a - b); 
		numbers.forEach(n -> System.out.print(n+", "));
		System.out.println();

		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		names.forEach(s -> System.out.print(s+", ")); 
		System.out.println();

		//sort by points
		List<Point> points = Arrays.asList(new Point(3,4),new Point(1,2),new Point(2,5));
		//Collections.sort(points);
		//Anonim
		Collections.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				double d = p1.dist0() - p2.dist0();
				if (d > 0) return 1;
				if (d < 0) return -1;
				return 0;
			}
		});
		System.out.println();
		//Lambda
		points.forEach(x->System.out.print(x+", "));

		List<Point> pointsLam = Arrays.asList(new Point(3,4),new Point(1,2),new Point(1,1));
		Comparator<Point> compLam = (Point p1, Point p2) -> {				
			double d = p1.dist0() - p2.dist0();
			if (d > 0) return 1;
			if (d < 0) return -1;
			return 0;
		};
		Collections.sort(pointsLam, compLam);
		System.out.println();
		pointsLam.forEach(x->System.out.print(x+", "));
	}
}
