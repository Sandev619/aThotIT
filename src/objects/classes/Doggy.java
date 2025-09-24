package objects.classes;

public class Doggy {

	//attriutes/properties/instance variables/fields
	String name ="jacky"; //null(default value)
	int age=10;//0
	String color= "white";//null
	
	//behaviours/methods
	void bark(){
		System.out.println("Dog is barking");
	}
	//default constructor (provided when no constructor already)
	Doggy(){
		
	}
//parameterized constructor
  Doggy(String name,int age, String color){
	  
	  this.name=name;
	  this.age=age;
	  this.color=color;
		
	}
}