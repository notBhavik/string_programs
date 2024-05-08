
public class ReverseString {

	public static void main(String[] args) {
		String og="Reverse Using For";
		
		 System.out.println(reverseString(og));
		
	}
	public static String reverseString(String og) {
		
		StringBuilder rev=new StringBuilder();
		for(int i=og.length()-1;i>=0;i--) {
			rev.append(og.charAt(i));
		}
		return rev.toString();
		
	}

}
