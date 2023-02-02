public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Director() {
		this.name = null;
		this.email = null;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGenderName() {
		String gen;
		switch(gender) {
		case ('m') : gen = "Male";break;
		case ('M') : gen = "Male";break;
		case ('f') : gen = "Female";break;
		case ('F') : gen = "Female";break;
		default : gen = null;
		}
		return gen;
		}
	
	public String toString() {
		return getName()+"("+getEmail()+";"+getGenderName()+")";
	}
	
}
