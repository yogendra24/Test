
public class FactRecursive
{
//git checkout dev1 changes done
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
