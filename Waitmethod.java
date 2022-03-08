package Multithreading;

class Earning extends Thread
{
	int total =0;
	public void run() 
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				total=total+100;
				
			}
			this. notify();
			
		}
		}
	}
public class Waitmethod
{
	public static void main(String[] args) 
	{
	Earning obj1=new Earning();
	obj1.start();
	synchronized(obj1)
	{
		try
		{
			obj1.wait();
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("total earning is "+obj1.total);
	}

	}

}
