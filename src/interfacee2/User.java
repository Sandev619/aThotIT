package interfacee2;

public class User {

	public static void main(String[] args) {
		
		//user wants to sort array in descending order
		int[] array = {4,8,2,9,10};
		
		Sorting impl=new SortDecending();
		impl.sort(array);

	}

}