package ventura.poly.pizza;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Static utility methods that hide reflection voodoo.
 * 
 * @author Phil Ventura, Ph.D. (venturap@palmbeachstate.edu)
 *
 */
public class Util {
	/**
	 * The (String) name of the package that this code is in.
	 */
	private static final String PACKAGE_NAME = 
			Util.class.getPackage().getName();

	/**
	 * Gets the specified class (in this package). 
	 * NOTE: Will not work with classes outside the current package! 
	 * @param the name of the class (if the package name is omitted, 
	 *         it is prepended)
	 * @return the class object
	 * @throws ClassNotFoundException
	 */
	static Class<?> findShapeClass(String className) throws ClassNotFoundException {
		if (!className.startsWith(PACKAGE_NAME)) {
			className = PACKAGE_NAME + "." + className;
		}
		return Class.forName(className);
	}
	
	/**
	 * Returns true iff all of the type parameters of the constructor
	 *         are double, otherwise false.
	 * @param constr the constructor
	 * @return true iff all of the type parameters of the constructor
	 *         are double, otherwise false.
	 */
	private static boolean allDouble(Constructor<?> constr) {
		return Arrays.asList(constr.getParameterTypes()).stream()
					.map(Type::getTypeName)
					.allMatch(typeName -> "double".equals(typeName));				
	}
	
	/**
	 * Given a class object, find the constructor that takes all doubles.
	 * *NOTE*: Requires compiling with the -parameters compiler option.
	 *         In Eclipse, under Java Compiler check box that reads
	 *         /Store information about method parameters/
	 * @param clazz the class object
	 * @return an Optional of the class constructor.
	 */
	public static Optional<Constructor<?>> findDoubleConstructor(Class<?> clazz) {
		List<Constructor<?>> constrs = Arrays.asList(clazz.getConstructors());
		return constrs.stream()
					.filter(Util::allDouble)
					.findFirst();			   
	}
	
	/**
	 * Gets the names of the parameters of the given constructor.
	 * @param constr the constructor.
	 * @return the names of the parameters of the given constructor.
	 */
	public static String[] getParameterNames(Constructor<?> constr) {
		return Arrays.asList(constr.getParameters()).stream()
					.map(Parameter::getName)
					.toArray(String[]::new);
	}
	
	/**
	 * Given the name of a shape class (in this package),
	 * prompt for the constructor parameters and 
	 * create and return a new instance.
	 * @param className the name of a shape class (in this package)
	 * @return an initialized instance of the named shape class.
	 * @throws NoSuchMethodException
	 */
	static Shape makeShape(String className) throws NoSuchMethodException {
		try {
			Class<?> clazz = Util.findShapeClass(className);
			Constructor<?> constr = Util.findDoubleConstructor(clazz).orElseThrow(NoSuchMethodException::new);
			Scanner stdin = new Scanner(System.in);
			
			Object[] params = 
					Arrays.asList(Util.getParameterNames(constr)).stream()
						.map(paramName -> {
								System.out.print("Enter " + paramName + ": ");
								return stdin.nextDouble();
						})
						.toArray();
			return (Shape) constr.newInstance(params);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
		

		//		for (String paramName : Util.getParameterNames(constr)) {
//			System.out.print("Enter " + paramName + ": ");
//			
//		}
		
	}
}
