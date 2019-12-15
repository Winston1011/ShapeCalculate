package ShapeCal;

public class Circle implements Shape{
	
	private static final double PI = 3.14159;
	private double radius;

	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	public double getPrimeter() {
		return 2 * PI * radius;
	}



}

