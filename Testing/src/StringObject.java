
public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		  String a= "java";
	        String b="java";
	        System.out.println(a==b);
	        
	        // s=new String(“Welcome”);
	       // String q=new String(“Welcome”);
	        
	        String str = "One two       three\n four\tfive ";

          String[] words = str.split("\\s");

           System.out.println(words[0]);
          String strg= "This#string%contains^23special*characters&.";  

	      strg = strg.replaceAll("[^a-zA-Z0-9]", " "); 
	      System.out.println(strg);
	     

	       System.out.println(strg);

	}

}
