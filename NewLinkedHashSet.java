package collection;

import java.util.LinkedHashSet;

public class NewLinkedHashSet 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String>dhs=new LinkedHashSet<String>();
		dhs.add(new String("one"));
		dhs.add(new String("Two"));
		dhs.add(new String("Three"));
		
		Object array[]=dhs.toArray();
		
for(int x=0;x<3;x++)
{
	System.out.println(array[x]);
}

	}

}
