package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Emp 
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Emp  (int id, String name, String address, Double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}


	public String toString() 
	{
		return "Employee [id="+ id +", name="+ name +", address="+ address +", salary=" + salary + "]";
	}

}


public class Program5
{

	public static void main(String[] args) 
	{
		List<Emp > list = new ArrayList<>();
		
		list.add(new Emp(101, "poonam", "123 , India", 20000.0));
		list.add(new Emp(102, "teju", "234 , India", 30000.0));
		list.add(new Emp(103, "sonal", "345 , India", 25000.0));
		list.add(new Emp(104, "sup", "456 , India", 40000.0));
		
		Iterator<Emp  > it = list.iterator();
		int searchId = 101;
	
		while (it.hasNext()) {
			Emp  emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}

