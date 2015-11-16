public class Translator extends Substitutor {
	
	//internal permutation value
	protected String permutation;
	
	
	//encode number 
	//pass = 1 (L->R) , pass = 2 (R->L)
	protected int translate(int n, int pass){
		
		//String per = this.permutation;
		
		//L->R
		if(pass == 1)
			return letter2index(permutation.charAt(n));
		//R->L
		else
			return permutation.indexOf(index2letter(n));
	}

	
}