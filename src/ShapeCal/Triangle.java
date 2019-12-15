package ShapeCal;

public class Triangle implements Shape {
	private double base;
	private double height;
	private double sideA;
	private double sideB;
	
	public Triangle(double b, double h, double sa, double sb) {
		this.base = b;
		this.height= h;
		this.sideA = sa;
		this.sideB = sb;
	}
	
	
	public double getArea() {
		return (base * height) / 2;
	}
	public double getPrimeter() {
		return sideA + sideB + base;
	}
}
