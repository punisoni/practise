package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NewTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet<String>tree=new TreeSet<String>();
		tree.add("poonam");
		tree.add ("kajal");
		tree.add("Teju");
		tree.add("soni");
		
Iterator iterator =tree.iterator();
while(iterator.hasNext())
{
	System.out.println(iterator.next().toString());
}

	}

}
