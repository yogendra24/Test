
public class FactRecursive
{ //dev 2 branch
  //dev 3 branch
//new comment dev 2
	public static void main(String args[]) {
      System.out.println("The factorial of 6 is: " + factorial(6));
      System.out.println("The factorial of 0 is: " + factorial(0));
   }
   
   static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));
  
  
 }    
}
