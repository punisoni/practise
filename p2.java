package unique;
//enumeration is a data type that contains fixed set of constant
import java.util.Enumeration;
import java.util.Vector;

public class p2 {

	public static void main(String[] args)
	{
		Vector< String> v=new Vector<String>();
		v.add("e");
		v.add("m");
		v.add("o");
		v.add("t");
		v.add("i");
		v.add("o");
		v.add("n");
		v.add("a");
		v.add("l");
		Enumeration e= v.elements();
		while(e.hasMoreElements())
		{
		System.out.println(e.nextElement()+" ");
		}
	}
}
