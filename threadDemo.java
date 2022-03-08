package Multithreading;
//Multiple task from Multiple thread.
class Even extends Thread
{  
	public Thread e;

	public void run()
	{	
for(int i=1;i<11;i++)
{
	if( i%2==0)
	{
	System.out.println("enter even number are" +i);	
	}
}
	}
}
class odd extends Thread
{
	public Thread o;

	public void run()
	{
		for(int i=1;i<10;i++)
		{
			if(i%2==1)
			{
				System.out.println("enter odd number are" +i);
			}
		}
	
	}
}
 public class threadDemo
 {
	public static void main(String[] args) 
	{
		Even thread1=new Even();
		odd thread2=new odd();
		thread1.e=new Thread(thread1);
		thread2.o=new Thread(thread2);
		
		thread1.start();
		thread2.start();

	}

}
