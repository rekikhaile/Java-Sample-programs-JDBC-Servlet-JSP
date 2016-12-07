package fi.hh.jee.demo.d04.bean;

public class Person {
	
	private String firstname;
	private String lastname;
	private String gender;
	private float age;
	
	public Person(String firstname, String lastname, String gender, float age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}
	
	
	public float getAge() {
		return age;
	}




	public void setAge(float age) {
		this.age = age;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", age=" + age + "]";
	}




	
	
}
