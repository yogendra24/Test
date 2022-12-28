package test;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="yogi";
 char[] ch=s.toCharArray();
  String rev = null;
  
  for(int i=ch.length-1;i>=0;i--) {
	 // System.out.println(ch[i]);
	 // rev= s.charAt(i)+rev;
	  System.out.print(s.charAt(i));
	  if(i!=(s.length()-1))
	  {
		  char[] b =ch[i] ;
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
		  
  }
	}

}
