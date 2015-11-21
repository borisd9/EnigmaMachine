package Cyber1;
public class Reflector extends Translator {
	
	//init reflector permutation
	public Reflector (String permutation){
		super(permutation);
	}
	
	
	//reflect number
	public char encode(char n){
		return index2letter(permutate(n -'A', 1));
	}
	
	
}