package Assignment2;
//Write a Java program to print the frequency of each character in a string
//(welocme in Edubridge family) like w=1, e=3, l=2 etc.
public class check 
{
public static void main(String[] args) 
{    
	String str = "welocme in Edubridge family";    
	 int[] freq = new int[str.length()];    
	 int i, j;    
	 //Converts given string into character array    
	        
	 char string[] = str.toCharArray();    
	            
	 for(i = 0; i <str.length(); i++)
	 {    
	 freq[i] = 1;    
	 for(j = i+1; j <str.length(); j++) 
	 {    
	 if(string[i] == string[j]) 
	 {    
	  freq[i]++;    
	                        
	string[j] = '0';    
}    
	}    
	    }    
System.out.println("Characters and their corresponding frequencies");    
for(i = 0; i <freq.length; i++)
{    
if(string[i] != ' ' && string[i] != '0')    
System.out.println(string[i] + "-" + freq[i]);    
}    
 }    
	}    
