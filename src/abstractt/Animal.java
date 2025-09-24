package abstractt;

public abstract class Animal {
                     // non abstract method
	
		void run(){
			
			System.out.println("running 10miles/hr");
		}
		
		//abstract method(definition/implementation not known)
		abstract void makeSound(); //abstract methods must be implemented by child classes
	
	}

	class Dog extends Animal{

		@Override
		void makeSound() {
			System.out.println("barking======");
		}
				
			
		void run() {
			System.out.println("running 20m-h");
			
		}
	}
		class Cat extends Animal{

			@Override
			void makeSound() {
				System.out.println("myaooooo======");
				
			}
		}
