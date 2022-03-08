package collection;

import java.util.Hashtable;
import java.util.Iterator;

public class Hashtable1 
{

	public static void main(String[] args) 
	{
		Hashtable<String,Integer> t=new Hashtable<String,Integer>();
		t.put("one",1);
		t.put("Three",2);
		t.put("four",3);
		t.put("Two",4);
		System.out.println("table of contents: "+t);
	}
}
		
