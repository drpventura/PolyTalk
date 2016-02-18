package ventura.poly.pizza;

public class Pizza {
	private double _price;
	private Shape _shape;
	
	public Pizza(double price, Shape shape) {
		_price = price;
		_shape = shape;
	}
	
	public double pricePerSqInch() {
		return _price / _shape.getArea();
	}
	
}
