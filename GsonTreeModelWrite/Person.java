package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	public String contact;

	public Person(String firstName, String lastName, int age, String contact) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.contact = contact;
	}
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.contact = "";		
	}

	public String toString() {
		return "[" + firstName + " " + lastName + " " + age + " " + contact + "]";
	} 
	public static void main(String[] args) throws JsonIOException, IOException {
		Person person1 = new Person("Tom", "Smith", 41, "American");
		Gson gson = new GsonBuilder().setLenient().setPrettyPrinting().create();
		FileWriter fw = new FileWriter("MyPerson.json");
		gson.toJson(person1, fw);
		fw.flush();
		fw.close();
		//
		BufferedReader br = new BufferedReader(new FileReader("MyPerson.json"));
		//convert the json string back to object
		Person obj1 = gson.fromJson(br, Person.class);
		br.close();
		System.out.println(obj1);
		System.out.println();
	}
}
