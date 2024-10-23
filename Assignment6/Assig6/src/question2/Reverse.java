package question2;

public class Reverse {

	public static void main(java.lang.String[] args) {
		 
		String s = "Hello Mac is here";
		String s1="";
		
		for(int i = s.length()-1; i>=0; i--) {
			
			s1 = s1+s.charAt(i);
			
		}
		
		System.out.println("Reversed String-" +s1);
		
		
		

		
		

	}

}
