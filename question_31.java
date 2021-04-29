package assignment_10;

public class question_31 {

	public static void main(String[] args) {
		
		 System.out.println(isPalindrome("Noon"));  //==> true

	     System.out.println(isPalindrome("I am not palindrome")); //==> false

         System.out.println(isPalindrome("wooden"));//==> false

		 System.out.println(isPalindrome("Nurses Run"));//==> true
		

	}
	
	public static boolean isPalindrome(String str) {
		str=str.toLowerCase();
		String backwardString="";
		for(int i=str.length()-1; i>=0; i--) {
			backwardString+=str.charAt(i);
		}
		if(str.replace(" ", "").equalsIgnoreCase(backwardString.replace(" ", ""))) {
			return true;
		}
		else {
			return false;
		}
	}

}
