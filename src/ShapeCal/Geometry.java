package ShapeCal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;


public class Geometry {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");   
		
		
		Shape c1 = new Circle(5);
		Shape c2 = new Circle(3);
		
		Shape q1 = new Quadrilateral(4, 5);
		Shape q2 = new Quadrilateral(11, 5);
		
		Shape t1 = new Triangle(8, 3, 5, 5);
		Shape t2 = new Triangle(4, 6, 7, 9);
		
		List<Shape> Shapes = Arrays.asList(c1,c2,q1,q2,t1,t2);
		
		double globalArea = 0;
		double globalPrimeter = 0;
		
		for (Shape Shape : Shapes) {
			globalArea += Shape.getArea();
			globalPrimeter += Shape.getPrimeter();
			System.out.println(globalArea);
			System.out.println(globalPrimeter);
		}
		
		

	}
	
}
