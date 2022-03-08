package Assignment;
// second largest number in an Array//
public class SLvalueArray
{
	public static int getSLvalueArray(int[]a,int total) 
	{
		

	int poonam;
	
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
			if (a[i]>a[j])
			{
				poonam=a[i];
				a[i]=a[j];
				a[j]=poonam;
				
			}
		}

	}
	return a[total-2];
	
	}
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int b[]= {55,66,77,88,99,98};
		System.out.println("SLvalueArray: "+getSLvalueArray(a,3));

		System.out.println("SLvalueArray: "+getSLvalueArray(b,6));

		
			}
	
	}




