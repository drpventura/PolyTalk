package ventura.poly.pizza;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class PizzaCalc {
	private Pizza _pizza1;
	private Pizza _pizza2;
	
	public PizzaCalc(Pizza p1, Pizza p2) {
		_pizza1 = p1;
		_pizza2 = p2;
	}
	
//	public Pizza bestDeal() {
//		
//	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter shape class: ");
		String shapeName = stdin.next();
		
		Class clazz = Class.forName("ventura.poly.pizza." + shapeName);
		System.out.println(clazz);
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor con : constructors) {
			System.out.println(con);
		}
	}

}
