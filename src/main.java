import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		int[] index = new int[3];
		char[] offset = new char[3];
		char[] setting = new char[3];
		
//		//user input start
//		Scanner in = new Scanner(System.in);
//		for(int i=0; i<3; i++){
//			System.out.println("Enter rotor choice " + (i+1) + ": ");
//			index[i] = Integer.parseInt(in.nextLine());
//			System.out.println("Enter setting choice for rotor " + index[i] + ": ");
//			setting[i] = in.nextLine().charAt(0);
//			System.out.println("Enter offset choice for rotor " + index[i] + ": ");
//			offset[i] = in.nextLine().charAt(0);
//		}
//		
//		//get plugboard settings
//		System.out.println("Enter plugboard settings in pairs (AB CD ..) \nFor an empty plugboard simply pres Enter:");
//		String p = in.nextLine();
		
		
		//init machine
		Enigma enig = new Enigma();
		
		//enig.configure(index, setting, offset, p);
			
		//input encrypted message
		//System.out.println("Enter encrypted message: ");
		//String test = in.nextLine();
		
		//print output
		//System.out.println("Output: " + enig.cipher(test));		
		
		
		
		
		//test loop		
		for(int i = 0; i<3; i++){
			index[i] = i+1;
			offset[i] = (char) ('G' + i);
			setting[i] = (char) ('D' + i);
		}
		
		index[0] = 2;
		index[1] = 5;
		index[2] = 4;
		setting[0] = 'S';
		setting[1] = 'I';
		setting[2] = 'X';
		offset[0] = 'D';
		offset[1] = 'O';
		offset[2] = 'R';
		
		
		String test = "UMDPQ CUAQN LVVSP IARKC TTRJQ KCFPT OKRGO ZXALD RLPUH AUZSO "
				+ "SZFSU GWFNF DZCUG VEXUU LQYXO TCYRP SYGGZ HQMAG PZDKC KGOJM MYYDD H";
		
		//profiling
		while(true){
		enig.configure(index, setting, offset, "ZU HL CQ WM OA PY EB TR DN VI");
		enig.cipher(test);
		}
	}
}