package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class classDemo 
{

	public static void main(String[] args) 
	{
	//List list=new ArrayList();
	Set<String> list=new  HashSet();
	list.add("dabhade");
	list.add("poonam");
	list.add("soni");
	list.add("sona"); 
	
	//list.add(20);
	//list.add("poonam");
	//list.add(3.3);
	//list.add(true);
 //	for(int i=0;i<list.size();i++)
      //	{
	           //	System.out.println(list.get(i));
		
	 //}
   Iterator itr= list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	

}
