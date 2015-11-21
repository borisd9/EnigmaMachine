package Cyber1;
 
public class Helper {
		
		//convert letter to index 
        public int letter2index(char c) {     	
        	return (int)(c - 'A')%26 ;
        }
               
        //convert index to character
        public char index2letter(int i) {      	
        	return (char) (i + 'A');
        }
        
}