package Assignment2;
//10.Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.
//Sample Output:
//The given string is: mam is in the room
//The number of words ends eith m or n is: 3
public class dabhade 
{
public int endWithmOrn(String stng) 
	{
	  int l = stng.length();
	  int man = 0;
	  stng = stng.toLowerCase();
	  for (int i = 0; i < l; i++) 
	  {
	    if (stng.charAt(i) == 'm' || stng.charAt(i) == 'n') 
		{
	  if (i < l-1 && !Character.isLetter(stng.charAt(i+1)))
	    man++;
	   else if (i == l-1)
	     man++;
	    }
	  }
	  return man;
	}

	public static void main (String[] args)
	    {
	      dabhade d= new dabhade();
	      String str1 =  "mam is in the room";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The number of words ends eith m or n is: "+d.endWithmOrn(str1));
		  }
	}
