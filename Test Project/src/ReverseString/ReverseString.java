package ReverseString;

public class ReverseString {
	
	public static void main(String[] args) {
	String string="abcd1234";
	String reverseString="";
	
	for (int i=string.length()-1;i>=0;i--){
		reverseString=reverseString+string.charAt(i);
	}
	/*Using String Buffer object in Java*/
	System.out.println("Reverse String: "+reverseString);
	
	StringBuffer str= new StringBuffer("String Buffer class contains a reverse method");
	System.out.println("Reverse String: "+str.reverse());
	}
}
