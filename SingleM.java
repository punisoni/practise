package Multithreading;
//single task from multiple thread.
class SingleM extends Thread 
{
public void run()
{
	System.out.println("Multiple Thread");
}
	public static void main(String[] args) 
	{
		SingleM thread1=new SingleM();
		thread1.start();
		SingleM thread2=new SingleM();
		thread2.start();

	}

}
