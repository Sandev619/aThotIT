package array.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("prakash",21,400);
		Employee emp2=new Employee("deepa",16,500);
		Employee emp3=new Employee("rohan",17,300);
		
		
		//create ArrayList of 3 employees
		List<Employee> empList=new ArrayList<>(); 		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
	
		
		System.out.print(empList);
		
				
		
		
	}



	}


