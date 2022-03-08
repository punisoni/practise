package Assignment2;
//java program to remove duplicate character
import java.util.Arrays;

public class Soni
{

static String removeDuplicate(char str[],int n)

	{
		int index=0;
		for(int i=0;i<n;i++)
		{
		int j;
		for(j=0;j<i;j++)
		{
			if(str[i]==str[j])
			{
				break;
				
			}
		}
		if (j==i)
		{
		str[index++]=str[i]	;
		
		}
		}
return String.valueOf(Arrays.copyOf(str, index));
	}
 public static void main(String[] args)
 {
	 char str[]="welcometowelcome".toCharArray();
	 int n= str.length;
	 System.out.println(removeDuplicate(str,n));
	 
 }

}
