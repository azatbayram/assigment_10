package assignment_10;

public class question_20 {
	
	public static void main(String[] args) {
		
		int num1=5;
		int num2=6;
		int num3=7;
		int num4=0;
		
		System.out.println(calculateFactorial(num1));
		System.out.println(calculateFactorial(num2));
		System.out.println(calculateFactorial(num3));
		System.out.println(calculateFactorial(num4));
		

	}

	public static int calculateFactorial(int number) {
		int n=1;
		
			
		for(int i=number; i>0; i--) {
				
			n*=i;
		}
			
		return n;

	}

}
