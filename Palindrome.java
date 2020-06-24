import java.util.*; 
public class Palindrome {

   
   public static void main(String args[])  
   {  
      String str, rev = "";   
      Scanner sc = new Scanner(System.in);   
      
      System.out.println("Enter a string to check if it is a palindrome");  
      
      str = sc.nextLine();   
      
      int len = str.length();   
      
      for ( int i = len - 1; i >= 0; i-- )  
      
    	  rev = rev + str.charAt(i);  
      
      if (str.equalsIgnoreCase(rev))  
         System.out.println("Entered string is a palindrome");  
      
      else  
         System.out.println("Entered string is not a palindrome");   
   }  
}  