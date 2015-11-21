public class Plugboard extends Translator {
	
	//default constructor
	public Plugboard (){
		super("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	
	//constructor with pairs
	public void updatePairs(String pairs){	
		
		//use StringBuilder to modify the string
		StringBuilder str = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String[] arr = pairs.split(" ");
		
		//switch places of the pairs
		for(int i=0; i<arr.length; i++){
			int x = letter2index(arr[i].charAt(0));
			int y = letter2index(arr[i].charAt(1));
			str.setCharAt(x, arr[i].charAt(1));
			str.setCharAt(y, arr[i].charAt(0));
		}
			
		//set new permutation value
		this.permutation = str.toString();
	}
	
	
	//translate number according to plugboard permutation
	public char encode(char n){
		return index2letter(permutate(n -'A', 1));
	}
	
	
}