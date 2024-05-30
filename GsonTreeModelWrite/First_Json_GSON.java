package json;

import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class First_Json_GSON {

	public static void main(String[] args) {
		System.out.println("Serialization");
		//Gson gson = new Gson();
		//Gson gson = new GsonBuilder().create();
		//Gson gson = new GsonBuilder().setLenient().create();
		Gson gson = new GsonBuilder().setLenient().setPrettyPrinting().create();
		String s1 = gson.toJson(1); 
		String s2 = gson.toJson("abcd"); 
		String s3 = gson.toJson(3.14); 
		String s4 = gson.toJson(true);
		String s5 =  gson.toJson(10L); 
		int[] values = {1, 2, 4};
		String s6 = gson.toJson(values);  
		Person person = new Person("Tom", "Tompson",30, "Contact");
		String s7 = gson.toJson(person); 
		System.out.println("s1="+s1+", s2="+s2+", s3="+s3+", s4="+s4+", s5="+s5+", s6="+s6);
		System.out.println(s7);

		System.out.println("\nDeserialization");

		int g1 = gson.fromJson("1", int.class); 
		Integer g2 = gson.fromJson("10",Integer.class); 
		Long g3 = gson.fromJson("1", Long.class); 
		Boolean g4 =gson.fromJson("false", Boolean.class); 
		String g5 = gson.fromJson("\"abc\"",String.class); 
		int[] g6 = gson.fromJson(s6, int[].class);
		Person g7 = gson.fromJson(s7, Person.class);
		System.out.println("g1="+g1+", g2="+g2+", g3="+g3+", g4="+g4+", g5="+g5+","
				+ "\ng6="+Arrays.toString(g6));
		System.out.println(g7);
	}
}
