package Assignment2;
//write a java program to compare two strings lexicographically
//Ignoring case differences2.
public class String11
{

	public static void main(String[] args)
	{
    String  str1="poonam dabhade 99";
    String  str2="poonam Dabhade 99";
    
    System.out.println("String 1:"+str1);
    System.out.println("String 2:"+str2);
    
    //logic compare the two strings.
    
    int result= str1.compareToIgnoreCase(str2);
    
 if (result<0)
 {
	 System.out.println("\""+str1+ "\""+"is less then "+"\"" +str2+"\"");
 }
 else if(result==0)
 {
	 System.out.println("\""+str1+ "\""+"is equal to "+"\"" +str2+"\"");;
	 
 }
 else
 {
	 System.out.println("\""+str1+ "\""+"is less then "+"\"" +str2+"\"");;
 }
	}
}