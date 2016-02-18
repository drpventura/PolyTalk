package ventura.poly.pizza;

public class Circle implements Shape {
	private double _radius;
	
	public Circle(double diameter) {
		_radius = diameter / 2;
	}
	
	@Override
	public double getArea() {
		return Math.PI * _radius * _radius;
	}
	
	@Override
	public String toString() {
		return "Circle: diameter " + 2 * _radius;
	}

}
