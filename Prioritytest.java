package Multithreading;

public class Prioritytest 
{

	public static void main(String[] args) 
	{
	A a = new A();
	B b = new B();
	
	a.setPriority(5);
	b.setPriority(1);
	a.start();
	b.start();

	}

}
