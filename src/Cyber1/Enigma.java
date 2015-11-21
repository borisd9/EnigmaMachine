package Cyber1;
import java.util.Scanner;

public class Enigma extends Helper {
	
			//init reflactor B
			Reflector ref = new Reflector("YRUHQSLDPXNGOKMIEBFZCWVJAT");
			
			//init rotors and notch info
			String[] rot = {"EKMFLGDQVZNTOWYHXUSPAIBRCJ", "AJDKSIRUXBLHWTMCQGZNPYFVOE", "BDFHJLCPRTXVZNYEIWGAKMUSQO",
					"ESOVPZJAYQUIRHXLNFTGKDCMWB", "VZBRGITYUPSDNHLXAWMJQOFECK"};
			char[] notch = {'Q', 'E', 'V','J', 'Z'};		
			
			//enigma rotors choice variables
			Rotor[] rotors = new Rotor[3];
			int index;
			char offset,setting;
					
			//plugboard init
			String p;
			Plugboard plug = new Plugboard();
			
		
		//constructor
		public void configure(int[] index, char[] setting, char[] offset, String p){
			
			for(int i=0;i<3;i++){
				//update rotor settings
				rotors[i] = new Rotor(rot[index[i]-1], setting[i], offset[i], notch[index[i]-1]);
			}
			
			//update plugboard if needed
			if(!p.isEmpty())
				plug.updatePairs(p);
							
		}
		
		
		//main cipher function
		public String cipher(String plaintext){
			
			char cipher;
			String ciphertext = "";
			
			//encode character
			for(int i=0;i<plaintext.length();i++){
				
				//handle spaces
				if(plaintext.charAt(i) == ' '){
					ciphertext+= " ";
					continue;
				}
				
				//check for notch position and advance if needed
				if(rotors[2].ifNotch() || rotors[1].ifNotch()){
					if(rotors[1].ifNotch())
						rotors[0].advance();
					rotors[1].advance();		
				} 			
				rotors[2].advance();
				
				
				//pass through plugboard
				cipher = plug.encode(plaintext.charAt(i));
				
				//start encoding process - forward
				
				cipher = rotors[2].encode(cipher, 1);
				cipher = rotors[1].encode(cipher, 1);
				cipher = rotors[0].encode(cipher, 1);		
				
				//reflect
				cipher = ref.encode(cipher);				
				
				//start encoding process - backward
				cipher = rotors[0].encode(cipher, 2);
				cipher = rotors[1].encode(cipher, 2);
				cipher = rotors[2].encode(cipher, 2);
						
				//pass through plugboard
				cipher = plug.encode(cipher);
				
				
				//build cipher text
				ciphertext += cipher;		
			}
				
			//return full ciphertext
			return ciphertext;
			
	
	}

}

