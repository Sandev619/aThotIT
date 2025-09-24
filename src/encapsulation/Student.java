package encapsulation;

public class Student {
   
    private String name="sandy";
	private  int   age=21;
	private int    id=11;
	private String password="test";
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) { //with restriction for -negative or 0
		if (id>=0) {
		this.id = id;
	}
		else {
			System.out.println("please provide valid input");
		}
//	public String getPassword() {
	//	return password;
	//}
	//public void setPassword(String password) {
	//	this.password = password;
	}
	
}
	
	
