package assignment_10;

public class question_16 {

	public static void main(String[] args) {
		
		String str1="javapython";
		String str2="cjavac++";
		String str3="c#javaruby";
		
		checkJava(str1);
		checkJava(str2);
		checkJava(str3);
		

	}

	public static void checkJava(String word) {
		
		if(word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
