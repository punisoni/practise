package Assignment3;
//Create an ArrayList which will be able to store only Strings. 
//Create a printAll method which will print all the elements 
//using an Iterator.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program3
{

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("poonam 1");
		list.add("soni 2");
		list.add("Dabhade 3");
		list.add("manisha 4");
		
		printAll(list);
}

public static void printAll(List<String> list)
{
Iterator<String> it = list.iterator();
		
while (it.hasNext())
System.out.println(it.next());
	}
}


	
