public class Reflector extends Translator {
	
	//init reflector permutation
	public Reflector (String permutation){
		this.permutation = permutation;
	}
	
	
	//reflect number
	public char translate(int n){
		return index2letter(translate(n-'A', 1));
	}
	
	
}