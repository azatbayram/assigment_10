package assignment_10;

public class question_22 {

	public static void main(String[] args) {
		
		String str=";<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		checkHTML(str);
		

	}

	public static void checkHTML(String str) {
		
		if(str.contains("html")) {
			
			System.out.println(str.substring(str.indexOf("\"")+1, str.indexOf("\"", str.indexOf("\"")+1)));
			
		}
		else {
			System.out.println("invalid input");
		}
		
	}

}
