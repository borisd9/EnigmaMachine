package Cyber1;

import java.util.HashMap;

public class Translator extends Helper {
	
	//internal permutation value
	protected String permutation;
	
	//TODO
	protected HashMap map;
	
	//constructor
	public Translator(String perm){
		permutation = perm;
	}
		
	//encode number 
	//pass = 1 (L->R) , pass = 2 (R->L)
	protected int permutate(int n, int pass){
				
		//L->R
		if(pass == 1)
			return letter2index(permutation.charAt(n));
		//R->L
		else
			return permutation.indexOf(index2letter(n));
	}

}