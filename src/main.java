public class main {

public static void main(String[] args){
	
		String t = "YRUHQSLDPXNGOKMIEBFZCWVJAT ";
		Reflector ref = new Reflector(t);
		
		Plugboard plug = new Plugboard("SW AQ NP FO VY UX MK CL HT ZJ");
		
		
		
		//testing
		for(int i='A';i<='Z';i++)
			System.out.print(plug.translate(i));		
		
	}


}