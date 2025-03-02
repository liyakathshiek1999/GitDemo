package Practice1;

public class StringReverseprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "india is one of the population country"
		String sentence ="india is one of the population country";
		
		StringBuilder revsentence = new StringBuilder(sentence);
		revsentence.reverse();
		System.out.println(revsentence);

	}


}
