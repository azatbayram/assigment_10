package assignment_10;

public class question_29 {

	public static void main(String[] args) {
		
		limitedOutput("abcd",2);
		limitedOutput("bla bla",3);

	}

	private static void limitedOutput(String str, int num) {
		
		System.out.println(str.substring(0, num));
		
	}

}
