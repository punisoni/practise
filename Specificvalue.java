package Assignment;

public class Specificvalue 
{

	public static void main(String[] args) 
	{
		
		int []intarray=new int[] {10,20,30,40,50};
		boolean poonam=false;
		int searchedvalue=50;
		for (int x: intarray)
		{
			if(x==searchedvalue)
			{
				poonam=true;
				break;
				
				
			}
				
			
}
System.out.println(poonam);
}
}