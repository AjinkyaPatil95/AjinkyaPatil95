package sample1;

public class Dog extends Animal{
	
	public void walk(){
		
		System.out.println("I'm walking");
	
	}
	
	public void run(){
		
		System.out.println("Buzo is running");
	}
	
	public void eat(){
		
		System.out.println("buzo is  eating");
	}

	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.eat();
		a.run();
	
	}
}
