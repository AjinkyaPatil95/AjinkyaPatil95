package sample1;

public class Generalised {
	
	public static void main(String[] args) {
		
		System.out.println("---Feature of Airtel---");
		Airtel a=new  Airtel();
		a.AudioCalling();
		a.SMS();
		a.Internet();
		a.VideoCalling();
		
		System.out.println("---Feature of Idea---");
		Idea i=new Idea();
		i.AudioCalling();
		i.SMS();
		i.Internet();
		i.ISDCalling();
		
		System.out.println("---Feature of Jio---");
		Jio j=new Jio();
		j.AudioCalling();
		j.SMS();
		j.Internet();
		j.ISDCalling();
				
	}

}
