 
public class Substitutor {
	
		//wheel controls
		static int rightW,middleW,leftW;

		
		//convert letter to index 
        public static int letter2index(char c) {     	
        	return (c - 'A')%26 ;
        }
        
        
        //convert index to character
        public static char index2letter(int i) {      	
        	return (char) (i + 'A');
        }
        
        
        
        //TODO - NOT WORKING//
        //******************//
        public static void circularShift(){
        	
        	rightW++;
        	if(rightW>25){
        		middleW++;
        		rightW = 0;
        	}
        	if(middleW>25){
        		leftW++;
        		middleW = 0;
        	}
        }
        
        //TODO - NOT WORKING//
        //******************//
        

}