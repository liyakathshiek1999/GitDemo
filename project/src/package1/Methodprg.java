package package1;

public class Methodprg {
	static int chair=4;
	int sofa=2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Methodprg mp=new Methodprg();
		mp.kitchen();
		mp.readingroom();
		mp.hall();
		childroom();	
		
	}
		
		public void kitchen()
		{
			int a=10;
		System.out.println("kitchen");
		System.out.println(a);
		System.out.println("chair");//global variable
		
		
        }
		public void readingroom()
		{
			int chair=20;
		System.out.println("readingroom");
		System.out.println(chair);
	 //system.out.println(a)---local variable
		
		

		}
		public void hall()
		{
			String chair="sofa";
			
		System.out.println("hall");
		System.out.println(chair);
		
		}
		public static void childroom()
		{
			System.out.println("childroom");
			System.out.println("chair");
		    //System.out.println(sofa);
		    		
		}
		

	}


