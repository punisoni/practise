package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NewHashSet {

	public static void main(String[] args) 
	{
Set hash=new HashSet();
hash.add("d");
hash.add("b");
hash.add("h");
hash.add("a");
hash.add("d");
hash.add("e");

Iterator iterator=hash.iterator();
while( iterator.hasNext())
{
System.out.println(iterator.next());

}
	}

}
