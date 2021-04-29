package assignment_10;

public class question_23 {

	public static void main(String[] args) {
		
		String str1="breadjambread";
		String str2="xxbreadjambreadyy";
		String str3="xxbreadapple";
		String str4="breadbutterbread";
		
		printBetween(str1);
		printBetween(str2);
		printBetween(str3);
		printBetween(str4);

	}

	public static void printBetween(String str) {
		
		int firstIndex=0;
		int lastIndex=0;

		
		for(int i=0; i<str.length()-4; i++) {
			
			if(str.substring(i, i+5).equals("bread")) {
					
					firstIndex=i+5;
					break;
				}
				
			}
		
		lastIndex=str.indexOf("bread", firstIndex+1);
		
		if(firstIndex>0 && lastIndex>0) {
			System.out.println(str.substring(firstIndex, lastIndex));
		}
		else {
			System.out.println("nothing");
		}
		
		}
	
	}
