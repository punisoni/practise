package Assignment;

public class Arrayaverage 
{
	public static void main(String[] args)
	{
		int p; 
		int sum=0,Avg=0;
		int a[]= {40,50,60};
		for (p=0;p<a.length;p++)
		{
			sum+=a[p];
			
			
		}
	Avg=sum/a.length;
	System.out.println("Average :  "+Avg);

	}

}
