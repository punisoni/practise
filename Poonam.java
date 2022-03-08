package Multithreading;
// performing multiple task from multiple thread.
class MultipleM extends Thread 
{
	public void run()
	{
		System.out.println("Multiple task1");
	}
}
class MultipleM1 extends Thread
{
	public void run()
	{
		System.out.println("Multiple task2");
	}
	}
public class Poonam
{
	public static void main(String[] args)
	{
		MultipleM thread1=new MultipleM();
		thread1.start();
		MultipleM1 thread2=new MultipleM1();
        thread2.start();
	}

}
