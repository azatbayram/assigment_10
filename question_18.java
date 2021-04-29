package assignment_10;

public class question_18 {

	public static void main(String[] args) {
		
		String word="Word";
		String separator="X";
		int count=3;
		
		System.out.println(stringSeparator(word, separator, count));

	}

	public static String stringSeparator(String word, String separator, int count) {
		String str="";
		
		for(int i=0; i<count; i++) {
			str=str.concat(word);
			if(i<count-1) {
				str=str.concat(separator);
			}
			
		}
		
		return str;
	}

}
