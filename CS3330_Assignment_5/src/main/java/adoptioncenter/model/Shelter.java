package adoptioncenter.model;

import java.util.ArrayList;
import java.util.List;

import adoptioncenter.model.Pet;

public class Shelter<T extends Pet> {

	private List<T> pets;

	public Shelter(List<T> pets) {
		setPets(new ArrayList<>());
	}//end Shelter

	public List<T> getPets() {
		return pets;
	}//end getPets

	public void setPets(List<T> pets) {
		this.pets = pets;
	}//end setPets
	
	public void printPets() {
		for(T pet : pets) {
			System.out.println(pet);
		}//end for
	}//end printPets
	
}//end Shelter
