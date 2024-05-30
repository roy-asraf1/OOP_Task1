package classDemo;
import java.lang.reflect.Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		try {
			// returns the Class object for the class with the specified name
			//Class<?> cls = Class.forName("java.lang.String");
			Class<?> cls = Class.forName("classDemo.Interval");

			System.out.println("is interface? "+cls.isInterface());
			System.out.println("is local class? "+cls.isLocalClass());
			System.out.println("is anonymous class? "+cls.isAnonymousClass());
			System.out.println();
			System.out.println("to String: "+cls.toString());
			// returns the super class, name and package of the class
			System.out.println("super class: "+cls.getSuperclass());
			System.out.println("Class found = " + cls.getName());
			System.out.println("Package = " + cls.getPackage());

			Field[] fields = cls.getDeclaredFields(); 
			System.out.println("\nthe names of the declared fields");
			for (int i = 0; i < fields.length; i++) {
				String fieldName = fields[i].getName();
				Type type = fields[i].getGenericType();
				String fieldType = fields[i].getGenericType().toString();
				int mode = fields[i].getModifiers();
				String fieldMode = Modifier.toString(mode);
				System.out.println("name: "+fieldName+", tipe: "+fieldType+
						", modifier: = "+fieldMode);
			}
			System.out.println("\nnames of the constructors");
			Constructor<?> constructors[] = cls.getConstructors();
			for (int i = 0; i < constructors.length; i++) {
				System.out.println( constructors[i].getName()+",  " + constructors[i]);
			}
			// getMethods() returns all the public methods of the class.
			Method methods[] = cls.getMethods();
			System.out.println("\nName of the Methods");
			for (int i = 0; i < methods.length; i++) {
				String name = methods[i].getName();
				String type = methods[i].getGenericReturnType().toString();
				System.out.println(name + ", " + type);
			}

			////// modify private field
			Interval interval = new Interval(1,2);
			System.out.println(interval);
			fields[1].setAccessible(true);
			fields[1].setDouble(interval, 9999); 
			System.out.println(interval); 

			//get the class field by name
			Field f = cls.getDeclaredField("right");
			f.setAccessible(true);
			f.setDouble(interval, 88.88);
			System.out.println(interval); 

			//get the class field by name
			System.out.println("num = "+Interval.getNum());
			Field fnum = cls.getDeclaredField("num");
			fnum.setAccessible(true);
			fnum.setInt(null, -10);
			System.out.println(interval); 
			System.out.println("num = "+Interval.getNum());
		} catch(ClassNotFoundException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException ex) {
			System.out.println(ex.toString());
			ex.printStackTrace();
		}

	}
}
