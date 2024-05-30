package testException;

import java.util.ArrayList;

public class MyClass {

	public static void fun1() throws  IndexOutOfBoundsException{
		ArrayList<Integer> list = new ArrayList<>();
		int x = list.get(0);
	}
	public static void fun2(String s) throws  NullPointerException{
		String t = "hello";
		StringBuffer sb=null;
		sb.append(t);
	}
	
	public static void main(String[] args) {
		String t = null;
		try {
			fun2(t);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		fun3();
	}

}
