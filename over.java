package DoselectAssi;

class Source
{
public static String show()
{
	return"parent";
}
}
public class over extends Source
{
	public static String show()
	
	{
		System.out.println(Source.show());
		return "child";
		
	}
	public static void main(String[] args) 
	{
	System.out.println(over.show());

	}

}
