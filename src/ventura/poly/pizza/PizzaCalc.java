package ventura.poly.pizza;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaCalc {
	private Pizza _pizza1;
	private Pizza _pizza2;
	
	public PizzaCalc(Pizza p1, Pizza p2) {
		_pizza1 = p1;
		_pizza2 = p2;
	}
	
	public void whichIsBetter() {
		if (_pizza1.pricePerSqInch() < _pizza2.pricePerSqInch()) {
			System.out.println("Pizza 1 is the better deal");
		}
		else if (_pizza2.pricePerSqInch() < _pizza1.pricePerSqInch()) {
			System.out.println("Pizza 2 is the better deal");
		}
		else {
			System.out.println("Same value.");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("First pizza shape: ");
		String shapeName = stdin.next();
		Class clazz = Util.findShapeClass(shapeName);
		System.out.println(clazz);
		Util.findDoubleConstructor(clazz)
			.ifPresent(constr -> System.out.println(Arrays.asList(Util.getParameterNames(constr))));

	}

}
