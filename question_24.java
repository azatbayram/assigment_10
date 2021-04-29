package assignment_10;

public class question_24 {

	public static void main(String[] args) {
		
		String str1="We study java not python";
		String str2="What's the difference between java, javascript and python?";
		
		checkJavaPython(str1);
		checkJavaPython(str2);
		

	}

	public static void checkJavaPython(String str) {
		int java=question_19.countJava(str);
		int python=countPython(str);
		
		if(java==python) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
	}
	
	public static int countPython(String word) {
		int num=0;
		
		for(int i=0; i<word.length()-5; i++) {
			
			if(word.substring(i, i+6).equals("python")) {
				
				num++;
				
			}
		}
		
		return num;
	}

	

}
