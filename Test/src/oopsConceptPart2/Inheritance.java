package oopsConceptPart2;

public class Inheritance extends Bmw{

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Compile time polymorphism
		
		Inheritance obj = new Inheritance();
		obj.name();
		obj.color();
		
			
		Car obj1 = new Car();
		obj1.color();
		obj1.name();
		obj.wheel();
		
	 
		
		Car c= new Bmw();//Dynamic polymorphism
		c.color();
		c.wheel();
		
			
		
	}
	

}
