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

}
