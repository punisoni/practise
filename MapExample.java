package collection;
// HashMap is not Synchronized,HashMap works faster.
import java.util.HashMap;
import java.util.Map;

public class MapExample 
{

	public static void main(String[] args) 
	{
		Map<String,String>fruit = new HashMap<String,String>();
		fruit.put("Apple","red");
		fruit.put("Pear","yellow");
		fruit.put("Plum","purple");
		fruit.put("cherry","red");
		for(String key:fruit.keySet())
		{

System.out.println(key+":"+fruit.get(key));
		}
	}

}
