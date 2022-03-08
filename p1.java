package unique;

import java.util.Iterator;
import java.util.Vector;

public class p1 
{

	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		v.add("poonam");
		v.add("vijay");
		v.add("Dabhade");
		v.add("master");
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
			
		}

	}

}
