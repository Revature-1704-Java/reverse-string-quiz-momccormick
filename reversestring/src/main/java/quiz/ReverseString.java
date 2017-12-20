package quiz;

public class ReverseString {
    public String reverse(String input) {
    	// After doing some lookup, realized I should check for null (even though no tests check for it)
    	if(input == null || input.equals("")) return "";
    	
    	// Two ways to reverse.  Feel like there should be another better way...
    	//return reverseViaSubstringLoop(input);
    	return reverseViaForLoop(input);
    	

    	//Original Reverse Method To Change
        //return new StringBuffer(input).reverse().toString();
    }
    
    private String reverseViaSubstringLoop(String input) {
    	String reverseString = new String();
    	
    	for(int i = 0; i < input.length(); i++) {
    		// creates new String for the pool each iteration
    		reverseString = input.substring(i,i+1) + reverseString;
    	}
    	
    	return reverseString;
    }
    
    private String reverseViaForLoop(String input) {
    	StringBuffer reverseBuffer = new StringBuffer();
    	
    	for(int i = input.length() - 1; i >= 0; i--) {
    		reverseBuffer.append(input.charAt(i));
    	}
    	
    	return reverseBuffer.toString();
    }
    
}
