package assignment_10;

public class question_21 {

	public static void main(String[] args) {
		
		String str="abXYabc";
		int num1=1;
		int num2=2;
		int num3=3;
		
		countAppears(str, num1);
		countAppears(str, num2);
		countAppears(str, num3);

	}

	public static void countAppears(String word, int num) {
		
		int counter=1;
		int x=word.substring(0,num).length();
		
		for(int i=0; i<word.length()-(x-1); i++) {
			
			if(word.substring(i, i+x).equals(word.substring(0,num))) {
				counter++;
			}
				
		}
		
		if(counter>2) {
			
			System.out.println(true);
			System.out.println(word.substring(0,num) + " appears atleast twice");
			
		}
		else {
			System.out.println(false);
			System.out.println(word.substring(0,num) + " appears once only");
		}
		
	}

}
