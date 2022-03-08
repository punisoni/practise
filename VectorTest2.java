package collection;
//vector ek array hai jo apna size bdata jata hai,
//eske aandar hum jitne chahe utne object element a add kr skte hai.
import java.util.Iterator;
import java.util.Vector;

public class VectorTest2 
{

	public static void main(String[] args) 
	{
		 Vector<String> v = new Vector< String>();
		v.add("p");
		v.add("o");
		v.add("o");
		v.add("n");
		v.add("a");
		v.add("m");
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	}
}

