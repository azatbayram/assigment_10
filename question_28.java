package assignment_10;

public class question_28 {

	public static void main(String[] args) {
		
		cleanBadWord("one two three","two");
		cleanBadWord("foo bar","foo");
		cleanBadWord("he said bla bla bla","bla");

	}

	public static void cleanBadWord(String text, String badWord) {
		
		if(text.contains(badWord)) {
			
			text=text.replace(badWord, "");
			int counter=0;
			text=text.trim();
			
			for(int i=0; i<text.length(); i++) {
				
				if(text.substring(i, i+1).equals(" ")) {
					
					counter++;
					
					if (counter>1) {
						
						text=text.replace("  ", " ");
						counter=0;
						
					}
					
					
				}
				
			}
			System.out.println(text);
			
		}
		
	}

}
