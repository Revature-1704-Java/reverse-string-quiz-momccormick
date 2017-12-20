package quiz;

public class ReverseString {
    public String reverse(String input) {
        //return new StringBuffer(input).reverse().toString();
    	return reverseViaForLoop(input);
    	//return reverseViaSubstringLoop(input);
    }
    
    private String reverseViaForLoop(String input) {
    	StringBuffer reverseBuffer = new StringBuffer();
    	
    	for(int i = input.length() - 1; i >= 0; i--) {
    		reverseBuffer.append(input.charAt(i));
    	}
    	
    	return reverseBuffer.toString();
    }
    
    private String reverseViaSubstringLoop(String input) {
    	String reverseString = new String();
    	
    	for(int i = 0; i < input.length(); i++) {
    		reverseString = input.substring(i,i+1) + reverseString;
    	}
    	
    	return reverseString;
    }
}