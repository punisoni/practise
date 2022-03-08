package Assignment;

public class SortingArray 
{
//original array
	public static void main(String[] args) 
	{
		int[] array=new int[] {11,10,1,4,5,6};
		int poonam=0;
		System.out.println("element of original array :");
		for(int p=0;p<array.length;p++) 
		{
			
		
		System.out.println(array[p]+"");
}

// sorting array
	for(int p=0;p<array.length;p++)
	{
    for(int m=p+1;m<array.length;m++)
    {
if (array[p]>array[m])

{
	poonam=array[p];
	array[p]=array[m];
	array[m]=poonam;
}
    }   
 
}
	System.out.println();
	System.out.println( "element of array sorted in acending order");
	for (int p=0; p<array.length;p++)
	{
		System.out.println(array[p]+" ");
	}
}
}

