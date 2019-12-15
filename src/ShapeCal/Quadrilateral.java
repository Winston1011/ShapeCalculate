package ShapeCal;

public class Quadrilateral implements Shape{
	private double height;
	private double width;
	
	public Quadrilateral(double h, double w) {
		this.height = h;
		this.width = w;
	}
	
	public double getArea() {
		// TODO Auto-generated method stub
		return height * width;
	}
	public double getPrimeter() {
		// TODO Auto-generated method stub
		return (height + width) * 2;
	}
}
