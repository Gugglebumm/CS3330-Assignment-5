package adoptioncenter;

import java.io.FileNotFoundException;
import java.util.List;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import adoptioncenter.model.*;

public class Main {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		
		Shelter<Pet> shelter = new Shelter<Pet>();
		List<Pet> pets = PetLoader.loadPets("./src/main/resources/pets.json");
		
		for(Pet p : pets) {
			shelter.addPet(p);
		}
		
		for(Pet p : shelter.getPets()) {
			System.out.println(p);
		}
		
		for(Pet p : shelter.getPets()) {
			p.adopt();
		}

	}

}
