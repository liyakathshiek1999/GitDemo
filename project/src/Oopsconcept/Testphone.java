package Oopsconcept;

public class Testphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multi inheretence
		
		Phone p=new Phone();
		p.call();
		p.dial();
		Mobile m=new Mobile();
		m.call();
		m.dial();
		m.Videocall();
		System.out.println("-----------------");
		Smartphone sp=new Smartphone();
		sp.call();
		sp.dial();
		sp.Videocall();
		sp.whatsup();
			
	}

}

