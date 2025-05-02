package adoptioncenter.model;

public abstract class Pet {
	
	private Integer id;
	private String name;
	private String type;
	private String species;
	private Integer age;
	private Boolean adopted;
	
	/**
	 * Empty constructor for Pet
	 */
	public Pet() {
		
	}//end Pet

	/**
	 * A parameterized constructor for Pet objects
	 * @param id The received id for the Pet
	 * @param name The received name of the Pet
	 * @param type The received type of Pet
	 * @param species The received species of
	 * the Pet
	 * @param age The received age of the Pet
	 * @param adopted The received boolean 
	 * showing whether the Pet has been
	 * adopted or not
	 */
	public Pet(Integer id, String name, String type, String species, Integer age, Boolean adopted) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}//end Pet

	/**
	 * Retrieves the id of the Pet
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}//end getId

	/**
	 * Sets the id of the Pet with
	 * the received id
	 * @param id The id to be assigned
	 * to the Pet
	 */
	public void setId(Integer id) {
		this.id = id;
	}//end setId

	/**
	 * Retrieves the name of the Pet
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * Sets the name of the Pet with
	 * the received name
	 * @param name The name to be assigned
	 * to the Pet
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/**
	 * Retrieves the type of the Pet
	 * @return the type
	 */
	public String getType() {
		return type;
	}//end getType

	/**
	 * Sets the type of the Pet with
	 * the received type
	 * @param type The type to be assigned
	 * to the Pet
	 */
	public void setType(String type) {
		this.type = type;
	}//end setType

	/**
	 * Retrieves the species of the Pet
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}//end getSpecies

	/**
	 * Sets the species of the Pet with
	 * the received species
	 * @param species The species to be assigned
	 * to the Pet
	 */
	public void setSpecies(String species) {
		this.species = species;
	}//end setSpecies

	/**
	 * Retrieves the age of the Pet
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}//end getAge

	/**
	 * Sets the age of the Pet with
	 * the received age
	 * @param age The age to be assigned
	 * to the Pet
	 */
	public void setAge(Integer age) {
		this.age = age;
	}//end setAge

	/**
	 * Retrieves whether the Pet has be adopted
	 * or not
	 * @return  true or false
	 */
	public Boolean getAdopted() {
		return adopted;
	}//end getAdopted

	/**
	 * Sets the adopted of the Pet with
	 * the received adopted
	 * @param adopted The adopted to be assigned
	 * to the Pet
	 */
	public void setAdopted(Boolean adopted) {
		this.adopted = adopted;
	}//end setAdopted
	
	/**
	 * Abstract method for adopting a Pet
	 */
	public abstract void adopt();

	/**
	 * Prints out the information of the Pet
	 */
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", type=" + type + ", species=" + species + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}
	
}//end Pet
