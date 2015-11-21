package Cyber1;
public class Rotor extends Translator {
	
	public int ringSetting, ringOffset, ringNotch;
	
	public Rotor (String permutation, char setting, char offset, char notch){
		super(permutation);
		ringSetting = letter2index(setting);
		ringOffset = letter2index(offset);		
		ringNotch = letter2index(notch);
	}
	
	
	public char encode(char n, int pass){
		int index = ( letter2index(n) + ringOffset - ringSetting + 26 ) % 26;
		int perm = permutate(index, pass);
		int output = ( perm - ringOffset + ringSetting + 26 ) % 26;
		return index2letter(output);
	}
	
	
	public boolean ifNotch(){
		return (ringNotch == ringOffset);
	}
	
	public void advance(){
		ringOffset = (++ringOffset)%26 ;
	}
}