package assignment_10;

public class question_27 {

	public static void main(String[] args) {
		
		   coverString("java methods", "me"); //==> "java [me]thods"

		   coverString("Certified Wooden Spoon", "o");// ==> "Certified W[o][o]den Sp[o][o]n"

		   coverString("hello hello", "ello"); //==> "h[ello] h[ello]"

		   coverString("apples", "pears"); //==> "[apples]"

	}

	public static void coverString(String str1, String str2) {
		
		if(str1.contains(str2)) {
			
			System.out.println(str1.replaceAll(str2, "["+str2+"]"));
			
		}
		else {
			System.out.println("["+str2+"]");
		}
		
		
	}

}
