package day1;



	public class ElseIfDemo {

		public static void main(String[] args) {

			int marks = 65;

			if (marks == 20) {

				System.out.println("failed");

			} else if (marks == 30) {
				System.out.println("passed");
			}

			else if (marks > 60 && marks < 75) {
				System.out.println("first division");
			} else {

				System.out.println("Honors");//will execute if all conditions failed
			}
	}

	}
