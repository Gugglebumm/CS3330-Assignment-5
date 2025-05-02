package adoptioncenter.model;

public class Dog extends Pet {

	/**
	 * A constructor for Dog using variables
	 * from the abstract Pet class which it
	 * extends
	 * @param id The received id for the Dog
	 * @param name The received name of the Dog
	 * @param type The received type of pet
	 * @param species The received species of
	 * the Dog
	 * @param age The received age of the Dog
	 * @param adopted The received boolean 
	 * showing whether the Dog has been adopted
	 * or not
	 */
	public Dog(Integer id, String name, String type, String species, Integer age, Boolean adopted) {
		super(id, name, type, species, age, adopted);
	}//end Dog

	/**
	 * Overridden abstract method from Pet which
	 * prints a message and sets the Dog's adopted
	 * variable to true if false, printing a message stating
	 * it has already been adopted if true
	 */
	@Override
	public void adopt() {
		if(this.getAdopted() == false) {
			System.out.println("Adopted A Dog: " + this.getName());
			this.setAdopted(true);
		}//end if
		else {
			System.out.println("Pet Already Adopted");
		}//end else
	}//end adopt

}//end Dog
