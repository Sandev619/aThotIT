package encapsulation;

public class Studentmain2 {

	public static void main(String[] args) {
		
		// wants to change id of student
		Student s1 =new Student();
		s1.setId(420);
		System.out.println(s1.getId());  //100 result
		
		//again wants to change id
		s1.setAge(20);
		System.out.println(s1.getAge()); //-200
		
		

	}

}
