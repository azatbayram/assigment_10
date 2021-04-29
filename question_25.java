package assignment_10;

public class question_25 {

	public static void main(String[] args) {
		
		 String s1 ="12345";
		 String s2 ="abcde";
		 
		 mergeStrings(s1,s2);
         mergeStrings("wooden", "spoon");
         mergeStrings("java", "selenium");

	}

	public static void mergeStrings(String str1, String str2) {

		String result="";
		
		for(int i=0; i<str1.length(); i++) {
            
          result=result.concat(str1.substring(i, i+1));
         
          
          result=result.concat(str2.substring(i, i+1));
          
          if(str1.length()>str2.length() && i==str2.length()-1) {
            	result=result.concat(str1.substring(i+1));
  				break;
  			}
          
          if(str1.length()<str2.length() && i==str1.length()-1) {
              	result=result.concat(str2.substring(i+1));
  				break;
  			}
        	
          
			
            
		}
		
		System.out.println(result);
	}

}
