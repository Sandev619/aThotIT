package encapsulation;


public class StudentMain {
	
		public static void main(String[] args) {
			Student student1=new Student();
			//System.out.println(student1.name); error
			//System.out.println(student1.password); error
			
			System.out.println(student1.getName());
			
		   // System.out.println(student1.getPassword()); //error
			//student1.setPassword ("test123");error
			
			
	//update age
		student1.setAge(60);
		System.out.println(student1.getAge()); //30
		
		int age=student1.getAge();  //storing modified  age
		
	}
}
	