package array.list;

import java.util.Comparator;

public class SortingByNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		String emp1Name=o1.getName();
		String emp2Name=o2.getName();
		
		//return emp1Name.compareTo(emp2Name);//alphabetical ascending
		return emp2Name.compareTo(emp1Name);//alphabetical ascending
	}

}