package StringBufferandBuilder;

import java.util.StringTokenizer;

public class NewClass 
{

	public static void main(String[] args)
	{
	System.out.println("Using Constructer 1 -");
	StringTokenizer st1=new StringTokenizer("Hello poonam How are you","");
	while(st1.hasMoreTokens())
	{
		System.out.println(st1.nextToken());
		
	}
System.out.println("Using Constructer 2 -");
StringTokenizer st2=new StringTokenizer("JAVA:Code:String",":");
while(st2.hasMoreTokens())
{
	System.out.println(	st2.nextToken());

}
System.out.println("Using Constructer 3 -");
StringTokenizer st3=new StringTokenizer("JAVA:Code:String",":true");
while(st3.hasMoreTokens())
{
	System.out.println(st3.nextToken());
	
}
	} 

}
