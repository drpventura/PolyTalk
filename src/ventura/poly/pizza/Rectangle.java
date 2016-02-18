package ventura.poly.pizza;

public class Rectangle implements Shape {
	private double _width;
	private double _height;
	
	public Rectangle(double width, double height) {
		_width = width;
		_height = height;
	}

	@Override
	public double getArea() {
		return _width * _height;
	}
	
	@Override
	public String toString() {
		return "Rectangle: " + _width + "x" + _height;
	}
}
