package adoptioncenter.model;

public class Rabbit extends Pet {
	
	/**
	 * A constructor for Rabbit using 
	 * variables from the abstract Pet 
	 * class which it extends
	 * @param id The received id for the Rabbit
	 * @param name The received name of the Rabbit
	 * @param type The received type of Pet
	 * @param species The received species of
	 * the Rabbit
	 * @param age The received age of the Rabbit
	 * @param adopted The received boolean 
	 * showing whether the Rabbit has been
	 * adopted or not
	 */
	public Rabbit(Integer id, String name, String type, String species, Integer age, Boolean adopted) {
		super(id, name, type, species, age, adopted);
	}

	/**
	 * Overridden abstract method from Pet which
	 * prints a message and sets the Rabbits adopted
	 * variable to true if false, printing a message stating
	 * it has already been adopted if true
	 */
	@Override
	public void adopt() {
		if(this.getAdopted() == false) {
			System.out.println("Adopted A Rabbit: " + this.getName());
			this.setAdopted(true);
		}
		else {
			System.out.println("Pet Already Adopted");
		}
		
	}


}
