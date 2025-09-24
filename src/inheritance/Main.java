package inheritance;

public class Main {

	public static void main(String[] args) {

       Dog dog1= new Dog();
       dog1.jump();
       dog1.run();
       dog1.bark();
       
       Animal animal= new Animal();
       //animal.bark();//error
       
       Cow cow=new Cow();
       cow.jump();
       cow.run();
       cow.sound();
       //cow.bark();
	
       //super class/Parent class reference can point to child class object
	
       Animal pref=new Dog();
       pref.jump();
       pref.run();
       ((Dog)pref).bark();//downcasting>>to call child class specific method using parent reference
	
       pref=new Cow();
       pref.jump();
       pref.run();
       ((Cow)pref).sound();

}

}