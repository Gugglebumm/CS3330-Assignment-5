package adoptioncenter.model;

public class Cat extends Pet {

	/**
	 * A constructor for Cat using variables
	 * from the abstract Pet class which it
	 * extends
	 * @param id The received id for the Cat
	 * @param name The received name of the Cat
	 * @param type The received type of Pet
	 * @param species The received species of
	 * the Cat
	 * @param age The received age of the Cat
	 * @param adopted The received boolean 
	 * showing whether the Cat has been adopted
	 * or not
	 */
	public Cat(Integer id, String name, String type, String species, Integer age, Boolean adopted) {
		super(id, name, type, species, age, adopted);
	}

	/**
	 * Overridden abstract method from Pet which
	 * prints a message and sets the Cat's adopted
	 * variable to true if false, printing a message stating
	 * it has already been adopted if true
	 */
	@Override
	public void adopt() {
		if(this.getAdopted() == false) {
			System.out.println("Adopted A Cat: " + this.getName());
			this.setAdopted(true);
		}
		else {
			System.out.println("Pet Already Adopted");
		}
	}
	
}
