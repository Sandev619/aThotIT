package loops;

public class ForLoopDemo2 {

public static void main(String[] args) {
		
		
		
		System.out.println("using for loop===print nos from 20 to 10========");
		
		for(int no=20;no>=10;no--   ) {
			
			System.out.println(no);
			
		}
		
 System.out.println("print multiplication table of 5========");//5 10 15 20......50(5*1,5*2,5*3.......5*10)>>5i
		
		for(int i=1;i<=10;i++   ) {
			
			System.out.println(5*i);//5*1, 5*2...
			
		}
		
		System.out.println("using nested for loop==print multiplication table from 5 to 10===");
		
		for(int j=5;j<=10;j++) {
			
         for(int i=1;i<=10;i++   ) {
			
			System.out.println(j*i+ " i and j are "+i + " "+j);//5*1, 5*2...
			
		}
         
		}
	}

}
