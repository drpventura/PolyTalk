package ventura.poly.pizza;

public class Pizza {
	private double _price;
	private IShape _shape;
	
	public Pizza(double price, IShape shape) {
		_price = price;
		_shape = shape;
	}
	
	public double pricePerSqInch() {
		return _price / _shape.area();
	}
	
}
