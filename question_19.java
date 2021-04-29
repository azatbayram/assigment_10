package assignment_10;

public class question_19 {

	public static void main(String[] args) {
		
		String str1="javaxjava";
		String str2="javaxjavaapplepearjavaeggjav";
		String str3="  ";
		String str4="";
		
		System.out.println(countJava(str1));
		System.out.println(countJava(str2));
		System.out.println(countJava(str3));
		System.out.println(countJava(str4));

	}

	public static int countJava(String word) {
		int num=0;
		
		for(int i=0; i<word.length()-3; i++) {
			
			if(word.substring(i, i+4).equals("java")) {
				
				num++;
				
			}
		}
		
		return num;
	}

}
