
public class PalindromeOrNot {
	public static void main(String[] args) {
		String og="naman";
		
		if(palindromeOrNot(og).equals(og)) {
			System.out.println("The entered value is palindrome");
		}
		else {
			System.out.println("The entered value is not palindrome");
		}
		
			}

	public static String palindromeOrNot(String og) {
		StringBuilder builder=new StringBuilder();
		
		for(int i=og.length()-1;i>=0;i--) {
			builder.append(og.charAt(i));
		}
		return builder.toString();
	}
}
