package Multithreading;
//Extending thread class.
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("from A,i="+i);
			}
		System.out.println("Exit from A");
	}
	}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("from B,i="+i);
			}
		System.out.println("Exit from B");
	
	}
}
public class Threadcreation 
{
public static void main(String[] args)
{
A A1=new A();
B B1=new B();
A1.start();
B1.start();
	}

}
