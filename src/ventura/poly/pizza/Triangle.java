package ventura.poly.pizza;

public class Triangle implements Shape {

	private double _height;
	private double _base;
	
	public Triangle(double height, double base) {
		_height = height;
		_base = base;
	}

	@Override
	public double getArea() {
		return _base * _height / 2.0;
	}

}
