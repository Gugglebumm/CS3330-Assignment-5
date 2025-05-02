package adoptioncenter.model;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class PetLoader {
	
    public static List<Pet> loadPets(String filePath) throws JsonIOException, JsonSyntaxException, FileNotFoundException  {
        Gson gson = new Gson();
        JsonArray jsonArray = JsonParser.parseReader(new FileReader(filePath)).getAsJsonArray();

        List<Pet> pets = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            JsonObject obj = element.getAsJsonObject();
            String type = obj.get("type").getAsString();
            int id = obj.get("id").getAsInt();
            String name = obj.get("name").getAsString();
            String species = obj.get("species").getAsString();
            int age = obj.get("age").getAsInt();
            boolean adopted = obj.get("adopted").getAsBoolean();

            switch (type) {
                case "Dog":
                    pets.add(new Dog(id, name, type, species, age, adopted));
                    break;
                case "Cat":
                    pets.add(new Cat(id, name, type, species, age, adopted));
                    break;
                case "Rabbit":
                    pets.add(new Rabbit(id, name, type, species, age, adopted));
                    break;
                default:
                    System.out.println("Unknown type: " + type);
            }
        }

        return pets;
    }

}
