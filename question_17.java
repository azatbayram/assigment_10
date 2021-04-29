package assignment_10;

public class question_17 {

	public static void main(String[] args) {
		
		char first1='A';
		char last1='Z';
		char first2='a';
		char last2='f';
		char first3='a';
		char last3='d';
		char first4='B';
		char last4='O';
		
		printAlphabe(first1, last1);
		System.out.println("\n-----------------------");
		printAlphabe(first2, last2);
		System.out.println("\n-----------------------");
		printAlphabe(first3, last3);
		System.out.println("\n-----------------------");
		printAlphabe(first4, last4);
		

	}

	public static void printAlphabe(char first, char last) {
		
		for(char i=first; i<=last; i++) {
			System.out.print(i);
		}
		
	}

}
