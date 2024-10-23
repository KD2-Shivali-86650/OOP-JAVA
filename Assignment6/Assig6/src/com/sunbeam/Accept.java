package com.sunbeam;


public class Accept {
	
	
	String m;
	public void AcceptString(String m) throws ExceptionLineTooLong {
		
		
		
		if(m.length()<0 || m.length()>80 ) {
			throw new ExceptionLineTooLong("The strings is too long");
			
		
		}
		
	}

}
