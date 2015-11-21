 
public class Helper {
		
		//convert letter to index 
        public static int letter2index(char c) {     	
        	return (int)(c - 'A')%26 ;
        }
               
        //convert index to character
        public static char index2letter(int i) {      	
        	return (char) (i + 'A');
        }
        
}