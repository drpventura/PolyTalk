package ventura.poly.pizza;

public class Rectangle implements IShape {
	private double _width;
	private double _height;
	
	public Rectangle(double width, double height) {
		_width = width;
		_height = height;
	}

	@Override
	public double area() {
		return _width * _height;
	}
}
