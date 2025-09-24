package objects.classes;

public class DoggyMain {

	public static void main(String[] args) {
		//object creation using default constructor
		Doggy doggy1=new Doggy();
		Doggy doggy2=new Doggy();
		System.out.println(doggy1.name +" "+doggy1.age+" "+doggy1.color); //jacky 10 white
		System.out.println(doggy2.name +" "+doggy2.age+" "+doggy2.color);//jacky 10 white
		
		//object creation using parameterized  constructor
		
		Doggy doggy3=new Doggy("sweety",7,"black");
		Doggy doggy4=new Doggy("manky",11,"brown");
		System.out.println(doggy3.name +" "+doggy3.age+" "+doggy3.color);
		System.out.println(doggy4.name +" "+doggy4.age+" "+doggy4.color);
	}

}