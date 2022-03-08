package collection;
//Hashtable class is synchronized
//Because of Thread-safe,Hashtable is slower than HashMap

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMap1
{

	public static void main(String[] args) 
	{
	TreeMap<String,String>	treeMap =new TreeMap<String,String>();
	treeMap.put("1", "one");
	treeMap.put("2", "Two");
	treeMap.put("3", "Three");
	
	Collection c =treeMap.values();
	Iterator itr = c.iterator();
	
	
	while(itr.hasNext())
	{
	System.out.print(itr.next()+" ");
	}

}

}