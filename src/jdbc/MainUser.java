package jdbc;

public class MainUser {

	public static void main(String[] args) {
		
		Dao dao = new Dao();
		//dao.insertRecord(2009,"deepp","s@gmail.com");
		
		dao.deleteRecord("deepp");
		
		//dao.updateRecord(202, "updatedmail.com");
		//dao.updateRecord(202, "sanjeev");
		
		//dao.fetchRecords(0>=150);
	}

}
