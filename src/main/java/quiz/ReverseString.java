package quiz;

public class ReverseString {
    public String reverse(String input) {
    	StringBuffer buffer = new StringBuffer();
    	for(int i = 0; i < input.length(); i++) {
    		buffer.append(input.charAt(input.length() - i - 1));
    	}
        return buffer.toString();
    }
}