package encapsulation;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAge(24);
		p.setName("Hema");
		p.setGender("Female");
		p.setPhone("+91 1234567890");
		p.setEmail("hema004@gmail.com");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		

	}

}
