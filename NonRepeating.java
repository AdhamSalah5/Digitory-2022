
public class NonRepeating {
	
	    public static void main(String args[]) {
	      
	    	System.out.print(Nonrepeating("aabbccdd"));
	       
	    }

	    public static String Nonrepeating(String x) {
	    	for(char i :x.toCharArray()) {
	    		if(x.indexOf(i)==x.lastIndexOf(i)) {
	    			return i + " This is the first non-repeating element";
	    		}
	    	}
	    	return null;
	    	}
	    }


	    
	
