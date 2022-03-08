package Multithreading;
//performing single task from single thread.
class single extends Thread 
{
	public void run()
	{
		System.out.println("single task");
	}

	public static void main(String[] args) 
	{
		single thread1=new single();
		thread1.start();

	}

}
