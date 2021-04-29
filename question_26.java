package assignment_10;

import java.util.Arrays;

public class question_26 {

	public static void main(String[] args) {
		
		  uniqueChars("java"); // ==> "jav"

		  uniqueChars("mama"); // ==> "ma"

		  uniqueChars("spoon"); // ==> "spon"

	}

	public static void uniqueChars(String str) {
		
		String result="";
		
		for (int i=0; i<str.length(); i++) {
			String s=str.substring(i, i+1);
			
			if(!result.contains(s)) {
				result=result.concat(s);
			}
		}
		
		System.out.println(result);
		
		
    }
}