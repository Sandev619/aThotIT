package objects.classes;

//constructor overloading--using more than one constructor in a class 
//method overloading==using/defining same method name more than one within a class
public class Employee {
	
	
	String name;
	int empid;
	int salary;
	
	//default/no-arg constructor
	public Employee() {
		
	}
//paramererized constructor1
  public Employee( int empid, String name,int salary) {
		
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
  //paramererized constructor2 >>constructor overloading
  public Employee( String name,int empid,int salary) {
		
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
  
  
  //method
  void eat() {
  	System.out.println("employee strated eating");
  }
  
  void eat(String vegNonveg) {
  	System.out.println("employee strated eating "+vegNonveg);
  }
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
  
  
	
	
	
	
	

}