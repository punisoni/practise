package Assignment2;
//8. Write a Java program to check whether the character immediately before and after a specified character is same in a given string. 
//Sample Output:
//The given string is: moon#night
//The before and after character are same: true
//The given string is: bat##ball
//The before and after character are same: false
//The given string is: #moon#night
//The before and after character are same: true


public class input
{

public boolean leftAndRightSame(String stng) 
{
 int l = stng.length();
 boolean found = true;
for (int i = 0; i < l; i++) 
	  
{
	    
String tmpString = stng.substring(i,i+1);
	    
if (tmpString.equals("#") && i >0 && i < l-1) 
		
{
if (stng.charAt(i-1) == stng.charAt(i+1))
found =true;
	      
else
found = false;
}
	  
}
	  
return found;
	}
public static void main (String[] args)
{
	 input i= new input();
	 String str1 ="moon#night";
	 System.out.println("The given string is: "+str1);
	 System.out.println("The before and after character are same: "+i.leftAndRightSame(str1));
		  }
	}
