package json;
import java.io.*;
import java.util.ArrayList;
import com.google.gson.*;
import com.google.gson.stream.*;

/*import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
 */
class Pupil {
	private long id;
	private String name;
	public Pupil(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {return id;}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}
}

public class GsonTreeModelWrite {
	public static void WriteJson(String fileName) {
		ArrayList<Pupil> pupils = new ArrayList<>();

		Pupil p1 = new Pupil(100, "p1");
		Pupil p2 = new Pupil(200, "p2");
		Pupil p3 = new Pupil(300, "p3");
		Pupil p4 = new Pupil(400, "p4");
		Pupil p5 = new Pupil(500, "p5");
		pupils.add(p1);
		pupils.add(p2);
		pupils.add(p3);
		pupils.add(p4);
		pupils.add(p5);

		try{ 			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonElement tree = gson.toJsonTree(pupils);
			System.out.println(tree);

			FileWriter fw = new FileWriter(fileName); 
			JsonWriter writer = new JsonWriter(fw);

			gson.toJson(tree, writer);
			writer.close();
			fw.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Pupils written to file");
	}

	public static void ReadJson(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonReader reader = new JsonReader(fr);
			JsonParser parser = new JsonParser();
			JsonElement tree = parser.parse(reader);
			JsonArray array = tree.getAsJsonArray();

			for (JsonElement element: array) {
				if (element.isJsonObject()) {
					JsonObject car = element.getAsJsonObject();
					System.out.println("********************");
					System.out.println(car.get("id").getAsLong());
					System.out.println(car.get("name").getAsString());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		String fileName = "Pupils.json";
		WriteJson(fileName);
		ReadJson(fileName);
	}
}


