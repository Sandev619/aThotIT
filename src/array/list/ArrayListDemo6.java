package array.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
  // equals == comparing 2 employees
public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("prakash",21,400);
		Employee emp2=new Employee("deepa",16,500);
		Employee emp3=new Employee("rohan",17,500);
		Employee emp4=new Employee("prakash",21,400);
		
		//create ArrayList of 3 employees
		List<Employee> empList=new ArrayList<>(); 		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
	
		
		System.out.println(empList);
		System.out.println(emp1.equals(emp4));
		// sorting
		
		Collections.sort(empList);
		System.out.println("after sorting by salary  "+ empList);		
		
		
	}



	}


