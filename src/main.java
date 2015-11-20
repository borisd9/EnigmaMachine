import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		int[] index = new int[3];
		char[] offset = new char[3];
		char[] setting = new char[3];
		
		//user input start
		Scanner in = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.println("Enter rotor choice " + (i+1) + ": ");
			index[i] = Integer.parseInt(in.nextLine());
			System.out.println("Enter setting choice for rotor " + index[i] + ": ");
			setting[i] = in.nextLine().charAt(0);
			System.out.println("Enter offset choice for rotor " + index[i] + ": ");
			offset[i] = in.nextLine().charAt(0);
		}
		
		//get plugboard settings
		System.out.println("Enter plugboard settings in pairs (AB CD ..) \nFor an empty plugboard simply pres Enter:");
		String p = in.nextLine();
		
		
		//init machine
		Enigma enig = new Enigma(index, setting, offset, p);
			
		//TESTS
		String test = "ENIGMA";
		
		System.out.println(enig.cipher(test));
	
	}
}