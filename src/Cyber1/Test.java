package Cyber1;

public class Test {
	
	
	public static void main(String[] args){

	
		//test loop//
		////////////
		int[] index = new int[3];
		char[] offset = new char[3];
		char[] setting = new char[3];
		
		index[0] = 2;
		index[1] = 5;
		index[2] = 4;
		setting[0] = 'S';
		setting[1] = 'I';
		setting[2] = 'X';
		offset[0] = 'D';
		offset[1] = 'O';
		offset[2] = 'R';
				
	
		String test = "UMDPQ CUAQN LVVSP IARKC TTRJQ KCFPT OKRGO ZXALD RLPUH AUZSO";
		
		//profiling
		while(true){
			Enigma enig = new Enigma();
			enig.configure(index, setting, offset, "ZU HL CQ WM OA PY EB TR DN VI");
			
			enig.cipher(test);
		}
	
	}
	

}