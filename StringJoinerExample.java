package StringBufferandBuilder;

import java.util.StringJoiner;

public class StringJoinerExample 
{

	public static void main(String[] args)
	{
	StringJoiner joinNames=new StringJoiner(",");
	joinNames.add("poonam");
	joinNames.add("supriya");
	joinNames.add("teju");
	joinNames.add("surekha");
	joinNames.add("jagu");
	joinNames.add("Aashu");
	joinNames.add("Madhu");
	joinNames.add("shivani");
	joinNames.add("pooja");
	joinNames.add("Aamri");
	joinNames.add("sonal");

System.out.println(joinNames);

		
	}

}
