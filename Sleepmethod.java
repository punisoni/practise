package Multithreading;
class A1 extends Thread
{
public void run()
{
	System.out.println("Thread A Start");
	for(int i=0;i<=5;i++)
	{
		try
		{
			Thread.sleep(200);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("value of i in thread A "+i);
		
	}
	System.out.println("Thread A exit");
}
}
class B1 extends Thread
{
	public void run()
	{
		System.out.println("Thread B start");
		for(int i=0;i<=5;i++)
		{
			System.out.println("value of.i in thread B "+i);
		}
		System.out.println("Thread B exit");
	}
}
public class Sleepmethod 
{

	public static void main(String[] args) 
	{
		A1 a=new A1();
		B1 b=new B1();
		a.start();
		b.start();

	}

}
