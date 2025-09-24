package objects.classes;
//using toString()
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(101,"Deepa",2000);////it will call paramererized constructor1
		Employee emp2=new Employee("Prabhat",102,3000);//it will call paramererized constructor2
		Employee emp3=new Employee(103,"Prakash",4000);
		
		System.out.println(emp1.empid+" "+emp1.name+" "+emp1.salary);
		System.out.println(emp2.empid+" "+emp2.name+" "+emp2.salary);
		//printing the whole object in one shot
		System.out.println(emp1);//toString() is called automatically
		
		
		emp1.eat();
		emp2.eat("fish");
	}

}