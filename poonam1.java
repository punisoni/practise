package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class poonam1
{

	public static void main(String[] args) 
	{
		ArrayList<String>aList=new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		aList.add("4");
		aList.add("5");
		ListIterator<String>listItr = aList.listIterator();
		System.out.println("Elements are:");
		while(listItr.hasNext())
		{
		System.out.println(listItr.next()+" ");
		
		}
	}

}
