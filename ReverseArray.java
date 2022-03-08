package Assignment;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		int []array=new int[] {60,60,70,80,85};
		System.out.println("original array:");
		for (int p=0;p<array.length;p++)
		{
System .out.println(array[p]+" ");
	}

System.out.println();
System.out.println("Array in reverse order :");
for ( int p=array.length-1;p>=0;p--)
{
	System.out.println(array[p]+"");
}
}
}