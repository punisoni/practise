package Assignment3;
//*Write a program that will have a Vector which is capable of 
//storing emp objects. Use an Iterator and enumeration to list 
//all the elements of the Vector.
import java.util.Enumeration;
import java.util.Vector;

public class program8 
{
	//enumeration is a data type that contains fixed set of constant
	

		public static void main(String[] args)
		{
			Vector< String> v=new Vector<String>();
			v.add("eeeeee");
			v.add("mmmmmm");
			v.add("oooooo");
			v.add("tttttt");
			v.add("iiiiii");
			v.add("oooooo");
			v.add("nnnnnn");
			v.add("aaaaaa");
			v.add("llllll");
			Enumeration e= v.elements();
			while(e.hasMoreElements())
			{
			System.out.println(e.nextElement()+" ");
			}
		}
	}

	
