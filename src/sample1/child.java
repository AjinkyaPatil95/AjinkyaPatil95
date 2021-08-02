package sample1;

public class child extends  parent{

	public void m3(){
		
		System.out.println("m3 method created in child class");
	}
	
	public void m1(){
		
		System.out.println("m1 method extended to child class");
	}
	
	public void m2(){
		
		System.out.println("m2 method is extended to child class");
	}
	
	public static void main(String[] args) {
		
		
//		parent p=new parent();
//		p.m1();
//		p.m2();
//		child c=new child();
//		c.m1();
//		c.m2();
//		c.m3();
		parent pc=new child();
		pc.m1();
		pc.m2();
		
		
	}
	
}
