package polymorphism;

       //Run time polymorphism always happens across the classes(means inheritence must be involved)


public class TestOverriding {

	public static void main(String[] args) {
		
		Food food =new Food();
		food.weight();
		
		food =new Orange();
		food.weight();      //overridden method will be called..20
		
		food.juice();   //inherited jump() will be called
		
		
		
		
	}

}
