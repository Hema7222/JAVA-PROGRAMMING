package encapsulation;

public class Person {
	String name;
	int age;
	String gender;
	String Phone;
	String email;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int setAge(int age) {
		this.age = age;
		return age;
	}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	public String setGender(String gender) {
		this.gender = gender;
		return gender;
	}
	
	public String setPhone(String phone) {
		Phone = phone;
		return phone;
	}
	
	public String setEmail(String email) {
		this.email = email;
		return email;
	}

}
