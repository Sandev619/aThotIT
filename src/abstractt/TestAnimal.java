package abstractt;

public class TestAnimal {

	public static void main(String[] args) {
	//Animal animal=new Animal();//error as Animal is abstract class
		
		Animal animal;//creating reference of abstract class
	
		//Dog dog=new Dog();//ok
		
		animal=new Dog();//better code
		
		animal.makeSound();//barking======
		animal.run();
		
		animal=new Cat();
		animal.makeSound(); //myaooooo======
		

	}



	}


