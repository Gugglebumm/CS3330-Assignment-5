package adoptioncenter.model;

import adoptioncenter.model.Type;

public abstract class Pet {
	
	private Integer id;
	private String name;
	private Type type;
	private String species;
	private Integer age;
	private Boolean adopted;
	
	public Pet() {
		
	}//end Pet

	public Pet(Integer id, String name, Type type, String species, Integer age, Boolean adopted) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}//end Pet

	public Integer getId() {
		return id;
	}//end getId

	public void setId(Integer id) {
		this.id = id;
	}//end setId

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public Type getType() {
		return type;
	}//end getType

	public void setType(Type type) {
		this.type = type;
	}//end setType

	public String getSpecies() {
		return species;
	}//end getSpecies

	public void setSpecies(String species) {
		this.species = species;
	}//end setSpecies

	public Integer getAge() {
		return age;
	}//end getAge

	public void setAge(Integer age) {
		this.age = age;
	}//end setAge

	public Boolean getAdopted() {
		return adopted;
	}//end getAdopted

	public void setAdopted(Boolean adopted) {
		this.adopted = adopted;
	}//end setAdopted
	
}//end Pet
